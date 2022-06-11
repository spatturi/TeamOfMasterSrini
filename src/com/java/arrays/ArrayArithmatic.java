package com.java.arrays;

import java.util.Scanner;

public class ArrayArithmatic {
    public static void main(String[] args) {
        //Array preparation with user data
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter the Array size");
        int n = sc.nextInt();
        //array syntax: dataType[] arrayName = new dataType[]
        int[] a = new int[n];

        System.out.println("Please Enter Array Elements");
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        //Test print array elements
        for (int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }
        //Minimum value find in Array of elements
        int min=Integer.MAX_VALUE;
        for (int j=0;j<a.length;j++){
            if (a[j] <=min){
                min=a[j];
            }
        }
        System.out.println("Minimum value in Array is: "+ min);

        //Max value
        int max=Integer.MIN_VALUE;
        for (int j=0;j<a.length;j++){
            if (a[j]>max){
                max=a[j];
            }
        }
        System.out.println("Max value in Array is: "+max);

        //Average value
        int sum =0;
        int l = a.length;
        for (int j:a){
            sum=sum+j;
        }
        System.out.println("Sum of array elements:" + sum);
        int avg = sum/l;
        float avg1 = (float)sum/(float)a.length;
        System.out.println("Avg of array elements: " + avg);
        System.out.println("Avg of array elements: " + avg1);
    }
}
