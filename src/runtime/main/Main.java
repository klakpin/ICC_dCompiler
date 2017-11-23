package main;


import implementations.Output;

import java.io.File;
import java.util.Scanner;


/**
 * Entry point in compiled program
 */
public class Main {


    public static void main(String[] args) throws Exception {

        Output run = new Output();
        try {
            run.run();
        } catch (Exception e) {
            Scanner scanner = new Scanner(new File("mapping"));
            String str=scanner.nextLine();
            Integer lineNumber=e.getStackTrace()[1].getLineNumber();
            boolean flag=false;
            while(scanner.hasNext()&&!flag){
               if (str.contains(lineNumber.toString())){
                   System.out.println(lineNumber.toString().length());
                   System.out.println("Attention! Error in "+str.substring(lineNumber.toString().length()+1)+" line.");
                   flag=true;
               }
                str=scanner.nextLine();
//                System.out.println("STR="+str);
            }
            System.out.println("Result"+str);
            e.printStackTrace();
            System.out.println(e.getStackTrace()[1].getLineNumber());
            System.out.println(e.getMessage());
            e.getStackTrace().toString();
        }
    }
}
