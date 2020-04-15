package cn.ry.java2;

/**
 * 线程通信的应用：经典例题：生产者/消费者问题
 *
 * 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，
 * 店员一次只能持有固定数量的产品(比如:20），如果生产者试图生产更多的产品，店员
 * 会叫生产者停一下，如果店中有空位放产品了再通知生产者继续生产；如果店中没有产品
 * 了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品。
 */

class Clerk{
    private int productCount=0;


    public synchronized void produceProduct() {
        if(productCount<20){
            productCount++;
            System.out.println(Thread.currentThread().getName() + "开始生产第" + productCount + "个产品");
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumerProduct() {
        if (productCount>0) {
            System.out.println(Thread.currentThread().getName()+"开始消费第"+productCount+"个产品");
            productCount--;
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer extends Thread{

    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk=clerk;
    }

    @Override
    public void run() {

        System.out.println("开始生产产品...");
        while (true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}

class Customer extends Thread{
    private Clerk clerk;
    public Customer(Clerk clerk) {
        this.clerk=clerk;
    }

    @Override
    public void run() {

        System.out.println("开始消费产品...");
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumerProduct();
        }
    }
}

public class ProductTest {
    public static void main(String[] args) {

        Clerk clerk=new Clerk();

        Producer producer=new Producer(clerk);
        producer.setName("生产者");
        Customer customer=new Customer(clerk);
        Customer customer2=new Customer(clerk);
        customer.setName("消费者1");
        customer2.setName("消费者2");

        producer.start();
        customer.start();
        customer2.start();
    }
}
