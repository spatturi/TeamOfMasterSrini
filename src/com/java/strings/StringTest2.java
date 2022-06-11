package com.java.strings;

import java.util.StringJoiner;

public class StringTest2 {
    public static void main(String[] args) {
//        char c1 = 's';
//        char c2 = 'S';
//        String s1 ="sreenivas";
//        String s2 = "Sreenivas";
//        System.out.println((int)c1 );
//        System.out.println((int)c2 );
//        System.out.println(s1.compareTo(s2));
// //       System.out.println();
        StringJoiner sj = new StringJoiner(",", "(", ")");
        System.out.println(sj);
        sj.add("George").add("Sally").add("Fred");
        System.out.println(sj);
        String desiredString = sj.toString();
        System.out.println(desiredString);

    }

}
