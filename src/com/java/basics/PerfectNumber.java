package com.java.basics;

import java.util.Scanner;

/**
 * 6-->1,2,3=1*2*3=6  -- 6 is a perfect number
 *
 * 12 --->1,2,3,4,6=1*2*3*4*6=144  -- 12 is not a perfect number
 */

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input the number: ");
        int n = sc.nextInt();
        int sum=1;
        for (int i=1; i<n;i++){
            if (n%i==0){
                sum = sum * i;
            }
        }
        if (n==sum){
            System.out.println("user input is Perfect number: " +n+ ","+sum);
        }else{
            System.out.println("user input is not a Perfect number: " +n +","+sum);
        }
    }
}
