package cn.ry.java1;

public class Father extends Person{
    static {
        System.out.println("Father类的静态代码块");
    }
    public Father() {
        //super();
        System.out.println("Father类的构造器");
    }
    {
        System.out.println("Father类的普通代码块");
    }
    public static void show(){
        System.out.println("Father的show()");
    }
}
