package main;

import grammar.DBaseVisitor;
import grammar.DLexer;
import grammar.DParser;
import org.runtime.*;
import org.runtime.tree.*;
import compiler.RuntimeImpl;

import java.io.IOException;

public class Test {

    public static void checkEuclidus(int a, int b) throws Exception {
        RuntimeImpl runtime = new RuntimeImpl();


        if (runtime.euclidus(a, b) != gcd(a, b)) {
            throw new Exception("Euclidus don't work");
        } else {
            System.out.println("Euclidus algorithm with input " + a + " " + b + " test passed!");
        }
    }

    public static void main(String[] args) throws Exception {

        checkEuclidus(1, 10);
        checkEuclidus(5, 10);
        checkEuclidus(24, 24);
        checkEuclidus(0, 0);
        checkEuclidus(5, 10);


        int a = 25;
        st:
        {
            a++;
            System.out.println("pivas");
            if (a < 27) {
                break st;
            }
        }
    }

    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static void antlrTesting(String[] args) throws IOException {

        CharStream stream = CharStreams.fromFileName("input");
        DLexer lexer = new DLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DParser parser = new DParser(tokens);

        ParseTree tree = parser.compilation_unit();

//        System.out.println(tree.toStringTree(parser));

        DBaseVisitor visitor = new DBaseVisitor<>();

//        tree.accept(visitor);

    }
}
