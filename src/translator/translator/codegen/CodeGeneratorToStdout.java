package translator.codegen;

import java.io.IOException;

/**
 * Code generator that prints result code into stdout
 */
public class CodeGeneratorToStdout implements CodeGenerator {

    @Override
    public void start() throws IOException {
        System.out.println("---------------------------------------------------");
        System.out.println("--  --  --  --  --  --  --  --  --  --  --  --  --");
        System.out.println("Code generation results:");
    }

    @Override
    public void add(int srcLine, String string) {
        System.out.println(string);
    }

    @Override
    public void end() throws IOException {
        System.out.println("---------------------------------------------------");
    }
}
