package cn.ry.java;

/**
 * 例子：创建窗口类继承于thread类，实例化3个对象买票
 *
 * 存在线程安全问题，待解决
 */
class Window extends Thread {

    private static int tickets=100;

    public Window() {
    }

    public Window(String name) {
        super(name);
    }

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

public class WindowTest{
    public static void main(String[] args) {
        Window window1=new Window("窗口一：");
        Window window2=new Window("窗口二：");
        Window window3=new Window("窗口三：");

        window1.start();
        window2.start();
        window3.start();
    }
}
