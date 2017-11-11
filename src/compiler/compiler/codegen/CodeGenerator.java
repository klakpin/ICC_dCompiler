package compiler.codegen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;

public class CodeGenerator {


    RandomAccessFile file;
    String output = "output.dlcomp";

    public CodeGenerator() throws IOException {

        File f = new File(output);
        Files.deleteIfExists(f.toPath());
        f = null;

        file = new RandomAccessFile(output, "rw");


    }

    public void add(String string) {

    }
}
