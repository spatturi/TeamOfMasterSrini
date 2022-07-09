package src.com.java.propertiesdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesTest {
    public static void main(String[] args) throws IOException {

        FileInputStream f = new FileInputStream("src/com/java/propertiesdemo/db.properties");
        Properties p = new Properties();
        p.load(f);

        String username = p.getProperty("username");
        String username1 = p.getProperty("username1");//null
        String username2 = p.getProperty("username1","superuser");//superuser
        String password = p.getProperty("password");


        System.out.println("username:"+username+","+"password:"+password);
        System.out.println("username1:"+username1);
        System.out.println("username2:"+username2);
    }
}
