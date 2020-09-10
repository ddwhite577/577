package cn.studentwebsite.demoRunnable;

public class demoRunnable {
    public static void main(String[] args) {
        //创建实现类对象
        myRunnable run=new myRunnable();
        //创建一个Thread对象
        Thread mt=new Thread(run);
        //启动线程
        mt.start();
        mt.start();

        new Thread(){
            //重写方法
            @Override
            public void run(){
                System.out.println("内部类");
            }
        }.start();

        Runnable r=new Runnable(){
            //重写方法
            @Override
            public void run(){
                System.out.println("内部类");
            }
        };
        new Thread(r).start();
    }
}

class myRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable");
    }
}
