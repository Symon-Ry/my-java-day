package cn.ry.java1;

public class Person {
    public Person() {

        System.out.println("人类的构造器");
    }
    {
        System.out.println("人类的普通代码块");
    }
    static {
        System.out.println("人类的静态代码块");
    }
    public static void show(){
        System.out.println("人类的show()");
    }
}
