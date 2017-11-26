package translator;

import translator.codegen.CodeGenerator;
import translator.runtime.CharStream;
import translator.runtime.CharStreams;
import translator.runtime.CommonTokenStream;
import translator.runtime.tree.ParseTree;
import translator.antlr.DBaseVisitor;
import translator.antlr.DLexer;
import translator.antlr.DParser;
import translator.codegen.CodeGeneratorToFile;

public class Translator {

    ArgumentParser args;

    CodeGeneratorToFile gen;

    public Translator(ArgumentParser args, CodeGeneratorToFile codegen) throws Exception {
        this.args = args;
        gen = codegen;
    }

    public void translate() throws Exception {

        CharStream stream = CharStreams.fromFileName(args.inputFile);

        DLexer lexer = new DLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DParser parser = new DParser(tokens);
        ParseTree tree = parser.compilation_unit();

        gen.start();
        DBaseVisitor visitor = new DBaseVisitor<>(gen);
        tree.accept(visitor);
        gen.end();

    }
}
