package com.javanibble.maven.examples;

public class HelloWorld {

    public static void main( String[] args ) {

        if (args.length == 0) {
            System.out.println(Message.personal_message);
        } else {
            System.out.print("Hello ");
            for (String arg : args) {
                System.out.print(arg + "! \n");
            }
        }
    }

}
