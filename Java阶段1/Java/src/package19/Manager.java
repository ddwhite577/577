package package19;

import java.util.ArrayList;

public class Manager  extends User{
    public Manager(){
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count) {
        //存储被分配的金额
        ArrayList<Integer> list=new ArrayList<>();

        //查看群主金额
        int leftMoney=super.getMoney();
        if(totalMoney>leftMoney){
            System.out.println("余额不足");
            return list;
        }

        //扣钱
        super.setMoney(leftMoney-totalMoney);

        //分配钱
        int arg=totalMoney/count;
        //除不尽，将余数存储起来
        int mod=totalMoney%count;
        //分配
        for (int i = 0; i < count-1; i++) {
            list.add(arg);
        }
        //将最后一个红包多存储一点
        list.add(arg+mod);


        return list;
    }
}
