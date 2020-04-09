package cn.ry1.java8;

public class SubClassTest {
    public static void main(String[] args) {
        SubClass s=new SubClass();

        //s.method1;//Cannot resolve symbol 'method1'

        CompareA.method1();//在接口中调用的静态方法，只能通过接口来调用

        s.method2();
        /*
        如果子类(或实现类)继承的父类和实现的接口中声明了同名同参数的默认方法，
        那么子类在没有重写此方法的情况下，默认调用的是父类中的同名同参数的方法。-->类优先原则
        */
        s.method3();
        /*
        如果实现类实现了多个接口，而这多个接口中定义了同名同参数的默认方法，
		那么在实现类没有重写此方法的情况下，报错。-->接口冲突。
		这就需要我们必须在实现类中重写此方法
		*/


    }
}
class SubClass extends SuperClass implements CompareA,CompareB{
    public void method2(){
        System.out.println("Subclass:method2");
    }

    public void method3(){
        System.out.println("SubClass:method3");
    }

    public void myMethod(){
        method3();//调用的是自己重写的方法
        super.method3();//调用的是父类中声明的

        //调用接口中的默认方法
        CompareA.super.method3();
        CompareB.super.method3();

        CompareA.super.method2();
    }
}
