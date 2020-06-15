package cn.ry.java;

import org.junit.Test;

import java.io.File;

public class FileTest {
    @Test
    public void test(){
        
    }
    public static void main(String[] args) {
        //相对路径，相对于当前module
        File file = new File("hello.txt");

        File file1 = new File("");
    }
}
