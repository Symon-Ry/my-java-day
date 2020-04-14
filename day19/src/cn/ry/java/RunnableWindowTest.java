package cn.ry.java;


public class RunnableWindowTest {
    public static void main(String[] args) {
        RunnableWindow window=new RunnableWindow();

        Thread t1=new Thread(window);
        Thread t2=new Thread(window);
        Thread t3=new Thread(window);

        t1.start();
        t2.start();
        t3.start();

    }
}

class RunnableWindow implements Runnable{

    private int tickets=100;

    @Override
    public void run() {
        while(true){
            synchronized(this) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖出的票号为:" + tickets);
                    tickets--;
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else
                    break;
            }
        }
    }
}
