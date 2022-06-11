package com.java.strings;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

        System.out.println("Please Input the String:");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        StringOperations so = StringOperations.getStringOperations(s1);
        //for Reverse String
        so.revesreString(s1);
        //Palindrome
//        so.palindromeString(s1);
        //Title remove
//        System.out.println("Title Removed String:"+so.titleRemove(s1));
//        System.out.println("Title Remove New:"+so.tittleRemoveNew(s1));
        //Special characters remove from string
  //      System.out.println(so.splCharRemove(s1));

    }
}
