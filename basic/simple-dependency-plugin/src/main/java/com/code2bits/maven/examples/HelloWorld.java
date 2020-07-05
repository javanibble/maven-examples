package com.code2bits.maven.examples;


import org.apache.commons.lang3.ArrayUtils;


public class HelloWorld {

    public static void main( String[] args ) {

        if (ArrayUtils.isEmpty(args)) {
            System.out.println("Hello World!");
        } else {
            for (String arg : args) {
                System.out.println("Hello " + arg + "!");
            }
        }
    }

}
