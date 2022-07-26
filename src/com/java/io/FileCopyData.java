package src.com.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyData {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\My_Work_Space\\TeamOfMasterSrini\\input.txt");
            FileOutputStream fos = new FileOutputStream("C:\\My_Work_Space\\TeamOfMasterSrini\\output.txt");

            int i =0;
            while ((i=fis.read())!=-1){
                char ch = (char) i;
                fos.write(ch);
            }
            fis.close();
        }
        catch (Exception e){
            System.out.println("Exception occured"+e);
        }
    }
}
