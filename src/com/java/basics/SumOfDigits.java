package com.java.basics;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input the number: ");

        int n = sc.nextInt();
        int a = n;
        int sum = 0;
        while (n != 0) {
            sum = sum + n%10;
            n = n / 10;
        }
        System.out.println("Sum of " + a + " Digits :" +sum);

        }
    }
