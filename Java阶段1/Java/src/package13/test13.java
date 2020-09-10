package package13;
/*
* super关键字三个用途
* 1、在子类成员方法中 ，访问父类的数据成员
* 2、在子类成员方法中，访问父类的成员方法
* 3、在子类构造方法中，访问父类的构造方法（每个子类的构造方法只能调用一次父类的构造方法）
*
*
* this关键字三个用途
* 1、在本类方法中，访问本类的数据成员
* 2、在本类方法中，访问本类的另外一个成员方法
* 3、在本类的构造方法中，访问本类的另外一个构造方法
* */

public class test13 {
    public static void main(String[] args) {
        System.out.println("你好Java世界");
       // B b=new B();
        C c=new C();
      //  c.method();
    }
}
class A{
    A(){
        System.out.println("这是A的构造函数");
    }
    void method()
    {
        System.out.println("这是A");
    }
}
class B extends A
{
    B(){
        System.out.println("这是B的构造函数");
    }
    @Override
    void method()
    {
        System.out.println("这是B");
    }
}
class C extends B{
    C()
    {
        System.out.println("这是C的构造函数");
        super.method();
    }
    void method()
    {
        System.out.println("这是C");
    }
}
