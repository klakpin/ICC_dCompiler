package main;

import Interfaces.*;
import Interfaces.Runnable;
import Interfaces.Runtime;
import implementations.*;
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
import types.*;

import javax.tools.*;
import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;

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
        System.out.println("3 - try to build jar executable");
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

        // Add the main class
        addClass(Main.class, jarOutputStream);
        addClass(Cortege.class, jarOutputStream);
        addClass(Function.class, jarOutputStream);
        addClass(Structure.class, jarOutputStream);
        addClass(Text.class, jarOutputStream);
        addClass(TypeIndicator.class, jarOutputStream);
        addClass(CallStackImpl.class, jarOutputStream);
        addClass(OperationsImpl.class, jarOutputStream);
        addClass(Output.class, jarOutputStream);
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

        jarOutputStream.close();
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

    private static void addClass(Class c, JarOutputStream jarOutputStream) throws IOException
    {
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
