package com.java.fundtransfer;

import java.util.Scanner;

public class ServiceMenu {
    int serviceOption;
    int accNumber;
    int frAccNumber;
    int toAccNumber;
    double transferAmt;
    Scanner sc = new Scanner(System.in);
    public void serviceMethod(){
 //       Scanner sc = new Scanner(System.in);
        System.out.println("Please select required service: \n 1.Balance Enquiry \n 2.Fund Transfer ");

        serviceOption = sc.nextInt();

        switch (serviceOption) {
            case 1:
                System.out.println("Please provide Account number for balance check:");
/*
                while (!sc.hasNextInt()){
                    sc.next();
                    System.out.println("Account number should be numeric");
                }
*/
                validateUserData();
                accNumber = sc.nextInt();
                break;
            case 2:
                System.out.println("Please provide FROM Account Number:");
                validateUserData();
                frAccNumber = sc.nextInt();
                System.out.println("Please provide TO Account Number:");
                validateUserData();
                toAccNumber = sc.nextInt();
                System.out.println("Please provideTransfer Amount:");
                while (!sc.hasNextDouble()){
                    sc.next();
                    System.out.println("Please provide valid amount");
                }
                transferAmt = sc.nextDouble();
//                set frAccNumber();
//                set toAccNumber();
//                set transferAmt();
                break;
            default:
                System.out.println("Please select valid service:");
                serviceMethod();
        }
    }

    public void validateUserData(){
        while (!sc.hasNextInt()){
            sc.next();
            System.out.println("Account number should be numeric");
        }
    }
}
