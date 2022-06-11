package com.java.arrays;

import java.util.Arrays;

public class ArrayAddition {
    public static void main(String[] args) {
        int[] array1 ={1,2,3,4,5,6,7,8,9};
        int[] array2 ={1,2,3,4,5};
        int l1 = array1.length;
        int l2 = array2.length;
        int l;
        if (l1>l2) {
             l = l2;
        }else {
             l = l1;
        }
        int[] sumArray =new int[l];
        for (int i=0;i<l2&&i<l1;i++){
            sumArray[i] =array1[i]+array2[i];
        }
        System.out.println("Array1:"+Arrays.toString(array1));
        System.out.println("Array2:"+Arrays.toString(array2));
        System.out.println("Array3:"+Arrays.toString(sumArray));
    }
}
