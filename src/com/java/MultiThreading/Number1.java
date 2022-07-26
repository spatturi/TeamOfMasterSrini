package src.com.java.MultiThreading;

public class Number1 extends Thread{

    @Override
    public void run() {
        super.run();

        try {
            for (int i=1;i<=10;i++){
                System.out.println("Thread1:"+i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Exception occured");
            //throw new RuntimeException(e);
        }
    }
}
