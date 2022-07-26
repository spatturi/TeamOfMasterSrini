package src.com.java.MultiThreading;

public class MultiThread {
    public static void main(String[] args) {

        ThreadCount c = new ThreadCount();

        try{
            while (c.isAlive()){
                System.out.println("Main Method Thread will be alive, until it's Child Thread stays alive");

                Thread.sleep(2500); //Sleep method
            }
        }
        catch (Exception e){
            System.out.println("Main Method thread is interrupted");
        }
        System.out.println("Main Method's thread run is terminated" );
    }
}
