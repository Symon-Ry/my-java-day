package cn.ry.java1;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriteTest {

    @Test
    public void test(){

        FileReader fr= null;
        FileWriter fw= null;
        try {
            fr = new FileReader(new File("hello.txt"));
            fw = new FileWriter(new File("hello1.txt"),false);

            int len=0;
            char[] c=new char[5];
            while((len=fr.read(c))!=-1){
                fw.write(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr!=null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fw!=null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
