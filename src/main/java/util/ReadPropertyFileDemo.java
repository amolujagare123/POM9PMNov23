package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFileDemo {

    public static void main(String[] args) throws IOException {
        // 1. read the file
        FileInputStream fis = new FileInputStream("Config/config.properties");

        // 2. create the object of Properties Class
        Properties prop = new Properties();

        // 3. load the prop object with file object
        prop.load(fis);

        // 4. read the value of the key using prop object & getProperty() method
        System.out.println(prop.getProperty("url"));
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("password"));



    }
}
