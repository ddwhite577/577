package cn.studentwebsite.demoMutiThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class demoMulThread {
    public static void main(String[] args) {

        //创建实现类
        Runnable run=new myThread();
        //创建3个线程同时卖票
        for (int i = 0; i <3 ; i++) {
            //创建线程
            Thread mt=new Thread(run);
            //开始线程
            mt.start();
        }
    }
}

class myThread implements Runnable{

    //共享数据
    private  int ticket=100;

    Lock lock=new ReentrantLock();

    //卖票.
    @Override
    public void run() {

        lock.lock();
        System.out.println("开始售票");
        //使用死循环卖票
        while (true){
            if(ticket>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                }
                //票存在
                System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                ticket--;
            }
            else {
                System.out.println("已售票完");
                break;
            }
        }
        lock.unlock();
        System.out.println("结束售票");
    }

    //同步方法
    public  synchronized void method(){
        System.out.println("开始售票");
        //使用死循环卖票
        while (true){
            if(ticket>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                }
                //票存在
                System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                ticket--;
            }
            else {
                System.out.println("已售票完");
                break;
            }
        }
        System.out.println("结束售票");

    }
}
