package package14;

public class test14 {
    public static void main(String[] args) {
        System.out.println("你好Java世界..");
        //实体对象
        Animal a=new Animal();//Animal对象  抽象对象
        Animal b=new Dog();//Dog对象  具体对象

        a.move();
        b.move();
    }
}

//动物类
class Animal{
    //普通方法 行为方法
    public  Object move()
    {
        System.out.println("动物可以移动");
        return null;
    }
}

//具体动物
class Dog extends Animal
{
    //重写父类动物行为方法
    @Override
    public String move() {
        System.out.println("狗可以行走");
        return null;
    }
}
