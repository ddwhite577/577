package package19;

import java.util.ArrayList;
import java.util.Random;

public class Menber extends User{
    public Menber() {
    }

    public Menber(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从list中随机抽取一个红包
        int index=new Random().nextInt(list.size());
        //根据索引值抽取一个红包并移除
        int delta=list.remove(index);
        //获取本来拥有的钱
        int money=super.getMoney();
        //加上获取到的红包，存入钱包
        super.setMoney(money+delta);
    }
}
