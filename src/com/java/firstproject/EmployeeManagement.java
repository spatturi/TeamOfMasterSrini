package src.com.java.firstproject;

import java.util.Scanner;

public class EmployeeManagement {
    int s1;
    public EmployeeManagement(int s) {
        s1=s;
  //      print();

        switch (s1) {
            case 1:
                System.out.println("I am Add Employee");
                break;
            case 2:
                System.out.println("I am Update Employee");
                break;
            case 3:
                System.out.println("I am Delete Employee");
                break;
            case 4:
                System.out.println("I am Display Employee by ID");
                break;
            case 5:
                System.out.println("I am Display All Employees");
                break;
            case 6:
                System.out.println("I am Exit");
                break;
            default:
                System.out.println("In correct option choose");
        }
    }

}