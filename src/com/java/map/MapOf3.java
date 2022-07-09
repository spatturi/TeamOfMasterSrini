package src.com.java.map;

import java.util.Map;

public class MapOf3 {
    public static void main(String[] args) {

        Student s1 = new Student(10,"Dhruva");
        Student s2 = new Student(7,"Ammu");

        Map<String,Student> map = Map.of("one",s1,"Two",s2);

        map.forEach((k,v)-> System.out.println(k+"-"+v.getName()));
    }
}
