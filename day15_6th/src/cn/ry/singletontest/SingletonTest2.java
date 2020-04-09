package cn.ry.singletontest;

import com.sun.org.apache.xpath.internal.operations.Or;

public class SingletonTest2 {
    public static void main(String[] args) {
        Order order1=Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1==order2);
    }
}
/**单例模式的懒汉式
 * 好处：延迟对象的创建
 * 劣势：线程不安全
 */

class Order{
    private Order(){}
    private static Order order=null;

    public static Order getInstance(){
        if(order==null) {
            order = new Order();
            return order;
        }
        return order;
    }

}

