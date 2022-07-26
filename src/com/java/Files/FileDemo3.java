package src.com.java.Files;

import java.io.File;
import java.io.FileDescriptor;

public class FileDemo3 {
    public static void main(String[] args) {

        File input = new File("C:\\My_Work_Space - Copy");
 //       String[] fileNames = input.list();//same
        String fileNames[] = input.list(); //same

        for (String name:fileNames){
            System.out.println(name);
        }

        File dir = new File("C:\\My_Work_Space - Copy\\FirstApp");

        File files[] =dir.listFiles();
        for (File file:files){
 //           System.out.println("file:"+file);
            System.out.println(file.getName()+" Can write:"+file.canWrite()+
                    "Is Hidden:"+file.isHidden()+"Length:"+file.length()+"bytes");
        }
        

    }
}
