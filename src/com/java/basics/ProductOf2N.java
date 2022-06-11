package com.java.basics;

import java.util.Scanner;

public class ProductOf2N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number1:");
        int n1 = sc.nextInt();
        System.out.println("Please Enter Number2:");
        int n2 = sc.nextInt();
        int n3=0;
        for (int i=1;i<=n2;i++){
            n3=n3+n1;
        }
        System.out.println("Product of "+n1+"'"+n2+":"+n3);
    }
}
