package translator.codegen;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CodeGeneratorToFile implements CodeGenerator {


    int startLine = 280;
    Map<Integer, Integer> codeMapping = new TreeMap<>();

    RandomAccessFile outputFile;

    String output = "src/runtime/implementations/Output.java";

    public String mapping = new String("mapping");

    public void setOutput(String txt) {
        output = txt;
    }

    public CodeGeneratorToFile() throws IOException {
        File f = new File(output);
        Files.deleteIfExists(f.toPath());
        f.createNewFile();
        outputFile = new RandomAccessFile(output, "rw");
    }

    @Override
    public void start() throws IOException {
        outputFile.writeBytes(RuntimeTemplate.getPart1());
    }

    @Override
    public void add(String string) {
        try {
            outputFile.writeBytes(string + "\n");
            startLine++;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error while writing file");
        }
    }

    @Override
    public void add(int srcLine, String string) {
        try {
            outputFile.writeBytes(string + "\n");
            startLine++;
            codeMapping.put(startLine, srcLine);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error while writing file");
        }
    }

    @Override
    public void end() throws IOException {
        outputFile.writeBytes(RuntimeTemplate.getPart2());
        outputFile.close();

        printMapping();
    }

    public void printMapping() throws IOException {
        File mappingFile = new File(this.mapping);

        Files.deleteIfExists(mappingFile.toPath());
        mappingFile.createNewFile();
        RandomAccessFile outputRaf = new RandomAccessFile(mappingFile, "rw");

        for (Map.Entry<Integer, Integer> entry : codeMapping.entrySet()) {
            outputRaf.writeBytes(entry.getKey() + ":" + entry.getValue() + "\n");
        }
    }
}
