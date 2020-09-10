package package15;

public class test15 {
    public static void main(String[] args) {
        System.out.println("你好Java世界..");
        //多态实现前提条件：继承 重写 父类引用指向子类对象
        show(new Cat());
        show(new Dog());

        System.out.println("————————————————————————————————————————————");
        //向上转型
        Animal a=new Cat();
        a.eat();
        //向下转型
        Cat c=(Cat)a;
        c.work();
    }
    //普通静态方法
    public static void show(Animal a)
    {
        a.eat();
        //instanceof关键字判断某个对象是不是某个类的实例 是返回true 否则false
        if(a instanceof Cat)
        {
            //将a转换成Cat实例对象
            Cat c=(Cat)a;
            c.work();
        }
        else if(a instanceof Dog)
        {
            Dog c=(Dog)a;
            c.work();
        }
    }
}

//动物抽象类
abstract class Animal{
    //抽象方法
    abstract void eat();
}

//具体动物
class Cat extends Animal{
    //重写抽象方法
   @Override
   void eat() {
       System.out.println("Cat吃鱼");
   }
   //普通方法
    public void work(){
        System.out.println("Cat抓老鼠");
    }
}

//具体动物
class Dog extends Animal{
    //重写抽象方法
    @Override
    void eat(){
        System.out.println("Dog吃骨头");
    }
    //普通方法
    public void work(){
        System.out.println("Dog会看家");
    }
}
