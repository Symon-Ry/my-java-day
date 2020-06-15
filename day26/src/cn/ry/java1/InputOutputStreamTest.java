package cn.ry.java1;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStreamTest {
    @Test
    public void test(){

        FileInputStream fis= null;
        FileOutputStream fos= null;
        try {
            fis = new FileInputStream(new File("C:\\Users\\Symon\\Desktop\\01-视频.avi"));
            fos = new FileOutputStream(new File("C:\\Users\\Symon\\Desktop\\02-视频.avi"));

            byte[] bbf=new byte[5];
            int len=0;

            while((len=fis.read(bbf))!=-1){
                fos.write(bbf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis!=null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos!=null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    public void copyByteFile(String srcPath,String destPath){
        FileInputStream fis= null;
        FileOutputStream fos= null;
        try {
            fis = new FileInputStream(new File(srcPath));
            fos = new FileOutputStream(new File(destPath));

            byte[] bbf=new byte[1024];
            int len=0;

            while((len=fis.read(bbf))!=-1){
                fos.write(bbf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis!=null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos!=null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
    @Test
    public void test1(){
        long start = System.currentTimeMillis();
        copyByteFile("C:\\Users\\Symon\\Desktop\\01-视频.avi","C:\\Users\\Symon\\Desktop\\03-视频.avi");
        long end=System.currentTimeMillis();
        System.out.println("复制所花费时间："+(end-start));//846
    }


}
