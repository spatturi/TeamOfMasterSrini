package com.java.basics;

import java.util.Scanner;

/**
 * This class accepts number from keyboard and prints even numbers to that number into console.
 */
public class EvenOne2N {

    public static void main(String[] args) {

        //This class is used to accept input from System
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Number:");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if ( i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
