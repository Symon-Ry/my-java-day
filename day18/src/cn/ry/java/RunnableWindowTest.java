package cn.ry.java;

/**
 * 例子：创建三个窗口卖票，总票数为100张.使用实现Runnable接口的方式
 * 存在线程的安全问题，待解决。
 */
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
            if(tickets>0){
                System.out.println(Thread.currentThread().getName() + "卖出的票号为:" + tickets);
                tickets--;
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else
                break;
        }
    }
}
