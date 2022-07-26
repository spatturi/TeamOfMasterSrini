package src.com.java.firstproject;

import java.util.Scanner;

public class EmployeeManagementTest {

    static void print() {
        System.out.println("\t 1.Add Employee \n \t 2.Update Employee \n \t 3.Delete Employee \n \t 4.Display Employee By Id" +
                "\n \t 5.Display All Employees \n \t 6.Exit");
    }

    public static void main(String[] args) {

        boolean choice = true;
        System.out.println("\tWELCOME TO EMPLOYEE MANAGEMENT  ");
        System.out.println("\t********************************");

        while (choice) {
            print();
            System.out.println("\t Enter Your Choice:");
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            EmployeeManagement employeeManagement = new EmployeeManagement(s);
            System.out.println("Do you want to continue:");
            String s2 = sc.next();
            if (!s2.equals("y")) {
//            if (sc.next("y"))
                choice = false;
                System.out.println("Thank you for choosing");
            }
        }
    }
}