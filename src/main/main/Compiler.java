package main;

import translator.ArgumentParser;
import translator.antlr.DBaseVisitor;
import translator.antlr.DLexer;
import translator.antlr.DParser;
import translator.codegen.CodeGeneratorToFile;
import translator.runtime.CharStream;
import translator.runtime.CharStreams;
import translator.runtime.CommonTokenStream;
import translator.runtime.tree.ParseTree;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Compiler {

    public static void main(String[] args) throws Exception {

        ArgumentParser arguments = new ArgumentParser();
        arguments.parseArguments(args);

        System.out.println("----------------------------------------------");
        System.out.println("        Welcome to compiler 3000!");
        System.out.println("----------------------------------------------\n");
        System.out.println("Compilation started...");

        int errorCount = 0;

        try {
            compile(arguments);
        } catch (Exception e) {
            errorCount++;
            System.out.println("Compilation error!");
            System.out.println("Message: " + e.getMessage());

            if (arguments.verbose) {
                for (int i = 0; i < e.getStackTrace().length - 1; i++) {
                    System.out.println(e.getStackTrace()[i]);
                }
            }
        }

        if (errorCount == 0) {
            System.out.println("Compilation successful!");
        }
    }

    private static void compile(ArgumentParser arguments) throws Exception {

        CharStream stream = CharStreams.fromFileName(arguments.inputFile);

        DLexer lexer = new DLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DParser parser = new DParser(tokens);
        ParseTree tree = parser.compilation_unit();


        String outputPath = arguments.outputClassPath;
        String mappingPath = arguments.outputMappingFilePath;
        CodeGeneratorToFile codeGenerator = new CodeGeneratorToFile(outputPath, mappingPath);

        DBaseVisitor visitor = new DBaseVisitor<>(codeGenerator);
        codeGenerator.start();
        tree.accept(visitor);
        codeGenerator.end();
        codeGenerator.createMappingFile();

        callCompiler(arguments);
    }


    private static void callCompiler(ArgumentParser arguments) throws Exception {

        Process javac = Runtime.getRuntime().exec("javac main/Main.java");

        if (javac.waitFor() != 0) {
            throw new Exception("Cannot compile generated code.");
        }

        Path fileToDeletePath = Paths.get(arguments.outputFile);
        Files.deleteIfExists(fileToDeletePath);

        Process jar = Runtime.getRuntime().exec("jar cvfe output.jar main.Main implementations/ interfaces/ main/ types/ mapping");

        if (jar.waitFor() != 0) {
            throw new Exception("Cannot make executable jar from generated class.");
        }
    }
}
