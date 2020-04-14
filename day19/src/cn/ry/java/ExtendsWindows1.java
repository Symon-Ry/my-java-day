package cn.ry.java;

class Windows1 extends Thread{

    private static int ticket=100;

   // private Object obj=new Object();

    public Windows1(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(true){
            show();
        }
    }
    //private synchronized void show(){//此处使用的同步监视器有w1,w2,w3三个
    private static synchronized void show(){//静态同步方法的同步监视器：Windows1.class
        //synchronized(Windows1.class) {
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket--);
            }
        //}
    }
}

public class ExtendsWindows1 {
    public static void main(String[] args) {
        Windows1 w1=new Windows1("窗口一");
        Windows1 w2=new Windows1("窗口2");
        Windows1 w3 = new Windows1("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
