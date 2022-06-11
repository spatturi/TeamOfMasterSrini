package com.java.strings;

import java.util.StringJoiner;

public class StringOperations {

    String s1;
    String s2="";
    //saluations
    String[] title ={"Mr.","Mrs.","Miss.","Sri.","Dr."};
    Character[] splChar = {'%','@','?','$','#','&','!'};

    public StringOperations(String s1) {
        this.s1 = s1;
    }

    public static StringOperations getStringOperations(String s){
        StringOperations stringOperations = new StringOperations(s);
        System.out.println("String Operations Object created");
        return stringOperations;
    }

//    private void reverseString(){  // not able to call from Test class.
    public void revesreString(String s1){
     //   StringJoiner
        for (int i =s1.length()-1; i>=0; i--){
            s2 = s2+s1.charAt(i);
        }
        System.out.println("Input String  :"+s1);
        System.out.println("Reverse String:"+s2);

        if (s1.equals(s2)){
            System.out.println("String is a palindrome");
        }
        else {
            System.out.println("String is not a palindrome");
        }
//        s1="c";
//        s2="a";
        //string methods
        System.out.println("This is a \"StringOperations\" class");
        System.out.println("s1.matches(s2):"+s1.matches(s2));
        System.out.println("s1.compareTo(s2):"+s1.compareTo(s2));
        System.out.println("s1.compareToIgnoreCase(s2)"+s1.compareToIgnoreCase(s2));
        System.out.println("s1.codePointAt:"+s1.codePointAt(2));
        System.out.println("s1.concat(s2):"+s1.concat(s2));
        System.out.println("s1.contains:"+s1.contains("n"));
        System.out.println("s1.substring(0,5):"+s1.substring(0,2));

        System.out.println("s1.replace():"+s1.replace("sree","sri"));
        System.out.println("s1.replaceAll():"+s1.replaceAll("e",""));
        System.out.println(s1.replaceFirst("e","@"));
        System.out.println("s1.charAt(1):"+s1.charAt(1));
//        System.out.println(s1.getBytes("s"));
        System.out.println("indexOf:"+s1.indexOf("ni")+"\n indent:"+s1.indent(3)
        +"\n formatted:"+s1.formatted("hai")
        +"\ntrim:"+" hello ".trim()+"\ntoLowerCase:"+"HeLLO".toLowerCase()
        +"\nvalueOf:"+String.valueOf(99)+"\ntoCharAray:"+s1.toCharArray()[2]
        +"\nstartsWith:"+"sreenivas".startsWith("nivas",4)+"\nintern:"+s1.intern()
        +"\ncontentEquals:"+"nivas".contentEquals("nivas")+"\nhashCode:"+s1.hashCode()
        +"\nsubSequence:"+s1.subSequence(1,5)+"\nendsWith:"+"Sreenivas".endsWith("vas"));

//        System.out.println(s1.getBytes(s1));

        //Using String
        
        String s3 = String.format("%s%s",s1,s2);
        System.out.println("s3:"+s3.toString());
        System.out.println("String.join():"+String.join("(,)","sreeni","vasu","Annie","Arun"));
        System.out.println(Integer.MAX_VALUE);

    }

    public boolean palindromeString(String s1){
        //s1 = sreenivas
        int j=0;
        int l = s1.length();
        int n = s1.length()/2;
        int m=l+1;

        for(int i =0; i<=n;i++){
//            char c1 = s1.charAt(i);
//            char c2 = s1.charAt(l);
            l--; m--; j++;
   //         System.out.println("s1.substring(i,j):"+s1.substring(i,j)+"/ns1.substring(l,m):"+s1.substring(l,m));
            if ((s1.substring(i,j)).equals(s1.substring(l,m))){
                continue;
            }
            else {
                System.out.println("not a palindrome");
                return false;
            }
        }
        System.out.println("String is Palindrome:"+s1);
        return true;
    }

    public String titleRemove(String s1){
        for(String s:title){
            if (s.equals(s1.substring(0,s.length()))){
                return s1.substring(s.length(),s1.length());
            }
        } return "Title Not matched in Predefined Array";
    }

    public String tittleRemoveNew(String s1){
        for (String s:title){
            if (s1.startsWith(s)){
                return s1.substring(s.length());
            }
        } return "Title not Matched in method";
    }

    public String splCharRemove(String s1){
        for (char c:splChar){
 //           if (s1.chars().equals(c).r)
            s1=s1.replace(c,' ');

        }
        System.out.println(s1);
        int i=0;
        while (i<s1.length()){
            if (s1.substring(i,i+1).equals(" ")) {
 //               continue;
 //               break;
            }
            else {
                s2=s2+s1.charAt(i);
            }i++;
        }
        return s2;
    }

    public void operations(){
        System.out.println("");
    }

}
