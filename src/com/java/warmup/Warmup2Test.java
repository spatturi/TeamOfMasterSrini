package com.java.warmup;

public class Warmup2Test {

    public static void main(String[] args) {
        Warmup2 w2 = Warmup2.warmup2Object();

    //    System.out.println(w2.stringTimes("Hi Hello ",5));
    //    System.out.println(w2.frontTimes("Abc",3));
        System.out.println("countxx:"+w2.countXX("HexxoThxxo"));
        System.out.println("doubleX:"+w2.doubleX("xaxxx"));
        System.out.println("doubleX2:"+w2.doubleX2("xaxxx"));
        System.out.println("doubleX3:"+w2.doubleX3("xaxxx"));
        System.out.println("stringBits:"+w2.stringBits("Heeololeo"));
        System.out.println("stringBits2:"+w2.stringBits2("Hello"));
        System.out.println("stringSplosions:"+w2.stringSplosions("Code"));//"CCoCodCode"
        int[] num ={1,9,2,9,9,4};
        System.out.println("arrayCount9:"+w2.arrayCount9(num));
        int[] num1 ={1,5,2,9,1,9};
        System.out.println("arrayFront9:"+w2.arrayFront9(num1));
        int[] num2 ={1,2,1,2,3,4};
        System.out.println("array123:"+w2.array123(num2));
        System.out.println("stringMatch:"+w2.stringMatch("xxcaazz","xxbaaz"));
        System.out.println("stringX:"+w2.stringX("xxHxix"));
        System.out.println("altPairs:"+w2.altPairs("kittens"));
        System.out.println("stringYak:"+w2.stringYak("yakpak"));
        int[] num3 ={6,7,2,6,6};
        System.out.println("array667:"+w2.array667(num3));
        int[] num4 ={1,1,1};
        System.out.println("noTriples:"+w2.noTriples(num4));
        int[] num5 ={1,2,7,1};
        System.out.println("has271:"+w2.has271(num5));

    }

}
