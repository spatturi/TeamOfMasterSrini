package src.com.java.assignments;

import java.util.*;

public class StringEqualityMap {

    private String str1;
    private String str2;
    private static Map<Character,Integer> m = new HashMap<Character, Integer>();

    public void getStrings(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input String1:");
        str1 = sc.next();
        System.out.println("Please input String2:");
        str2 = sc.next();
    }

    public boolean checkStrings(){
        if (str1.length()!=str2.length()) return false;
        if (str1.equals(str2)) return true;
        for (int i=0;i<str1.length();i++){
            if (m.containsKey(str1.charAt(i))){
                m.put(str1.charAt(i),m.get(str1.charAt(i))+1);
            }
            else {
                m.put(str1.charAt(i),1);
            }
        }
        for (int i=0; i<str2.length();i++){
            if (!m.containsKey(str2.charAt(i))){
                return false;
            }
            else {
                m.put(str2.charAt(i),m.get(str2.charAt(i))-1);
            }
        }

//        Collection values = m.values();
//        System.out.println("values"+values);
//        Iterator itr = values.iterator();
//        while (itr.hasNext()){
//            Integer x = (Integer)itr.next();
//            System.out.println("x:"+x);
//            if (x!=0){
//                return false;
//            }
//
//        }
        Iterator itr = m.entrySet().iterator();
        while (itr.hasNext()){
//            System.out.println(itr.next());
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+","+entry.getValue());
            Integer x = (Integer) entry.getValue();
            if (x!=0){
                return false;
            }

        }

        return true;
    }
}
