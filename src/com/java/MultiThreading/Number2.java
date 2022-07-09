package src.com.java.MultiThreading;

public class Number2 extends Thread{

    @Override
    public void run() {
        super.run();

        try {
            for (int i=11;i<=20;i++){
                System.out.println("Thread2:"+i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Exception2 occured");
            //throw new RuntimeException(e);
        }
    }
}
