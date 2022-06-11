package com.java.basics;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number:");

        int n = sc.nextInt();
        int a=0, b=1,c=0;
        while(a<=n){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println("");
        int n1=0,n2=1,n3=0;

//        do {
//            System.out.print(n1+" ");
//            n3=n1+n2;
//            n1=n2;
//            n2=n3;
//        }while (n1<=n);
    }
}
