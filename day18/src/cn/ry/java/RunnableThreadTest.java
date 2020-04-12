package cn.ry.java;

public class RunnableThreadTest {
    public static void main(String[] args) {
        MyThread m=new MyThread();


        Thread t=new Thread(m);
        t.setName("线程1：");

        Thread t1=new Thread(m);
        t1.setName("线程2：");
        t.start();
        t1.start();
    }
}
class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0)
                System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

