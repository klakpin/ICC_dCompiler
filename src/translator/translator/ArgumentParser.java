package translator;

public class ArgumentParser {

    public String inputFile;

    public void parseArguments(String[] args) throws Exception {

        for (int i = 0; i < args.length; i++) {

            if (args[i].charAt(0) == '-') {
                switch (args[i]) {
                }
            } else {
                inputFile = args[i];
            }

        }
    }
}
