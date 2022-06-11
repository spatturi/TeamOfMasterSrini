package com.java.collections;

public class EmpTreeSet implements Comparable {
    private int empId;
    private String empName;
    private double salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Object obj) {
        EmpTreeSet empT =(EmpTreeSet) obj;
        String name = empT.empName;
        if(name.length()>this.empName.length()) return +999;
        else if(name.length()<this.empName.length()) return -888;
        else return this.empName.compareTo(name);
    }

    @Override
    public String toString() {
        return "{"+empId+","+empName+","+salary+"}";
    }
}
