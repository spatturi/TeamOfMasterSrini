package com.java.arrays;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {50,20,30,10,60,70,90,80,4,100};
        int[] array1 = {5,2,3,1,6,7,9,8,0,4};

        //SORT using for loop
        int temp=0;
        for (int i=0; i< array.length;i++){
            for (int j=i+1;j< array.length;j++){
                if (array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.printf("Sorted Array []: %s",Arrays.toString(array));

        //SORT using sort() method
//        System.out.printf("Sorted Array1 []: %s",Arrays.toString(Arrays.sort(array1)));
//        System.out.println("args = " + Arrays.deepToString(array1));
        System.out.println("Binary Search for 4 :"+ Arrays.binarySearch(array,20));
        System.out.println("compare:"+Arrays.compare(array,array));
        int[] newArray = Arrays.copyOf(array,20);
//        System.out.println("copyOf:"+Arrays.copyOf(array,20));
        System.out.println("AfterLength:"+ newArray.length);
        System.out.printf("newArray:%s",Arrays.toString(newArray));


    }
}
