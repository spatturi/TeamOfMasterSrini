package com.java.collections;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector vector = new Vector<>();

        vector.add("Java");
        vector.add(0,"Python");
        vector.add("Spring");

        Enumeration enumeration = vector.elements();

        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
