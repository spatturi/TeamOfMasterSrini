package com.java.collections;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet1 {
    public static void main(String[] args) {
        NavigableSet<Integer> ns1 = new TreeSet<>();

        ns1.add(10);
        ns1.add(50);
        ns1.add(40);
        ns1.add(30);
        ns1.add(20);
        ns1.add(90);
        ns1.add(60);
        ns1.add(50); //duplicate
        ns1.add(70);
        ns1.add(80);
        System.out.println("NavigableSet ns1:"+ns1);
        System.out.println("lower40:"+ns1.lower(40));
        System.out.println("floor25:"+ns1.floor(25));
        System.out.println("ceiling25:"+ns1.ceiling(25));
        System.out.println("higher40:"+ns1.higher(40));
        System.out.println("pollFirst:"+ns1.pollFirst());//first one delete
        System.out.println("pollLast:"+ns1.pollLast());//last one delete
        System.out.println("ns1 again:"+ns1);
//        System.out.println("pollFirst:"+ns1.pollFirst());//first one delete
//        System.out.println("pollLast:"+ns1.pollLast());//last one delete
//        System.out.println("ns1 again:"+ns1);
        System.out.println("descendingSet"+ns1.descendingSet());

        Iterator itr = ns1.iterator();
        while (itr.hasNext()){
            System.out.println("ns1 iterator:"+itr.next());
        }

        Iterator descItr = ns1.descendingIterator();
        while (descItr.hasNext()){
            System.out.println("ns1 descendingIterator:"+descItr.next());
        }

        System.out.println("subSet:"+ns1.subSet(1,120));
        System.out.println("headSet 40:"+ns1.headSet(40,true));
        System.out.println("tailSet 40:"+ns1.tailSet(40));

        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Welcome");
        tree_set.add("To");
        tree_set.add("Geek");
        tree_set.add("4");
        tree_set.add("Geeks");
        tree_set.add("TreeSet");
        System.out.println("treeSet:"+tree_set);
        System.out.println("treeSet subSet:"+tree_set.subSet("4","ZZZZZZ"));
        System.out.println("headSet:"+tree_set.headSet("Welcome"));
        System.out.println("tailSet:"+tree_set.tailSet("5",true));
    }
}
