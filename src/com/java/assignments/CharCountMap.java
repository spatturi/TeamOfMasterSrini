package src.com.java.assignments;

import java.util.HashMap;
import java.util.Map;

public class CharCountMap {

    private final String  name;
    Map<Character,Integer> m = new HashMap<>();

    public CharCountMap(String name) {
        this.name = name;
    }

    public void charCount(){

        int l = this.name.length();
        for (int i=0;i<l;i++){
            if (m.containsKey(name.charAt(i))){
                m.put(name.charAt(i),m.get(name.charAt(i))+1);
            }
            else {
                m.put(name.charAt(i),1);
            }
        }
        System.out.println(m);

    }
}
