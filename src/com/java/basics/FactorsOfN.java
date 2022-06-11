package com.java.basics;

import java.util.Scanner;

/**
 *
 */
public class FactorsOfN {

    public static void main(String[] args) {

        //This class is used to accept input from System
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Number:");
        int n = scanner.nextInt();
//        System.out.println("Factors of " + n + " :");
        int j = 1;
        while (j <= n) {
            System.out.print("Factors of " + j + " :");
            for (int i = 1; i <= j; i++) {
                if (j%i == 0) {
                    System.out.print("\t" + i);
                }
            } j++;
            System.out.println(" ");
        }
    }
}