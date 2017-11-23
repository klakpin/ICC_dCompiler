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
               if (str.substring(0,str.indexOf(':')).contains(lineNumber.toString())){
                   System.out.println("Attention! Error in "+str.substring(str.indexOf(':')+1,str.length())+" line.");
                   flag=true;
               }
                str=scanner.nextLine();
//                System.out.println("STR="+str);
            }
            e.printStackTrace();
//            System.out.println(e.getStackTrace()[1].getLineNumber());
//            System.out.println(e.getMessage());
//            e.getStackTrace().toString();
        }
    }
}
