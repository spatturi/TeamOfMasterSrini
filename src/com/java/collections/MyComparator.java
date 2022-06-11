package com.java.collections;

import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        Integer x = (Integer) obj1;
        Integer y = (Integer) obj2;
        if (x<y)
            return +999;
        else if(x>y)
            return -888;
        else
            return 0;
    }
}
