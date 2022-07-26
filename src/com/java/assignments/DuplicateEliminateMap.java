package src.com.java.assignments;

import java.util.*;

public class DuplicateEliminateMap {
    public static void main(String[] args) {

        int[] array = {10,20,10,30,20,40,50};

        Set<Integer> set = new LinkedHashSet<>();
        for (int i=0; i<array.length;i++){
            if (set.contains(array[i])){
                continue;
            }
            else {
                set.add(array[i]);
            }
        }
        System.out.println(set);
    }
}
