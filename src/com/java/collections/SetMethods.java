package com.java.collections;

import java.util.*;

public class SetMethods {
    public static void main(String[] args) {

        //HashSet
        Set<String> s1 = new HashSet<String>();
        System.out.println("size before adding s1:"+s1.size());
        s1.add("Srini");
        s1.add("patturi");
        System.out.println("size after 2 elements add s1:"+s1.size());
        s1.add("Srini");
        s1.add("Patturi");
        System.out.println("size after adding 1 duplicate s1:"+s1.size());
        s1.add("Dhruva");
        s1.add("Aditri");
        System.out.println("s1:"+s1);
        System.out.println("empty check s1:"+s1.isEmpty());
        System.out.println("remove patturi from s1:"+s1.remove("patturi"));
        System.out.println("After remove s1:"+s1);
        System.out.println("contains check s1:"+s1.contains("Patturi"));
        System.out.println("hashCode:"+s1.hashCode());


        //LinkedHashSet
        Set<String> s2 = new LinkedHashSet<String>();
        s2.add("Vasu");
        s2.add("Vasu");
        System.out.println("size with duplicate add s2:"+s2.size());
        s2.addAll(s1);
        System.out.println("s2:"+s2);

        //Adding elements to List
        List<Integer> l1 = new ArrayList<Integer>();
            l1.add(10);
            l1.add(40);
            l1.add(30);
            l1.add(20);
            l1.add(50);
            l1.add(20);
            l1.add(30);
        System.out.println("List l1 order after add with duplicates:"+l1+",size:"+l1.size());
        //Adding this ArrayList to HashSet to remove duplicates
        Set<Integer> s3 = new HashSet<Integer>(l1);
        System.out.println("Unodered List Elements after removing duplicates using set s3:"+s3+",size:"+s3.size());

    }
}
