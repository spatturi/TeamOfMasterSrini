package com.java.basics;

import java.util.Scanner;

/**
 * This class accepts number from keyboard and prints 1 to that number into console.
 */
public class One2N {

    public static void main(String[] args) {

        //This class is used to accept input from System
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Number:");

        int n= scanner.nextInt();
        for (int i=1; i<=n; i++){
                System.out.println(i);
            }
    }
}
