package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeServiceI {

//    private static ArrayList<Employee> empList = null;
    private static ArrayList<Employee> empList = new ArrayList<>();

//    static {
//        empList = new ArrayList<>();
//    }

    @Override
    public void addEmpDetails(Employee employee) {
        empList.add(employee);
        System.out.println("Emplyee Details added");

    }

    @Override
    public void inqEmpDetails() {
        int count = 0;
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("Emp-Id | Emp-Name  |  Emp-Salary");
        System.out.println("++++++++++++++++++++++++++++++++");
        Iterator itr = empList.iterator();
        while (itr.hasNext()){
            Employee employee = (Employee) itr.next();
            count++;
            System.out.println(count+")"+employee.getId()+" | "+employee.getName()+" | "+employee.getSalary());
        }
    }

    @Override
    public int inqEmpById(int id){
        int count = 0;
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("Emp-Id | Emp-Name  |  Emp-Salary");
        System.out.println("++++++++++++++++++++++++++++++++");
        for (Employee emp:empList){
            if (emp.getId()==id){
                count++;
                System.out.println(count+")"+emp.getId()+" | "+emp.getName()+" | "+emp.getSalary());
            }
        }
        return count;
    }

    @Override
    public void updEmpDetails(int id) {
        int count=0;
        Scanner sc = new Scanner(System.in);
            Iterator itr = empList.iterator();
            while (itr.hasNext()){
                Employee employee = (Employee) itr.next();
                if (employee.getId()==id){
                    System.out.println("Do you want to update \"NAME\"(Y/N):");
                    if (sc.next().equals("y")) {
                        System.out.println("Please provide Updated NAME:");
                        String name = sc.next();
                        employee.setName(name);
                        count++;
                    }
                     System.out.println("Do you want to update \"Salary\"(Y/N):");
                    if (sc.next().equals("y")) {
                        System.out.println("Please provide Updated SALARY:");
                        double salary = sc.nextDouble();
                        employee.setSalary(salary);
                    }
                    if (count==0)  {
                        System.out.println("No updates performed");
                    }
                    else {
                        System.out.println("Updated Employee Details:"+
                                "\n"+employee.getId()+" | "+employee.getName()+" | "+employee.getSalary());
                    }
                }
            }
    }

    @Override
    public void  deleteEmpDetails(int id) {
        int count=0;
        Iterator itr = empList.iterator();
        while (itr.hasNext()){
            Employee employee = (Employee) itr.next();
            if (employee.getId()==id){
//                status =empList.remove(employee);
                itr.remove();
                count++;
            }
        }
        if (count>0){
            System.out.println(count+" Empoyees Deleted Successfully for the EmpId:"+id);
        }
        else {
            System.out.println("Employee record Delete not success");
        }
    }
}