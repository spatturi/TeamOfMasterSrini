package com.java.basics;

import java.util.Random;

public class randomWords {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.doubles(5,10));
        System.out.println(random.ints(20));
        System.out.println(random.nextGaussian());
    }
}
