package src.com.java.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
//If we don't use immutable List as value, then the unmodifiable Map with mutable List will also not be immutable.
public class MapOf2 {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("a1");
        list1.add("b1");
        list1.add("c1");

        List<String> list2 = new ArrayList<>();
        list2.add("A1");
        list2.add("B1");
        list2.add("C1");

        Map<Integer,List<String>> map = Map.of(101,list1,102,list2);
        System.out.println(map);
        list1.add("d1");
        list2.add("D1");
        System.out.println(map);
    }
}
