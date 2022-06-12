package src.com.java.assignments;

public class StringEqualityMapTest {
    public static void main(String[] args) {
        StringEqualityMap s = new StringEqualityMap();
        s.getStrings();
        boolean flag = s.checkStrings();
        if (flag) System.out.println("Both Strings are same");
        else System.out.println("Strings are not same");

    }
}
