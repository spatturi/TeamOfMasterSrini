package com.java.collections;

import java.util.Scanner;

public class EmpMenuBar {

    public static void printHeader(){
        System.out.println("********EmployeeServiceMenu*******");
    }

    public static void printMenu(){
        System.out.println("\t\t1.AddEmployeeDetails"+
                "\n\t\t2.InquiryEmployeeDetails"+
                "\n\t\t3.UpdateEmployeeDetails"+
                "\n\t\t4.Duplicate Check"+
                "\n\t\t5.DeleteEmployeeDetails");
        System.out.print("PleaseSelectYourService:");
    }

    public static void getUserChoice(){
        int id;
        int count;
        Scanner sc = new Scanner(System.in);
        int s= sc.nextInt();
        Employee employee = new Employee();
        EmployeeServiceI empService = new EmployeeServiceImpl();
        switch(s){
            case 1:
//                Employee employee = new Employee();
                System.out.println("Please input EmpId:");
                employee.setId(sc.nextInt());
                System.out.println("Please input Employee Name:");
                employee.setName(sc.next());
                System.out.println("Please input Salary");
                employee.setSalary(sc.nextDouble());
                empService.addEmpDetails(employee);
                break;
            case 2:
                empService.inqEmpDetails();
//               System.out.println("InquiryService:"+s);
                break;
            case 3:
                System.out.println("Please Input the Employee ID to get the Employee details for Update:");
//                employee.setId(sc.nextInt());
                id = sc.nextInt();
                count = empService.inqEmpById(id);
                if (count>0){
                    empService.updEmpDetails(id);
                }
                else {
                    System.out.println("No Employee record found for Emp Id:"+id);
                }
                break;
            case 4:
                System.out.println("Please Input the Employee ID to check Duplicate records:");
                id = sc.nextInt();
                count = empService.inqEmpById(id);
                if (count>1){
                    System.out.println("Above Employee records found for Emp Id"+id);
                }
                if (count==1){
                    System.out.println("No Duplicates found for Emp Id:"+id);
                }
                if (count==0){
                    System.out.println("No records found for Emp Id:"+id);
                }
                break;
            case 5:
                System.out.println("Please Input the Employee ID to Delete Employee details:");
                id = sc.nextInt();
                count = empService.inqEmpById(id);
                if (count>0){
                    empService.deleteEmpDetails(id);
                }
                else {
                    System.out.println("No Employee record found to Delete for Emp Id:"+id);
                }
                break;
            default:
                System.out.println("Please Select only any one of the below ServiceOption");
                printMenu();
                getUserChoice();
        }
            continueAgain();
    }

    public static void continueAgain(){
        System.out.println("Do you want to continue(Y/N):");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.equalsIgnoreCase("y")){
            printMenu();
            getUserChoice();
        }
        else {
            System.out.println("Thanks for using our Application");
        }
    }
}
