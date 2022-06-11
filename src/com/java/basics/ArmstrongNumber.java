package com.java.basics;

import java.util.Scanner;

/**
 * 153 = 1^3 + 5^3 + 3^3 = 1+125+27=153  --This is Armstrong number
 * 123 = 1^3+2^3+3^3 = 1+8+27=36   --This is not an Armstrong Number
 */

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input the number: ");

        int n = sc.nextInt();
        int a = n;
        //       String s = Integer.toString(n);
        //       int length = s.length();
        int sum = 0;
        int b = 0;
        while (n != 0) {
            b = n % 10;
            sum = (int) (sum + Math.pow(b, 3));
            n = n / 10;
        }
        if (a == sum) {
            System.out.println("User given number is a Armstrong Number:" + a + "," + sum);
        }
         else
            {
                System.out.println("User given number is not an Armstrong Number:" + a +"," + sum);
            }
        }
    }
