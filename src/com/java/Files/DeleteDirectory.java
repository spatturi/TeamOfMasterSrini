package src.com.java.Files;

import java.io.File;

public class DeleteDirectory {
    public static void main(String[] args) {
        File dir = new File("testdir");

        if(dir.isDirectory() == false) {
            System.out.println("Not a directory. Do nothing");
            return;
        }
        System.out.println("dir.listFiles():"+dir.listFiles());
        File[] listFiles = dir.listFiles();
        for(File file : listFiles){
            System.out.println("Deleting "+file.getName());
            file.delete();
        }
        //now directory is empty, so we can delete it
        System.out.println("Deleting Directory. Success = "+dir.delete());

    }
}
