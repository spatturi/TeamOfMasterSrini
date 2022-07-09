package src.com.java.map;

import java.util.HashMap;

public class HashMapCompute {
    public static void main(String[] args) {

        HashMap<String,Integer> prices = new HashMap<>();
         prices.put("Shoes",200);
        prices.put("Bag", 300);
        prices.put("Pant", 150);
        System.out.println("HashMap: " + prices);

        // recompute the value of Shoes with 10% discount
        int newPrice = prices.compute("Shoes",(key,value)->value - value*10/100);
        System.out.println("Discounted Price of Shoes: " + newPrice);

        // print updated HashMap
        System.out.println("Updated HashMap: " + prices);

        // compute the value of Shirt
        int shirtPrice = prices.computeIfAbsent("Shirt",key->280);
        int bagPrice = prices.computeIfAbsent("Bag",key->999);
        System.out.println("Price of Shirt: " + shirtPrice);
        System.out.println("New price of bag:"+ bagPrice);
        // print updated HashMap
        System.out.println("Updated HashMap: " + prices);
        //computeIfPresent
        int bagPriceNew = prices.computeIfPresent("Bag",(key,value)->999);
        System.out.println("Updated HashMap: " + prices);
        //.merge()
        int tie = prices.merge("Tie",100,(oldvalue,newvalue)->oldvalue+newvalue);
        int pant = prices.merge("Pant",99,(oldvalue,newvalue)->oldvalue+newvalue);
        System.out.println("Updated HashMap:"+prices);
    }
}
