package main;

import Interfaces.Runtime;
import implementations.Output;
import org.runtime.CharStream;
import org.runtime.CharStreams;
import org.runtime.CommonTokenStream;
import org.runtime.tree.ParseTree;
import translator.ArgumentParser;
import translator.Translator;
import translator.antlr.DBaseVisitor;
import translator.antlr.DLexer;
import translator.antlr.DParser;
import translator.codegen.CodeGeneratorToStdout;

import javax.tools.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Test {

    public static void main(String[] args) throws Exception {

        ArgumentParser parser = new ArgumentParser();
        parser.parseArguments(args);

        System.out.println("----------------------------------------------");
        System.out.println("Welcome to compiler 3000!");
        System.out.println("----------------------------------------------");
        System.out.println("What do you want? Chose wisely.");
        System.out.println("0 - just look what will be result of translation of input file");
        System.out.println("1 - create runnable java file from input file");
        System.out.println("2 - run file that I've created in step 1");
        System.out.println("Your answer: ");

        Scanner input = new Scanner(System.in);

        switch (input.next()) {
            case "0":
                antlrTesting();
                break;
            case "1":
                createOutput(parser);
                break;
            case "2":
                compilationTest();
                break;
            default:
                System.out.println("Don't understand, goodbye.");
                break;
        }

        input.close();
    }


    public static void createOutput(ArgumentParser parser) throws Exception {
        Translator translator = new Translator(parser);
        translator.translate();

    }


    public static void antlrTesting() throws Exception {
        CharStream stream = CharStreams.fromFileName("input.dlan");
        DLexer lexer = new DLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DParser parser = new DParser(tokens);
        ParseTree tree = parser.compilation_unit();
        DBaseVisitor visitor = new DBaseVisitor<>(new CodeGeneratorToStdout());
        tree.accept(visitor);

    }

    /**
     * Creates class file
     *
     * @throws Exception
     */
    public static void compilationTest() throws Exception {

        try {
            File helloWorldJava = new File("src/runtime/implementations/Output.java");

            /** Compilation Requirements *********************************************************************************************/
            DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnostics, null, null);

            // This sets up the class path that the compiler will use.
            // I've added the .jar file that contains the DoStuff interface within in it...
            List<String> optionList = new ArrayList<String>();
            optionList.add("-d");
            optionList.add("gen");

            Iterable<? extends JavaFileObject> compilationUnit
                    = fileManager.getJavaFileObjectsFromFiles(Arrays.asList(helloWorldJava));
            JavaCompiler.CompilationTask task = compiler.getTask(
                    null,
                    fileManager,
                    diagnostics,
                    optionList,
                    null,
                    compilationUnit);
            /********************************************************************************************* Compilation Requirements **/
            if (task.call()) {
                /** Load and execute *************************************************************************************************/
                // Create a new custom class loader, pointing to the directory that contains the compiled
                // classes, this should point to the top of the package structure!
                URLClassLoader classLoader = new URLClassLoader(new URL[]{new File("./gen;").toURI().toURL()});
                // Load the class from the classloader by name....
                Class<?> loadedClass = classLoader.loadClass("implementations.Output");
                // Create a new instance...
                Object obj = loadedClass.newInstance();

                if (obj instanceof Runtime) {
                    Runtime stuffToDo = (Runtime) obj;

                    try {
                        stuffToDo.run();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                /************************************************************************************************* Load and execute **/
            } else {
                for (Diagnostic<? extends JavaFileObject> diagnostic : diagnostics.getDiagnostics()) {
                    System.out.format("Error on line %d in %s%n",
                            diagnostic.getLineNumber(),
                            diagnostic.getSource().toUri());
                }
            }
            fileManager.close();
        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException exp) {
            exp.printStackTrace();
        }
    }
}
