package src.com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionOf2Matrices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please key in array size:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] array1 = new int[a][b];
        int[][] array2 = {{1,2},{3,4}};
        System.out.println("Please Enter Array Elements");
        for (int i=0;i<a;i++){
            for (int j=0; j<b;j++){
                array1[i][j] =sc.nextInt();
            }
        }
        System.out.println("array1:"+ Arrays.toString(array1));

        //Test print array elements
        //array.length does not work for 2 dimensional array??
  //      for (int i=0;i<array1.length;i++){
//        for (int i=0;i<a;i++) {
//            for (int j = 0; j < b; j++) {
//                System.out.print(array1[i][j] + " ");
//            }
//            System.out.println(" ");
//        }

        for (int i=0;i<a;i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(array1[i][j] + array2[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
