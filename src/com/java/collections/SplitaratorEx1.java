package com.java.collections;

import java.util.Spliterator;
import java.util.TreeSet;

public class SplitaratorEx1 {

    public static void main(String[] args) {

        Employee3 employee1 = new Employee3("shristee", "vishwakarma", "Analyst");
        Employee3 employee2 = new Employee3("shweta  ", "singh      ", "Accountant");
        Employee3 employee3 = new Employee3("suman   ", "chandra    ", "Computer Engineer ");

        TreeSet<String> obj = new TreeSet<>();

        String s1 = employee1.toString();
        String s2 = employee2.toString();
        String s3 = employee3.toString();

        obj.add(s1);
        obj.add(s2);
        obj.add(s3);

        System.out.println("TreeSet obj:"+obj);

        System.out.println("Elements in TreeSet:");
        for (String s:obj){
            System.out.println(s);
        }

        Spliterator<String> splI = obj.spliterator();
        System.out.println("Elements of TreeSet with splitarator() method:");
        splI.forEachRemaining(System.out::println);

    }
}
