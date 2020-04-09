package cn.ry1.java;

public class TemplateMethodTest {
    public static void main(String[] args) {
        BankTemplateMethod btm= new DrawMoney();
        btm.process();

        BankTemplateMethod btm1= new ManageMoney();
        btm1.process();
    }
}
abstract class BankTemplateMethod{
    public void takeNumber(){
        System.out.println("排队取号");
    }

    public abstract void transact();//办理具体的业务（钩子方法）

    public void evaluate(){
        System.out.println("反馈评分");
    }

    //模板方法，把基本的操作组合在一区，子类一般不重写
    public final void process(){
        this.takeNumber();
        this.transact();//像一个钩子，具体执行时，挂哪个子类，就执行哪个子类的实现方法
        this.evaluate();
    }
}
class DrawMoney extends BankTemplateMethod{
    @Override
    public void transact() {
        System.out.println("我要取款");
    }
}
class ManageMoney extends BankTemplateMethod{
    @Override
    public void transact() {
        System.out.println("我要理财");
    }
}
