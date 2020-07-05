package com.javanibble.maven.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        if (args.length == 0) {
            System.out.println("Hello World!");
        } else {
            System.out.print("Hello ");
            for (String arg : args) {
                System.out.print(arg + "! \n");
            }
        }
    }
}
