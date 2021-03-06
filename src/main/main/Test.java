package main;

import interfaces.*;
import interfaces.Runnable;
import interfaces.Runtime;
import implementations.*;
import net.openhft.compiler.CompilerUtils;
import translator.codegen.CodeGeneratorToCodeBuffer;
import translator.codegen.CodeGeneratorToFile;
import translator.runtime.CharStream;
import translator.runtime.CharStreams;
import translator.runtime.CommonTokenStream;
import translator.runtime.tree.ParseTree;
import translator.ArgumentParser;
import translator.Translator;
import translator.antlr.DBaseVisitor;
import translator.antlr.DLexer;
import translator.antlr.DParser;
import translator.codegen.CodeGeneratorToStdout;
import types.*;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;
import java.util.Scanner;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;

/**
 * Class that can be used for running in IDE
 */
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
        System.out.println("2 - run file that I've created in step 1. Don't forget to rebuild the project!");
        System.out.println("3 - try to build jar executable");
        System.out.println("Your answer: ");


        Scanner input = new Scanner(System.in);

        switch (input.next()) {
            case "0":
                try {
                    antlrTesting();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "1":
                createOutput(parser);
                break;
            case "2":
                runfile();
                break;
            case "3":
                compilationTest();
                break;
            default:
                System.out.println("Don't understand, goodbye.");
                break;
        }

        input.close();
    }

    public static void runfile() throws Exception {
        Output output = new Output();
        output.run();
    }

    /**
     * Creates class file
     *
     * @throws Exception
     */
    public static void compilationTest() throws Exception {
        Manifest manifest = new Manifest();
        manifest.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION, "1.0");
        manifest.getMainAttributes().put(Attributes.Name.MAIN_CLASS, Main.class.getName());
        JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream("y.jar"), manifest);

        String fileToCompile = "src/runtime/main/Main.java";
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int compilationResult = compiler.run(null, null, null, fileToCompile);
        if (compilationResult == 0) {
            System.out.println("Compilation is successful");
        } else {
            System.out.println("Compilation Failed");
        }

        // Add the main class
        addClass(Main.class, jarOutputStream);
        addClass(Cortege.class, jarOutputStream);
        addClass(Function.class, jarOutputStream);
        addClass(Structure.class, jarOutputStream);
        addClass(Text.class, jarOutputStream);
        addClass(TypeIndicator.class, jarOutputStream);
        addClass(CallStackImpl.class, jarOutputStream);
        addClass(OperationsImpl.class, jarOutputStream);
//        addClass(Output.class, jarOutputStream);
        addClass(RuntimeImpl.class, jarOutputStream);
        addClass(ScopeStackImpl.class, jarOutputStream);
        addClass(SymTableImpl.class, jarOutputStream);
        addClass(StackImpl.class, jarOutputStream);

        addClass(CallStack.class, jarOutputStream);
        addClass(InputOutput.class, jarOutputStream);
        addClass(Operations.class, jarOutputStream);
        addClass(Runnable.class, jarOutputStream);
        addClass(Runtime.class, jarOutputStream);
        addClass(ScopeStack.class, jarOutputStream);
        addClass(Stack.class, jarOutputStream);
        addClass(SymTable.class, jarOutputStream);


        CharStream stream = CharStreams.fromFileName("input.dlan");
        DLexer lexer = new DLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DParser parser = new DParser(tokens);
        ParseTree tree = parser.compilation_unit();

        CodeGeneratorToCodeBuffer generator = new CodeGeneratorToCodeBuffer();
        generator.start();
        DBaseVisitor visitor = new DBaseVisitor<>(generator);
        tree.accept(visitor);
        generator.end();

        String className = "implementations.Output";
        String javaCode = generator.getResultClass();
        Class aClass = CompilerUtils.CACHED_COMPILER.loadFromJava(className, javaCode);
        Output output = (Output) aClass.newInstance();
        System.out.println("------------------------------------");
        System.out.println("Result of run of implemented class");
        output.run();
        System.out.println("------------------------------------");

        String path = aClass.getName().replace('.', '/') + ".class";
        jarOutputStream.putNextEntry(new JarEntry(path));
        String path2 = "src/runtime/implementations/Output.class";
        jarOutputStream.write(Util.toByteArray(aClass.getClassLoader().getResourceAsStream(path2)));
        jarOutputStream.closeEntry();

//        File file = new File("mapping");
//        FileInputStream fis = new FileInputStream(file);

//        jarOutputStream.putNextEntry(new JarEntry("mapping"));
//        jarOutputStream.write(Util.toByteArray(fis));
        jarOutputStream.closeEntry();

        jarOutputStream.close();
    }

    public static void createOutput(ArgumentParser parser) throws Exception {
        try {
            CodeGeneratorToFile generator = new CodeGeneratorToFile("src/runtime/implementations/Output.java", "mapping");
            generator.setTemplatePath("src/runtime/implementations/RuntimeImpl.java");
            Translator translator = new Translator(parser, generator);
            translator.translate();
        } catch (Exception e) {
            CodeGeneratorToFile generator = new CodeGeneratorToFile("src/runtime/implementations/Output.java", "mapping");
            generator.setTemplatePath("src/runtime/implementations/RuntimeImpl.java");
            generator.start();
            generator.end();

        }
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

    private static void addClass(Class c, JarOutputStream jarOutputStream) throws IOException {
        String path = c.getName().replace('.', '/') + ".class";
        jarOutputStream.putNextEntry(new JarEntry(path));
        jarOutputStream.write(Util.toByteArray(c.getClassLoader().getResourceAsStream(path)));
        jarOutputStream.closeEntry();
    }
}

class Util {

    public static byte[] toByteArray(InputStream in) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[0x1000];
        while (true) {
            int r = in.read(buf);
            if (r == -1) {
                break;
            }
            out.write(buf, 0, r);
        }
        return out.toByteArray();
    }
}
