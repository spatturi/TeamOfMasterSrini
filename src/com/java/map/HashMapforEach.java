package src.com.java.map;

import java.util.HashMap;

public class HashMapforEach {
    public static void main(String[] args) {

        HashMap<String, Integer> prices = new HashMap<String, Integer>();
        // insert entries to the HashMap
        prices.put("Shoes", 200);
        prices.put("Bag", 300);
        prices.put("Pant", 150);
        System.out.println("Normal Price: " + prices);

        System.out.print("Discounted Price: ");
        // pass lambda expression to forEach()
        prices.forEach((key,value)->{

            // decrease value by 10%
            value = value - value*10/100;
            System.out.print(key+"="+ value + " ");//Pant=135 Bag=270 Shoes=180

        });

        HashMap<Integer, String> languages = new HashMap<>();

        // add entries to the HashMap
        languages.put(1, "java");
        languages.put(2, "javascript");
        languages.put(3, "python");
        System.out.println("HashMap: " + languages);

        languages.putIfAbsent(2,"Spring");
        languages.putIfAbsent(3,"python");


        // Change all value to uppercase
        //replaceAll
        languages.replaceAll((key,value)->value.toUpperCase());
        System.out.println("languages after update:"+languages);

        // create an HashMap
        HashMap<Integer, Integer> numbers = new HashMap<>();

        // insert entries to the HashMap
        numbers.put(5, 0);
        numbers.put(8, 1);
        numbers.put(9, 2);
        System.out.println("HashMap: " + numbers);

        // replace all value with the square of key
        numbers.replaceAll((key, value) -> key * key);;
        System.out.println("Updated HashMap: " + numbers);

    }
}
