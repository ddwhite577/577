package cn.studentwebsite.demoTdRun;

public class Test {
    public static void main(String[] args) {
        //创建包子对象
        Bun bz=new Bun();

        //顾客开吃
        Client client=new Client(bz);
        //开启线程
        Thread cmt=new Thread(client);
        cmt.start();


        //商家制作包子
        Store store=new Store(bz);
        //开启线程
        Thread smt=new Thread(store);
        smt.start();


//
//        try {
//            Thread.sleep(11000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //  System.out.println("游戏结束");
    }
}
