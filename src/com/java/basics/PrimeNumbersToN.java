package com.java.basics;

import java.util.Scanner;

/**
 * This class accepts number from keyboard and prints factors/divisors of given number to console.
 */
public class PrimeNumbersToN {

    public static void main(String[] args) {

        //This class is used to accept input from System
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Number:");

        int n = scanner.nextInt();

        if (n==1) {
            System.out.println(n + " is not a prime number");
        } else {
            System.out.println("Prime Numbers from 1 to " + n + " :");
        }

        for (int i=2; i<=n; i++) {
            int cnt=0;
            for (int j=1; j<=i;j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
                if (cnt==2){
                    System.out.println(i);
                }
            }
        }
    }
