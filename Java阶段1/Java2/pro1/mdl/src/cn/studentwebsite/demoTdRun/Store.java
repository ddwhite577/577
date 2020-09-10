package cn.studentwebsite.demoTdRun;

public class Store implements Runnable{
    //保证线程安全  使用同步代码块和等待唤醒机制 这里创建一个包子锁对象
    private Bun bz;

    public Store() {
    }

    public Store(Bun bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while(true){
            //同步代码块
            synchronized (bz){
                //当顾客吃完包子的时候 可以开始做包子  即当包子状态为false的时候
                if(!bz.isFlag()){
                    System.out.println("正在准备做包子..");
                    //可能出现线程安全的代码块
                    System.out.println("开始做包子了,请稍等..");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    bz.setSkin("冰鲜皮");
                    bz.setStuffing("猪肉馅");
                    bz.setFlag(true);
                    System.out.println("包子做好了，可以开吃了..");
                    //唤醒顾客可以开吃了
                    System.out.println("正在等待顾客吃完包子..");
                    bz.notify();
                }else{
                    System.out.println(Thread.currentThread().getName()+"等待");
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
