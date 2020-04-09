package cn.ry1.java1;

import java.sql.SQLOutput;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);

        Plane plane=new Plane();
        plane.fly();
    }
}

interface Flyable{

    //全局常量
    public static final int MAX_SPEED=7900;
    int MIN_SPEED=1;//省略public static final

    //抽象方法
    public abstract void fly();
    void stop();//省略了public abstract

}
interface Attack{
    void attack();
}

class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Plane fly!");
    }

    @Override
    public void stop() {
        System.out.println("Plane stop!");
    }
}

abstract class Kite implements Flyable{
    @Override
    public void fly() {

    }
}

class Bullet extends Object implements Flyable,Attack,CC{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}


//******************
interface AA{
    void method1();
}
interface BB{

    void method2();
}

interface CC extends AA,BB{

}
class CC1 implements CC{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}