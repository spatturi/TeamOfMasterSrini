package src.com.java.map;

import java.util.List;
import java.util.Map;

public class MapOf1 {

    public static void main(String[] args) {


        //immutable Map with immutable List

        List<String> imList1 = List.of("Sreeni", "Dhruva", "Vasu");
        List<String> imList2 = List.of("Patturi", "Ammu", "Aditri");

        Map<Integer, List<String>> imMap1 = Map.of(101, imList1, 102, imList2);
        System.out.println(imMap1);
    }
}