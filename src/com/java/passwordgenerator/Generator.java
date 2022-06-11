package com.java.passwordgenerator;

import java.util.Scanner;

public class Generator {

    public static void welcomeMsg() {
        System.out.println("Welcome to Password Management Service");
    }

    public static void userMenu() {
        System.out.println("\n\t\t 1 - Password Generator" +
                "\n\t\t 2 - Password Strength Check" +
                "\n\t\t 3 - Useful Information" +
                "\n\t\t 4 - Quit");
        System.out.println("\t\tSelect Choice:");
    }
    public static void getUserChoice(){
        int input;
        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isNumber = false;
        boolean isSplChar = false;
        int length=0;
        PasswordDetails pwd = new PasswordDetails();
        Scanner sc = new Scanner(System.in);
             input = sc.nextInt();
            switch (input) {
                case 1:
//                    System.out.println("Password Generator");
                    isLowerCase=pwd.isLowerCase();
                    isUpperCase= pwd.isUpperCase();
                    isNumber=pwd.isNumber();
                    isSplChar=pwd.isSplChar();
                    length=pwd.getPwLength();
                    Alphabet alphabet = new Alphabet(isLowerCase,isUpperCase,isNumber,isSplChar);
                    System.out.println("Generated Password:"+alphabet.generatePw(length));
                    break;
                case 2:
//                    System.out.println("Password Strength Check");
                    System.out.println("Please input your Password:");
                    String pw = sc.next();
                    Password password = new Password(pw);
                    password.checkPwStrength();
                    break;
                case 3:
//                    System.out.println("Useful Information");
                    pwd.usefulInfo();
                    break;
                case 4:
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("Kindly Select one of the available option");
                    userMenu();
                    getUserChoice();
                    break;
            }sc.close();
    }

//    public static continueAgain(){
//        System.out.println();
//    }
}

