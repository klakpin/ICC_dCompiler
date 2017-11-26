package translator.codegen;

import java.io.IOException;

/**
 * Class used for code generation
 */
public interface CodeGenerator {

    void start() throws IOException;

    void add(int srcLine, String string);

    void end() throws IOException;
}
