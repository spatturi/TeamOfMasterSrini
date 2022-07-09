package src.com.java.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapOf {
    private static Map<Integer,String> m1 = Map.of(101,"Srinivas",102,"Patturi");

    public static void main(String[] args) {
        Map<String,Integer> m2 =Map.of("Dhruva",1,"Aditri",2);

        m1.forEach((k,v)-> System.out.println("key:"+k+"value:"+v));
        m2.forEach((k,v)-> System.out.println("key:"+k+"value:"+v));



    }
}
