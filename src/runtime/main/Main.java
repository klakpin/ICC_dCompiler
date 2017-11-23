package main;


import implementations.Output;

/**
 * Entry point in compiled program
 */
public class Main {


    public static void main(String[] args) throws Exception {

        Output run = new Output();
        try {
            run.run();
        } catch (Exception e) {
            int compiledLine = e.getStackTrace()[e.getStackTrace().length].getLineNumber();
            System.out.println("Error at line " + compiledLine);
            System.out.println(e.getMessage());
        }
    }
}
