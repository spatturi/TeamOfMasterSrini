package com.java.assignments;

import java.util.Arrays;

public class StringEquality {

    public boolean stringEqualCheck(String s1, String s2){
        if (s1.length()!=s2.length()) return false;
        if (s1.equals(s2)) return true;
        for (int i=0;i<s1.length();i++){


        }
        if (s1.contains(s1)) return true;
        else return false;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cab";
        String[] a = {s2};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}