package com.java.strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringFormatTest {
    public static void main(String[] args) {

        System.out.println("Please key in delimiter:");
        Scanner sc = new Scanner(System.in);
        String delimiter = sc.next();
        System.out.println("Please key in Prefix:");
        String prefix = sc.next();
        System.out.println("Please key in Suffix:");
        String suffix = sc.next();
        System.out.println("Please key in No.of names:");
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Please key in Name " + i + " :");
            names[i] = sc.next();
        }
//                while (sc.hasNext()) {
//                    String[] names = sc.next();
//
//                }
        System.out.println("Names Array:"+ Arrays.toString(names));
        System.out.println("Names ArrayList:"+Arrays.asList(names));

        StringFormat sf = StringFormat.sFormat1(delimiter,prefix,suffix,names);
        System.out.println("sf.sFormat2():"+sf.sFormat2());
    }
 }

