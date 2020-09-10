package cn.studentwebsite.demoThread;

public class demoThread {
    public static void main(String[] args) {
//        //创建线程
//        myThread mt=new myThread();
//        //启动线程  直接执行run方法是main单线程
//        mt.start();


//        for (int i = 0; i < 20; i++) {
//            System.out.println("main："+i);
//        }
//        System.out.println(Thread.currentThread().getName());
//        myThread mt1=new myThread();
//        mt1.start();
//
//        for (int i = 0; i <10 ; i++) {
//            try{
//            Thread.sleep(500);
//            System.out.println(i+"秒");
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
    }
}

class myThread extends Thread{
    @Override
    public void run(){
//        for (int i = 0; i < 20; i++) {
//            System.out.println("run："+i);
//        }
        System.out.println(Thread.currentThread().getName());
    }
}

