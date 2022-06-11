package com.java.passwordgenerator;

public class Password {
    String value;
    int length;
    double score;

    public Password(String pw) {
        this.value =pw;
        length =pw.length();
    }
    public void checkPwStrength(){
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasNumber = false;
        boolean hasSpclChar = false;
        String s = this.value;
        for (int i =0;i<length;i++){
            char c = s.charAt(i);
            int type =chatType(c);

            if (type==1){
                hasLowerCase = true;
            }
            if (type==2){
                hasUpperCase = true;
            }
            if (type==3){
                hasNumber=true;
            }
            if (type==4){
                hasSpclChar=true;
            }

        }

        if (hasLowerCase){
            score++;
        }
        if (hasUpperCase){
            score++;
        }
        if (hasNumber){
            score++;
        }
        if (hasSpclChar){
            score++;
        }
        if (s.length()>=8){
            score++;
        }
        if (s.length()>=16){
            score++;
        }

        if(score==6){
            System.out.println("\"This is a very good password : check the Useful Information section to make sure it satisfies the guidelines\"");
        } else if (score>=4) {
            System.out.println("\"This is a good password :) but you can still do better\"");
        } else if (score>=3) {
            System.out.println("\"This is a medium password :/ try making it better\"");
        }else {
            System.out.println("\"This is a weak password :( definitely find a new one\"");
        }
    }

    public int chatType(char c){
        char a=c;
        int v=a; //ASCII Value of Char

        int val=0;

        // Char is Uppercase Letter
        if (v>=65 && v<=90) {
            val=1;
        }

        // Char is Lowercase Letter
        else if (v>=97 && v<=122) {
            val=2;
        }

        // Char is Digit
        else if (v>=48 && v<=57) {
            val=3;
        }

        // Char is Symbol
        else {
            val=4;
        }

        return val;
    }
}
