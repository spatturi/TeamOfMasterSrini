package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet hs1 = new HashSet<>();

        EmpHashSet emp1 = new EmpHashSet();
        emp1.setEmpId(101);
        emp1.setName("Srini");
        emp1.setSalary(20000);

        EmpHashSet emp2 = new EmpHashSet();
        emp2.setEmpId(103);
        emp2.setName("Annie");
        emp2.setSalary(30000);

        EmpHashSet emp3 = new EmpHashSet();
        emp3.setEmpId(102);
        emp3.setName("Arun");
        emp3.setSalary(40000);

        hs1.add(emp1);
        hs1.add(emp2);
        hs1.add(emp3);

 //       System.out.println(hs1);
        System.out.println("contains check:"+hs1.contains(emp2));

        Iterator itr = hs1.iterator();
        while (itr.hasNext()){
            EmpHashSet empHashSet = (EmpHashSet)itr.next();
            System.out.println("EmpHashSet with iterator:"+empHashSet);
            System.out.println("EmpId:"+empHashSet.getEmpId());
        }

    }
}
