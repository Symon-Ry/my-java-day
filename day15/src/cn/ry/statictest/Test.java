package cn.ry.statictest;

public class Test {
    public static void main(String[] args) {
        Account account=new Account("password123",5000);
        System.out.println(account);
        Account account1=new Account("password123",5000);
        System.out.println(account1);
        Account account2=new Account("password123",5000);
        System.out.println(account2);
    }
}
