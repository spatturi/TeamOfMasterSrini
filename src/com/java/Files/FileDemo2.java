package src.com.java.Files;

import java.io.*;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {

        char[] array = new char[100];
        String data = "This line written into output file";

        FileReader input = new FileReader("input.txt");

        //Read Characters
        input.read();
        System.out.println("input:"+input);
        input.read(array);
        System.out.println("Data in the file:");
        System.out.println(array);

        // Closes the reader
        input.close();

        // Creates a Writer using FileWriter
        FileWriter output = new FileWriter("output.txt");
        // Writes string to the file
        output.write(data);
        System.out.println("Data is written to file");

        // Closes the writer
        output.close();

        // creates a file object
        File file = new File("testfil1.txt");
        // deletes the file
         boolean value = file.delete();
         if (value){
             System.out.println("The file hasbeen deleted");
         }
         else {
             System.out.println("The file has not been deleted");
         }



    }
}
