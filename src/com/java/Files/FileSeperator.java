package src.com.java.Files;

import java.io.File;
import java.io.IOException;

public class FileSeperator {
    public static void main(String[] args) throws IOException {
        /*File.seperator = \
          File.seperatorChar = \
          File.pathSeparator = ;
          File.pathSeparatorChar = ;
         */
        System.out.println("File.seperator = "+ File.separator);
        System.out.println("File.seperatorChar = "+File.separatorChar);
        System.out.println("File.pathSeparator = "+ File.pathSeparator);
        System.out.println("File.pathSeparatorChar = "+ File.pathSeparatorChar);


//platform independent and safe to use across Unix and Windows
        System.out.println("Hai\"abc\"hello");
        File fileSafe = new File("tmp"+File.separator+"abc.txt");
        System.out.println(fileSafe.createNewFile());

    }
}
