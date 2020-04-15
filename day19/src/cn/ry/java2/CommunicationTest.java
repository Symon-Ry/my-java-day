package cn.ry.java2;

class Number implements Runnable{

    private int number=1;
    @Override
    public void run() {
        while(true){
            synchronized(this) {
                notify();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (number <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + number++);
                } else
                    break;

                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
public class CommunicationTest {
    public static void main(String[] args) {
        Number num=new Number();
        Thread t1=new Thread(num);
        Thread t2=new Thread(num);
        //Thread t3 = new Thread(num);

        t1.start();
        t2.start();
        //t3.start();


    }
}
