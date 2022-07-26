package src.com.java.map;

import java.util.HashMap;

public class HashMapMerge {
    public static void main(String[] args) {

        HashMap<String,Integer> prices1 = new HashMap<>();

        // insert entries to the HashMap
        prices1.put("Pant", 230);
        prices1.put("Shoes", 350);
        System.out.println("HashMap 1: " + prices1);

        // create another hashmap
        HashMap<String, Integer> prices2 = new HashMap<>();

        //insert entries to the HashMap
        prices2.put("Shirt", 150);
        prices2.put("Shoes", 320);
        System.out.println("HashMap 2: " + prices2);

        // forEach() access each entries of prices2
        // merge() inserts each entry from prices2 to prices1

        prices2.forEach((key,value)->prices1.merge(key,value,(oldvalue,newvalue)->{
            //return smaller value
            if (oldvalue<newvalue){
                return oldvalue;
            }
            else {
                return newvalue;
            }
        }));
        System.out.println("Merged HashMap: " + prices1);
    }
}
