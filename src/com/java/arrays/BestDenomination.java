package com.java.arrays;

import java.util.Scanner;

public class BestDenomination {
    public static void main(String[] args) {
        int[] denoms = {1,2,5,10,20,50,100,500,2000};

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the Amount:");
        int amt= sc.nextInt();
        int sum=0;
        for (int i= denoms.length-1;i>=0;i--){
            if ((denoms[i] <= amt) && (sum!=amt)){
                int divdent = amt/denoms[i];
                amt = amt%denoms[i];
                System.out.println(divdent + "*" + denoms[i]);
   //             System.out.println(denoms[i]);
                sum=sum+divdent*denoms[i];
            }
        }
        System.out.println("======================");
        System.out.println(sum);
    }
}
