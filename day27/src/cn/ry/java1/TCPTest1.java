package cn.ry.java1;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPTest1 {
    @Test
    public void client(){
        OutputStream os = null;
        Socket socket=null;
        try {
            socket=new Socket(InetAddress.getByName("127.0.0.1"),9999);
            os = socket.getOutputStream();

            os.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(os!=null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }

    @Test
    public void server(){

        ServerSocket ss= null;
        InputStream is = null;
        ByteArrayOutputStream bos = null;
        try {
            ss = new ServerSocket(9999);
            Socket socket = ss.accept();
            is = socket.getInputStream();

            bos = new ByteArrayOutputStream();
            byte[] bbf=new byte[1024];
            int len;
            while((len=is.read(bbf))!=-1){
                bos.write(bbf,0,len);
            }
            System.out.println(bos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(ss!=null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}
