package com.java.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {

        Stack stack = new Stack<>();

        stack.add("Java");
        stack.add("Spring");
        System.out.println("empty:" + stack.empty());
        System.out.println("Pop:" + stack.pop());
        System.out.println("Push:" + stack.push("Python"));
        System.out.println("Search:" + stack.search("Spring"));
        System.out.println("Search:"+stack.search("Python"));
        Enumeration enumeration = stack.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println("peek:"+stack.peek());
            System.out.println(enumeration.nextElement());
        }
    }
}