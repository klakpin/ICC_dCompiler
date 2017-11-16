package translator.codegen;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;

public class CodeGeneratorToFile implements CodeGenerator {


    RandomAccessFile file;
    String output = "src/runtime/implementations/Output.java";

    public void setOutput(String txt) {
        output = txt;
    }

    public CodeGeneratorToFile() throws IOException {
        File f = new File(output);
        Files.deleteIfExists(f.toPath());
        f.createNewFile();
        file = new RandomAccessFile(output, "rw");
    }

    @Override
    public void start() throws IOException {
        file.writeBytes(RuntimeTemplate.getPart1());
    }

    @Override
    public void add(String string) {
        try {
            file.writeBytes(string + "\n");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error while writing file");
        }
    }

    @Override
    public void end() throws IOException {
        file.writeBytes(RuntimeTemplate.getPart2());
    }
}
