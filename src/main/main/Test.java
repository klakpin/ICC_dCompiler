package main;

import compiler.ArgumentParser;
import compiler.antlr.DBaseVisitor;
import compiler.antlr.DLexer;
import compiler.antlr.DParser;
import implementations.RuntimeImpl;
import org.runtime.CharStream;
import org.runtime.CharStreams;
import org.runtime.CommonTokenStream;
import org.runtime.tree.ParseTree;

public class Test {

    public static void main(String[] args) throws Exception {

        ArgumentParser parser = new ArgumentParser();
        parser.parseArguments(args);


        antlrTesting();
    }


    public static void antlrTesting() throws Exception {

        CharStream stream = CharStreams.fromFileName("input");
        DLexer lexer = new DLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DParser parser = new DParser(tokens);

        ParseTree tree = parser.compilation_unit();

        DBaseVisitor visitor = new DBaseVisitor<>();

        System.out.println("--------------------------------------------------");
        System.out.println("run result is: ");
        RuntimeImpl r = new RuntimeImpl();
        r.run();

        System.out.println("--------------------------------------------------");
        System.out.println("Next will be result of tree visitors");
        System.out.println("--------------------------------------------------");
        tree.accept(visitor);
        System.out.println("--------------------------------------------------");


    }
}
