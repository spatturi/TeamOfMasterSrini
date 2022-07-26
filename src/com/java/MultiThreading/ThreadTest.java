package src.com.java.MultiThreading;

public class ThreadTest {
    public static void main(String[] args) {

        Number1 thread1 = new Number1();
        thread1.start();
        System.out.println(thread1.getPriority());
        thread1.setPriority(2);
        System.out.println(thread1.getPriority());
        Number2 thread2 = new Number2();
        thread2.start();
        System.out.println(thread2.getPriority());
        thread2.setPriority(9);

    }
}
