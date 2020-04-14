package cn.ry.java;


public class RunnableWindowTest1 {
    public static void main(String[] args) {
        RunnableWindow1 window=new RunnableWindow1();

        Thread t1=new Thread(window);
        Thread t2=new Thread(window);
        Thread t3=new Thread(window);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}

class RunnableWindow1 implements Runnable{

    private int tickets=100;

    @Override
    public void run() {
        while(true){
            show();
        }
    }
    private synchronized void show(){//同步监视器：this（即window）
        //synchronized(this) {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖出的票号为:" + tickets);
            tickets--;
        }
        //}
    }
}
