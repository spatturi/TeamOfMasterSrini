package com.java.passwordgenerator;

public class Alphabet {
    final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final String NUMBERS = "0123456789";
    final String SPL_CHARS = "!@#$%^&*";
    boolean isLowerCase =false;
    boolean isUpperCase=false;
    boolean isNumber=false;
    boolean isSplChar=false;
    private StringBuilder strb;

    public Alphabet() {
    }

    public Alphabet(boolean isLowerCase, boolean isUpperCase, boolean isNumber, boolean isSplChar) {
        this.isLowerCase=isLowerCase;
        this.isUpperCase=isUpperCase;
        this.isNumber=isNumber;
        this.isSplChar=isSplChar;

        strb = new StringBuilder();

        if (isLowerCase){
            strb.append(LOWER_CASE);
        }
        if (isUpperCase){
            strb.append(UPPER_CASE);
        }
        if (isNumber){
            strb.append(NUMBERS);
        }
        if (isSplChar){
            strb.append(SPL_CHARS);
        }

    }

    public String generatePw(int length){
        StringBuilder password = new StringBuilder();
        int min=0;
        int max=strb.length()-1;
        int range =max-1;
        if (length!=0){
            for(int i=0;i<length;i++){
                int index = (int) ((Math.random()*range)+min);
                password.append(strb.charAt(index));

            }
        }return password.toString();
    }
}
