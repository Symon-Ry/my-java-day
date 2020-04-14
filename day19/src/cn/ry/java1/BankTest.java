package cn.ry.java1;

/*
* 线程安全的单例模式饿汉式
* */
public class BankTest {
    public static void main(String[] args) {

    }
}
class Bank{

    private Bank(){}

    private static Bank instance=null;

    public static Bank getInstance(){
        //方式一（效率稍差):
        //synchronized (Bank.class) {
        //    if (instance == null)
        //        instance = new Bank();
        //    return instance;
        //}

        //方式二:效率更高
        synchronized (Bank.class){
            if(instance==null)
                instance=new Bank();
        }
        return instance;
    }
}
