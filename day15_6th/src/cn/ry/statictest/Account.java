package cn.ry.statictest;

/**
 * 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码、编写一个类实现银行账户的概念，
 * 包含的属性有“帐号”、“密码、“存款余额”、“利率”、“最小余额”，定义封装这些属性的方法。
 * 账号要自动生成。编写主类，使用银行账户类，输入、输出3个储户的.上述信息。
 * 考虑:哪些属性可以设计成static属性。
 */
public class Account {
    private int accountNum;
    private static int init=1001;
    private String password;
    private int accountMoney;
    private static double rate;
    private static int minBalance=1000;

    public Account(String password, int accountMoney) {
        this.password = password;
        this.accountMoney = accountMoney;
        accountNum=init++;
    }

    public int getAccountNum() {
        return accountNum;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(int accountMoney) {
        this.accountMoney = accountMoney;
    }

    public static double getRate() {
        return rate;
    }

    public static int getMinBalance() {
        return minBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNum=" + accountNum +
                ", password='" + password + '\'' +
                ", accountMoney=" + accountMoney +
                '}';
    }
}
