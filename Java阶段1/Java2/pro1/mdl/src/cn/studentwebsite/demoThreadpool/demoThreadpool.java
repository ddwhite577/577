package cn.studentwebsite.demoThreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demoThreadpool {
    /*
    * 线程池
    * */
    public static void main(String[] args) {
        //创建线程池
        ExecutorService es= Executors.newFixedThreadPool(2);
        //调用线程池中的线程
        for (int i = 0; i <5 ; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            es.submit(new RunnableTask());
        }
        es.shutdown();
    }
}
