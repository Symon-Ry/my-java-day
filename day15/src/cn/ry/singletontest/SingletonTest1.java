package cn.ry.singletontest;

public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank = Bank.getBank();
        Bank bank1=Bank.getBank();
        System.out.println(bank);
        System.out.println(bank1);
        System.out.println(bank instanceof Object);
    }
}
//单例模式的饿汉式
class Bank{
    private Bank(){}
    private static Bank bank=new Bank();

    public static Bank getBank(){
        return bank;
    }
}
