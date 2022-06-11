package com.java.passwordgenerator;

import java.util.Scanner;

public class PasswordDetails {

    Scanner sc = new Scanner(System.in);

    public boolean isLowerCase(){
        System.out.println("Do you want Lower Case letters in password(Y/N):");
        String s = sc.next();
        return s.equalsIgnoreCase("y");
    }
    public boolean isUpperCase(){
        System.out.println("Do you want Upper Case letters in password(Y/N):");
        String s = sc.next();
        return s.equalsIgnoreCase("y");
    }
    public boolean isNumber(){
        System.out.println("Do you want Numbers in password(Y/N):");
        String s = sc.next();
        return s.equalsIgnoreCase("y");
    }
    public boolean isSplChar(){
        System.out.println("Do you want Special Characters in password(Y/N):");
        String s = sc.next();
        return s.equalsIgnoreCase("y");
    }
    public  Integer getPwLength(){
        System.out.println("Please input required Password Length");
        return sc.nextInt();
    }

    public void askPassword(){
        System.out.println("Please input your Password:");
        String pw = sc.next();

    }

    public void usefulInfo(){
        System.out.println();
        System.out.println("Use a minimum password length of 8 or more characters if permitted");
        System.out.println("Include lowercase and uppercase alphabetic characters, numbers and symbols if permitted");
        System.out.println("Generate passwords randomly where feasible");
        System.out.println("Avoid using the same password twice (e.g., across multiple user accounts and/or software systems)");
        System.out.println("Avoid character repetition, keyboard patterns, dictionary words, letter or number sequences,\nusernames, relative or pet names, romantic links (current or past) and biographical information (e.g., ID numbers, ancestors' names or dates).");
        System.out.println("Avoid using information that the user's colleagues and/or acquaintances might know to be associated with the user");
        System.out.println("Do not use passwords which consist wholly of any simple combination of the aforementioned weak components");

    }
}
