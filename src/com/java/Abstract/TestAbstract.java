package src.com.java.Abstract;

public class TestAbstract {
    public static void main(String[] args) {
//        A a = new A(); A is abstract cannot be instantiated
//        A a = new B();
//        a.m1();
//        a.m2();
//        a.m3();
/*
Result:
        m1 from A
        m2 from B
        m3 from B
*/
        B b = new B();
        b.m1();
        b.m2();
        b.m3();
        b.m4();
/*
Result:
        m1 from A
        m2 from B
        m3 from B
        m4 from B
*/

//        B b = new A(); A is abstract cannot be instantiated
    }
}
