package src;

import compiler.ScopeStack;
import compiler.ScopeStackImpl;
import grammar.DBaseVisitor;
import grammar.DLexer;
import grammar.DParser;
import org.runtime.*;
import org.runtime.tree.*;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        CharStream stream = CharStreams.fromFileName("input");
        DLexer lexer = new DLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DParser parser = new DParser(tokens);

        ParseTree tree = parser.compilation_unit();

        System.out.println(tree.toStringTree(parser));

        DBaseVisitor visitor = new DBaseVisitor<>();

        tree.accept(visitor);

        checkScope();

    }

    public static void checkScope() {
        ScopeStack stack = new ScopeStackImpl();

        stack.newScope();

        stack.add("a");                     // var a
        stack.assign("a", 25); // a := 25


        stack.newScope();                   // new scope created
        stack.add("b");                     // var b;
        stack.assign("b", stack.get("a"));
        stack.assign("b", 33);

        stack.newScope();                   // new scope created
        stack.add("c");                     // var b;
        stack.assign("c", stack.get("b"));

    }
}
