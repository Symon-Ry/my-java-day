package cn.ry.exer;

public class AccountTest {
    public static void main(String[] args) {
        Account account=new Account();
        Account account1 = new Account("246753", 2000);

        Account.setInterestRate(0.012);
        Account.setMinMoney(1);

        System.out.println(account);
        System.out.println(account1);

        System.out.println(account.getMinMoney());
        System.out.println(account.getInterestRate());
    }
}
