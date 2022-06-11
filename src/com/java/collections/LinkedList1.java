package com.java.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("Spring");
        linkedList.add("SpringBoot");
        linkedList.add(3,"Python");

        ListIterator listItr = (ListIterator) linkedList.iterator();

        while (listItr.hasNext()){
            System.out.println(listItr.next());
        }
        System.out.println(listItr.previous());
        System.out.println(listItr.hasPrevious());
        System.out.println(linkedList.contains("Python"));
        System.out.println(linkedList.remove("Python"));
        System.out.println(linkedList.contains("Python"));



    }
}
