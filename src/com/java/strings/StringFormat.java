package com.java.strings;

public class StringFormat {
    String delimiter;
    String prefix;
    String suffix;
    String[] names;

    public StringFormat(String delimiter, String prefix, String suffix, String[] names) {
        this.delimiter = delimiter;
        this.prefix = prefix;
        this.suffix = suffix;
        this.names = names;
    }

    public static StringFormat sFormat1(String delimiter, String prefix, String suffix, String[] names){
        StringFormat stringFormat = new StringFormat(delimiter, prefix, suffix, names);
        return stringFormat;
    }

    public String sFormat2(){
        String s1 = "";
        s1 = String.join(this.delimiter,this.names);
        String s2 = this.prefix +s1+this.suffix;
        System.out.println("s2:"+s2);
//        for (String s2:this.names){
//            s1 =s2+this.delimiter;
        return s2;
        }
    }

