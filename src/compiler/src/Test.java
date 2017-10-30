package src;

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

    }
}
