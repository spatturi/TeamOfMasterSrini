package src.com.java.assignments;

import java.util.Scanner;

public class CharCountMapTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the name to count chars:");
        CharCountMap cMap = new CharCountMap(sc.next());
        cMap.charCount();
    }
}
