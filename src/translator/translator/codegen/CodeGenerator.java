package translator.codegen;

import java.io.IOException;

public interface CodeGenerator {
    void start() throws IOException;

    void add(String string);

    void end() throws IOException;
}
