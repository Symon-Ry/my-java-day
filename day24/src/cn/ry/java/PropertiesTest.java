package cn.ry.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            Properties prop=new Properties();
            fis=new FileInputStream("jdbc.properties");
            prop.load(fis);

            String name = prop.getProperty("name");
            String age = prop.getProperty("age");

            System.out.println("name:"+name);
            System.out.println("age:"+age);
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            if(fis!=null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
