package translator;

public class ArgumentParser {

    public String inputFile;
    public String outputFile = "output.jar";
    public boolean verbose = false;
    public String outputClassPath = "implementations/Output.java";
    public String outputMappingFilePath = "mapping";
    public void parseArguments(String[] args) throws Exception {

        for (int i = 0; i < args.length; i++) {

            if (args[i].charAt(0) == '-') {
                switch (args[i]) {
                    case "-o":
                        i++;
                        outputFile = args[i];
                        break;
                    case "-v":
                        verbose = true;
                        break;
                }
            } else {
                inputFile = args[i];
            }
        }
    }
}
