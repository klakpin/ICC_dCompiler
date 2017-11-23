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
        }
    }
}
