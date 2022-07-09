package src.com.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<Integer,String> m1 = new HashMap<Integer, String>();
        Map<Integer,String> m2 = new HashMap<Integer, String>();

        //Insert Elements
        m1.put(1,"Srini");
        m1.put(2,"Patturi");
        m1.put(3,"Dhruva");
        m1.put(2,"PATTURI");
        System.out.println("m1:"+m1);
        m1.remove(3);
        System.out.println("m1 after remove:"+m1);

        m2.put(1,"Srini");
        m2.put(2,"Patturi");
        m2.put(3,"Dhruva");
        System.out.println("m2:"+m2);
        m2.put(3,"Dhruva Patturi");
        System.out.println("m2 after update:"+m2);
        System.out.println("m2 size:"+m2.size());
        System.out.println("m2 contains key 2:"+m2.containsKey(2));
        System.out.println("m2 contains value:"+m2.containsValue("abcd"));

        System.out.println("m2 entrySet:"+m2.entrySet());
        System.out.println("m2 keys:"+m2.keySet());
        System.out.println("m2 values:"+m2.values());
        //finding value

        for (Map.Entry mapElement:m2.entrySet()){
            System.out.println("mapElement:"+mapElement);
            int key = (int) mapElement.getKey();
            String value= (String) mapElement.getValue();
            System.out.println("Key:"+key+","+"value:"+value);
        }
        System.out.println("m1:"+m1);
        m1.putAll(m2);
        System.out.println("m1 after putAll m2:"+m1);
        System.out.println("m1.keySet():"+m1.keySet());
        System.out.println("equals:"+m1.equals(m2));
        System.out.println("getOrDefault:"+m1.getOrDefault(2,"default"));
        System.out.println("getOrDefault:"+m1.getOrDefault(4,"default"));
        for (int i:m1.keySet()){
            System.out.println("i:"+i);
        }
        System.out.println(m1.values());


    }
}
