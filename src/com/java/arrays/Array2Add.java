package com.java.arrays;

import java.util.Arrays;

public class Array2Add {
    public static void main(String[] args) {

        int[][] array1 = {{1, 2}, {1, 2, 3},{1,2,3,4}};
        int l =Integer.MIN_VALUE;
        int rows = array1.length;
        for (int i=0; i<rows;i++){
            if (array1[i].length>l){
                l=array1[i].length;
            }
        }

        int[] sumArray =new int[l];
        System.out.println("rows" + rows + "--cols:" + l);
        for (int j=0;j<l;j++){
            for (int i=0;i<rows;i++){
                if (j<array1[i].length) {
                    sumArray[j] = sumArray[j] + array1[i][j];
                }
            }
        }
        System.out.println("sumArray"+Arrays.toString(sumArray));

/*
        int[][] foo = new int[][] {
                new int[] { 1, 2, 3 },
                new int[] { 1, 2, 3, 4},
        };
        System.out.println(foo.length); //2
        System.out.println(foo[0].length); //3
        System.out.println(foo[1].length); //4
*/
/*
//        int cols = array1[l].length;
//        int[] sumArray = new int[cols];
        for (int J = 0; j < rows-1; i++) {
            for (int j = 0; j < l; j++) {
                sumArray[j] = array1[i][j] + array1[i+1][j];
            }
        }
        System.out.println("sumArray:"+ Arrays.toString(sumArray));
*/
    }
}