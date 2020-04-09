package cn.ry.java1;

public class Son extends Father{
    public Son() {
        //super();
        System.out.println("Son类的构造器");
    }
    {
        System.out.println("Son类的普通代码块");
    }
    static {
        System.out.println("Son类的静态代码块");
    }
    public static void show(){
        System.out.println("Son的show()");
    }
    public static void main(String[] args) { // 由父及子 静态先行
        System.out.println("77777777777");
        System.out.println("************************");
        new Son();
        System.out.println("************************");
        new Son();
        System.out.println("************************");
        new Father();
    }
}
/*
人类的静态代码块
Father类的静态代码块
Son类的静态代码块
77777777777
************************
人类的普通代码块
人类的构造器
Father类的普通代码块
Father类的构造器
Son类的普通代码块
Son类的构造器
************************
人类的普通代码块
人类的构造器
Father类的普通代码块
Father类的构造器
Son类的普通代码块
Son类的构造器
************************
人类的普通代码块
人类的构造器
Father类的普通代码块
Father类的构造器

Process finished with exit code 0
 */