package com.java.basics;

import java.util.Scanner;

/**
 * This class accepts number from keyboard and prints odd numbers to that number into console.
 */
public class OddOne2N {

    public static void main(String[] args) {

        //This class is used to accept input from System
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Number:");

        int n= scanner.nextInt();
 /*       for (int i=1; i<=n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }*/
        int i=1;
        while (i<=n){
            if (i%2 !=0){
                System.out.println(i);
            }
            i++;
        }
    }
}
