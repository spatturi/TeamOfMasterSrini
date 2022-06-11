package com.java.basics;

import java.util.Scanner;

/**
 * 5!= 5*4*3*2*1=120
 * 0! = 1
 */
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input the number to find Factorial: ");
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1; i < n; i++) {
            sum = sum + sum * i;
        }
        System.out.println("Factorial of " + n + " is:" + sum);
    }
}
