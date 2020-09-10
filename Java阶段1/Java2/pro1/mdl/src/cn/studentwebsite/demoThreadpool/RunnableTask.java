package cn.studentwebsite.demoThreadpool;

public class RunnableTask implements Runnable {
    @Override
    public void run() {
        System.out.println("线程名："+Thread.currentThread().getName());
        System.out.println("线程状态："+Thread.currentThread().getState());
    }
}
