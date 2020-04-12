package cn.ry.java;

public class TreadTest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0) {
                System.out.println(Thread.currentThread().getName() +":"+ i);
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        TreadTest t1=new TreadTest();
        t1.start();

        for (int i = 0; i < 100; i++) {
            if(i%2!=0) {
                System.out.println(Thread.currentThread().getName() + ":"+i + "********main*********");
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
