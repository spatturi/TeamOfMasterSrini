package com.java.basics;

import java.util.Scanner;

/**
 *
 50-->1,2,5,10,25
 60-->1,2,3,4,5,6,10,12,15,20,30
 */
public class CommonFactors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please key in Number1:");
        int n1 =sc.nextInt();
        System.out.println("Please key in Number2:");
        int n2 = sc.nextInt();
        int n=0;
        if (n1 > n2){
            n = n2;
        }
        else {
            n=n1;
        }
        System.out.print("Common factors of " + n1 + "and " + n2+ " are:");
        for (int i=1; i<=n; i++){
            if ((n1%i==0) && (n2%i==0)){
                System.out.print(" " +i);
            }
        }


    }
}
