package translator.codegen;

import java.io.IOException;

public class CodeGeneratorToStdout implements CodeGenerator {

    @Override
    public void start() throws IOException {
        System.out.println("---------------------------------------------------");
        System.out.println("--  --  --  --  --  --  --  --  --  --  --  --  --");
        System.out.println("Code generation results:");
    }

    @Override
    public void add(String string) {
        System.out.println(string);
    }

    @Override
    public void end() throws IOException {
        System.out.println("---------------------------------------------------");
    }
}
