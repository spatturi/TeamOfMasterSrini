package src.com.java.Files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {

        File file1 = new File("testfil2.txt");

        if (file1.createNewFile()){
            System.out.println("File testfil1.txt Created");
        }
        else {
            System.out.println("File already exist");
        }

        FileReader input = new FileReader("C:\\My_Work_Space\\TeamOfMasterSrini\\testfil1.txt");
        System.out.println(input.read());

        // createing new canonical from file object
        File file2 = file1.getCanonicalFile();
        // returns true if the file exists
        System.out.println("file2:"+file2);
        // returns true if the file exists
        System.out.println("file2.exists()"+file2.exists());
        // returns absolute pathname
        String path = file2.getAbsolutePath();
        System.out.println("Path of file2:"+path);



    }

}
