package com.java.collections;

import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class SortedSet1 {

    public static void main(String[] args) {

        SortedSet<Integer> s1 = new TreeSet<>();
        s1.add(1);
        s1.add(7);
//        s1.add(2);
        s1.add(4);
        s1.add(3);
        s1.add(5);
//        s1.add(6);
        s1.add(8);
        s1.add(10);
        s1.add(9);


        System.out.println("Sorted TreeSet s1:"+s1);
        System.out.println(s1.comparator());
        System.out.println("subset1:"+s1.subSet(1,5));
        System.out.println("subset2:"+s1.subSet(2,9));

        System.out.println("headSet1:"+s1.headSet(5));
        System.out.println("headSet2"+s1.headSet(2));
        System.out.println("tailSet1:"+s1.tailSet(5));
        System.out.println("tailSet1:"+s1.tailSet(6));
        System.out.println("Spliterator:"+s1.spliterator());

        Spliterator sItr = s1.spliterator();
        sItr.forEachRemaining(System.out::println);
        System.out.println("Spliterator:"+sItr.trySplit());



    }
}
