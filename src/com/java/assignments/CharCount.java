package com.java.assignments;

import java.util.ArrayList;

public class CharCount {
    public static void main(String[] args) {

        char[] alphabet= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
                'u','v','w','x','y','z'};
        String name = "ababab";
//        int count=0;

        for (char c:alphabet){
            int count=0;
//            System.out.println(c);
            for (int i=0;i<name.length();i++){
                if (name.charAt(i)==c){
                    count++;
                }
            }
            if(count>0) {
                System.out.println(c + "-" + count);
            }
        }
    }
}
