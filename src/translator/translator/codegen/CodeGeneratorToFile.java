package translator.codegen;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.util.Map;
import java.util.TreeMap;

public class CodeGeneratorToFile implements CodeGenerator {


    private int startLine = 344;

    private Map<Integer, Integer> codeMapping = new TreeMap<>();

    private RandomAccessFile outputFile;

    private String outputPath;

    private String mappingFilePath;

    private RuntimeTemplate template = new RuntimeTemplate();

    public void setTemplatePath(String string) {
        template.fileName = string;
    }

    public CodeGeneratorToFile(String outputPath, String mappingFilePath) throws Exception {
        this.outputPath = outputPath;
        this.mappingFilePath = mappingFilePath;

        File f = new File(outputPath);

        Files.deleteIfExists(f.toPath());

        if (!f.createNewFile()) {
            throw new Exception("Cannot create outputPath file with destination: " + outputPath);
        }

        outputFile = new RandomAccessFile(outputPath, "rw");
    }

    @Override
    public void start() throws IOException {
        outputFile.writeBytes(template.getPart1());
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
        outputFile.writeBytes(template.getPart2());
        outputFile.close();
    }

    public void createMappingFile() throws IOException {
        File mappingFile = new File(this.mappingFilePath);
        Files.deleteIfExists(mappingFile.toPath());

        if (!mappingFile.createNewFile()) {
            throw new IOException("Cannot create mapping file to path " + mappingFilePath);
        }

        RandomAccessFile outputRaf = new RandomAccessFile(mappingFile, "rw");

        for (Map.Entry<Integer, Integer> entry : codeMapping.entrySet()) {
            outputRaf.writeBytes(entry.getKey() + ":" + entry.getValue() + "\n");
        }
    }
}
