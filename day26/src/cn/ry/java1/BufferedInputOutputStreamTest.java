package cn.ry.java1;

import org.junit.Test;

import java.io.*;

public class BufferedInputOutputStreamTest {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();

        bufferedCopy("C:\\Users\\Symon\\Desktop\\01-视频.avi","C:\\Users\\Symon\\Desktop\\04-视频.avi");

        long end=System.currentTimeMillis();

        System.out.println("复制所花费时间："+(end-start));//846 --->204
    }

    public static void bufferedCopy(String srcPath,String destPath){
        BufferedInputStream bis= null;
        BufferedOutputStream bos= null;
        try {
            bis = new BufferedInputStream(new FileInputStream(new File(srcPath)));
            bos = new BufferedOutputStream(new FileOutputStream(new File(destPath)));

            byte[] bbf=new byte[1024];
            int len=0;

            while ((len=bis.read(bbf))!=-1){
                bos.write(bbf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bis!=null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bos!=null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test(){
        BufferedInputStream bis= null;
        BufferedOutputStream bos= null;
        try {
            bis = new BufferedInputStream(new FileInputStream(new File("C:\\Users\\Symon\\Desktop\\01-视频.avi")));
            bos = new BufferedOutputStream(new FileOutputStream(new File("C:\\Users\\Symon\\Desktop\\04-视频.avi")));

            byte[] bbf=new byte[1024];
            int len=0;

            while ((len=bis.read(bbf))!=-1){
                bos.write(bbf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bis!=null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bos!=null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
