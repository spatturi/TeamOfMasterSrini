package src.com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {

    public static void main(String[] args) {
        try {


//            FileReader fileReader = new FileReader("input.txt");
            FileInputStream file = new FileInputStream("input.txt");
            int size = file.available();
            System.out.println("Total number of available bytes:" +size);
            int n = size/10; // n = 2.

            for (int i = 0; i < n; i++) {
                System.out.print((char) file.read()); // Reading the first two characters W and e.
            }
            System.out.println("\nStill Available bytes: " + file.available());
            byte bytearray[ ] = new byte[2];

            int value=0;
            while ((value=file.read())!=-1){  //-1 means end of file
                System.out.print((char)value);
            }
            file.close();
        }
        catch (Exception e){
            System.out.println("File Read failed:"+e);
        }
    }
}
