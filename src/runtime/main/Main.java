package main;


import implementations.Output;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Entry point in compiled program
 */
public class Main {


    public static void main(String[] args) throws Exception {

        Output run = new Output();
        try {
            run.run();
        } catch (Exception e) {
            Integer lineNumber = e.getStackTrace()[1].getLineNumber();
            for (StackTraceElement element : e.getStackTrace()) {
                if (element.getLineNumber() > 344) {
                    lineNumber = element.getLineNumber();
                    break;
                }
            }

            InputStream in = Output.class.getClassLoader().getResourceAsStream("/mapping");
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String str;
            boolean flag = false;
            while (((str = reader.readLine()) != null) && !flag) {
                if (str.substring(0, str.indexOf(':')).contains(lineNumber.toString())) {
                    System.out.println("Attention! Error in " + str.substring(str.indexOf(':') + 1, str.length()) + " line.");
                    System.out.println("Exception: " + e.getMessage());
                    flag = true;
                }
            }
        }
    }
}
