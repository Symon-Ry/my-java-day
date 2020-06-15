package cn.ry.java1;

import org.junit.Test;

import java.io.*;

public class BufferedReaderWriterTest {
    public static void main(String[] args) {

    }

    @Test
    public void test(){

        BufferedReader br= null;
        BufferedWriter bw= null;
        try {
            br = new BufferedReader(new FileReader(new File("dbcp.txt")));
            bw = new BufferedWriter(new FileWriter(new File("dbcp1.txt")));

            String data;

            while((data=br.readLine())!=null){

                bw.write(data);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br!=null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(br!=null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        }


}
