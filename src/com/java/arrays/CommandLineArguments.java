package com.java.arrays;

public class CommandLineArguments {

    public static void main(String[] args) {
        int length = args.length;
        int sum = 0;

        if (length <2 || length >3) {
            System.out.println("Array length is:"+length+
                    ", Required minimum 2 arguments and maximum 3 arguments to perform addition");
        }
        else {
            for (String n : args){
                sum = sum + Integer.parseInt(n);
            }
            System.out.println("Sum:"+sum);
        }
    }
}
