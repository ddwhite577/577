package package19;

import java.util.function.DoubleToIntFunction;

public class User {
    //姓名
    private String name;
    //余额
    private int money;

    //显示当前用户有多少钱
    public void show(){
        System.out.println("我叫"+name+"，我有多少钱："+money);
    }


    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
