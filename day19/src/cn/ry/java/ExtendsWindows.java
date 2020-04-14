package cn.ry.java;

class Windows extends Thread{

    private static int ticket=100;

   // private Object obj=new Object();

    public Windows(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(true){
            //错误的同步方式：this代表w1，w2，w3三个对象
            //synchronized(obj) {
            synchronized (Windows.class){
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + ":卖票，票号为：" + ticket--);
                }else
                    break;
            }
        }
    }
}

public class ExtendsWindows {
    public static void main(String[] args) {
        Windows w1=new Windows("窗口一");
        Windows w2=new Windows("窗口2");
        Windows w3 = new Windows("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
