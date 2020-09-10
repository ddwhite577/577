package cn.studentwebsite.demoTdRun;

public class Client implements Runnable{
  private   Bun bz;

    public Client(Bun bz) {
        this.bz = bz;
    }

    @Override
    public void run() {

        while(true){
            //判断包子是否可以开吃 进入等待被唤醒  同步代码块
            synchronized (bz){
                //有包子 就吃包子
                if(bz.isFlag()) {
                    //被唤醒后 开吃
                    System.out.println(Thread.currentThread().getName()+"开始吃包子了：" + bz.getSkin() + "+" + bz.getStuffing());
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //吃完了  继续让商家做包子
                    System.out.println("我吃完了");
                    bz.setFlag(false);
                    System.out.println("----------------------------");
                    //没包子 就等待
                    System.out.println("没有包子，正在等待商家制作包子");
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
