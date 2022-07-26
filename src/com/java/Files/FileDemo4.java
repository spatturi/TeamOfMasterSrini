package src.com.java.Files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {

        String fileData = "abcd";
        FileOutputStream f1 = new FileOutputStream("fileoutput.txt");

        f1.write(fileData.getBytes());
        f1.flush();
        f1.close();

/*
        We can use Java NIO Files class to create a new file and write some data into it.
        This is a good option because we don’t have to worry about closing IO resources.
*/
        String data = "NIO  Files class";
        Files.write(Paths.get("nioFile.txt"),data.getBytes());



    }
}
