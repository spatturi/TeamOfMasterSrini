package com.java.collections;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {

        MyComparator myComparator = new MyComparator();
        TreeSet<Integer> ts1 = new TreeSet<>(myComparator);
            ts1.add(104);
            ts1.add(103);
            ts1.add(102);
            ts1.add(105);
        System.out.println("Integer TreeSet ts1:"+ts1);

        TreeSet<EmpTreeSet> ts2 = new TreeSet<>();
            EmpTreeSet emp1 = new EmpTreeSet();
            emp1.setEmpId(3);
            emp1.setEmpName("C");
            emp1.setSalary(300);

            EmpTreeSet emp2 = new EmpTreeSet();
            emp2.setEmpId(1);
            emp2.setEmpName("A");
            emp2.setSalary(100);

            EmpTreeSet emp3 = new EmpTreeSet();
            emp3.setEmpId(2);
            emp3.setEmpName("B");
            emp3.setSalary(200);

            ts2.add(emp1);
            ts2.add(emp2);
            ts2.add(emp3);
        System.out.println("EmpHashSet ts2:"+ts2);





    }
}
