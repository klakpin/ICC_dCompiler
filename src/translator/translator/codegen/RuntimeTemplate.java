package translator.codegen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RuntimeTemplate {

    public String fileName = "implementations/RuntimeImpl.java";

    public String getPart1() throws IOException {

        StringBuilder result = new StringBuilder();

        result.append("package implementations;\n" + "\n" +
                "import interfaces.*;\n" +
                "import interfaces.Runtime;\n" +
                "import interfaces.Runnable;\n" +
                "import types.*;\n" +
                "import java.util.Scanner;\n" +
                "public class Output implements Runtime {\n");

        String line;


        try {
            FileReader fileReader =
                    new FileReader(fileName);

            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            line = bufferedReader.readLine();
            while (!line.equals("public class RuntimeImpl implements Runtime {")) {
                line = bufferedReader.readLine();

            }

            while ((line = bufferedReader.readLine()) != null && !line.equals("    public void run() throws Exception {")) {
                result.append(line + "\n");
            }
            result.append(line + "\n");

            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
            ex.printStackTrace();
        }

        return result.toString();
    }

    public String getPart2() {
        String part2 = "}\n" +
                "}";
        return part2;
    }

}
