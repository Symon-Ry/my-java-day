package cn.ry.java1;


import java.util.ArrayList;

@MyAnnotation(value = "hi")
public class AnnotationTest {
    public static void main(String[] args) {
        @MyAnnotation
        @SuppressWarnings("unused")
        int num=10;

        System.out.println("Hello");
    }
}
class Generic<@MyAnnotation T>{

    public void show() throws @MyAnnotation RuntimeException{

        ArrayList<@MyAnnotation String> list = new ArrayList<>();

        int num = (@MyAnnotation int) 10L;
    }

}
