package cn.ry1.java8;

public interface CompareA {
    //静态方法
    public static void method1() {
        System.out.println("CompareA:method1");
    }

    //默认方法
    public default void method2(){
        System.out.println("CompareA:method2");
    }

    default void method3(){
        System.out.println("CompareA:method3");
    }
}
