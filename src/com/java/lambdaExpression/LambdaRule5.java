package com.java.lambdaExpression;

public class LambdaRule5 {
    public static void main(String[] args) {
        Printable printable = (x,y)-> System.out.println(x+" : "+y );
        doStuff(printable);
    }

    private static void doStuff(Printable printable) {
        printable.print("hello",5);
    }
}
interface Printable{
    public void print(String msg, int count);
}