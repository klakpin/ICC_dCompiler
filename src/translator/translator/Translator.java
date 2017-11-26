package translator;

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

    public Translator(ArgumentParser args) throws Exception {
        this.args = args;
    }

    public void translate() throws Exception {

        CharStream stream = CharStreams.fromFileName(args.inputFile);

        DLexer lexer = new DLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DParser parser = new DParser(tokens);
        ParseTree tree = parser.compilation_unit();


        CodeGeneratorToFile gen = new CodeGeneratorToFile("src/runtime/implementations/Output.java", "mapping");
        gen.start();
        DBaseVisitor visitor = new DBaseVisitor<>(gen);
        tree.accept(visitor);
        gen.end();

    }

}
