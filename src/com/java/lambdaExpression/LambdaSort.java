package com.java.lambdaExpression;

import java.util.Arrays;

public class LambdaSort {
    public static void main(String[] args) {
        String[] array = {"Java","Python","C","R"};
        System.out.println("Unsorted Array:"+Arrays.toString(array) );
        Arrays.sort(array,(x,y)->y.compareTo(x));
        System.out.println("Reverse Sorted:"+Arrays.toString(array));
        Arrays.sort(array,(x,y)->x.compareTo(y));
        System.out.println("Sorted:"+Arrays.toString(array));
    }
}
