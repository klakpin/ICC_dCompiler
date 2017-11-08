package main;

import compiler.antlr.DBaseVisitor;
import compiler.antlr.DLexer;
import compiler.antlr.DParser;
import org.runtime.*;
import org.runtime.tree.*;
import compiler.RuntimeImpl;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws Exception {

        antlrTesting();
    }


    public static void antlrTesting() throws IOException {

        CharStream stream = CharStreams.fromFileName("input");
        DLexer lexer = new DLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DParser parser = new DParser(tokens);

        ParseTree tree = parser.compilation_unit();

        System.out.println(tree.toStringTree(parser));

        DBaseVisitor visitor = new DBaseVisitor<>();

        tree.accept(visitor);

    }
}
