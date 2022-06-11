package com.java.basics;
import java.util.Scanner;

/**
 * LCM formula
 * LCM (a,b) = (a x b)/GCD(a,b)
 */
public class LCM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please key in Number1:");
        int n1 =sc.nextInt();
        System.out.println("Please key in Number2:");
        int n2 = sc.nextInt();
        int n=0,n3=0;
        if (n1 > n2){
            n = n2;
        }
        else {
            n=n1;
        }
        System.out.print("Common factors of " + n1 + "and " + n2+ " are:");
        for (int i=1; i<=n; i++){
            if ((n1%i==0) && (n2%i==0)){
 //               System.out.print(" " +i);
                n3=i;
            }
        }
        System.out.println("Greatest Common Divisor of " +n1 +" & "+n2+" :" +n3);
        int lcm= (n1*n2)/n3;
        System.out.println("LCM of " +n1 + "&"+n2+" :" +lcm );
    }
}