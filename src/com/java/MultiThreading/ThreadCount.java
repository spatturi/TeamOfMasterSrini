package src.com.java.MultiThreading;

public class ThreadCount extends Thread {

    ThreadCount() {
        super("Overriding Thread cLass");
        System.out.println("New thread created" + this);
        start();
    }

    public void run() { //Run Method
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("New thread created" + this);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Currently executing thread is interrupted");
        }
        System.out.println("Currently executing thread run is terminated");

    }
}