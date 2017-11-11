package compiler;

public class ArgumentParser {


    public String outputJava = "output.java";
    public String outputCompD = "output.dc";

    public String outputFile = "output";

    public void parseArguments(String[] args) throws Exception {

        for (int i = 0; i < args.length; i++) {

            if (args[i].charAt(0) == '-') {
                switch (args[i]) {
                    case "-java":
                        outputJava = args[i + 1];
                        break;
                    case "-dc":
                        outputCompD = args[i + 1];
                        break;
                    case "-o":
                        outputFile = args[i + 1];
                        break;
                    default:
                        throw new Exception("Wrong argument: " + args[i]);
                }
                i++;
            }

        }
    }
}
