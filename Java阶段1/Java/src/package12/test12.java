package package12;

public class test12 {
    public static void main(String[] args) {
        System.out.println("你好世界..");
        A a=new B();
        a.this_A();
      //  A c=new A();

        System.out.println("————————————————————————————");
        B b=new B();
        b.this_A();
        b.this_B();
        System.out.println("————————————————————————————");
        //等号左边是谁，就优先用谁的成员变量
        System.out.println(a.num);
        System.out.println(b.num);
        System.out.println("————————————————————————————");
        //创建的对象是谁 就用谁的方法
        a.method();
        b.method();
      //  c.method();
        System.out.println("————————————————————————————");
        //子类和父类有相同数据成员 子类调用父类方法  则使用父类数据成员
        a.methodF();
        b.methodZ();
        b.methodF();
    }
}

class A{
    int num=100;
 A(){
      System.out.println("这是A的构造函数");
    }
    void this_A()
    {
        System.out.println("这是A的方法");
    }

    public String method()
    {
        System.out.println(num);
        return null;
    }
    public void methodF()
    {
        System.out.println(num);
    }
}

class B extends A{
    int num=200;
    B(){
        System.out.println("这是B的构造函数");
    }
    void this_B()
    {
        System.out.println("这是B的方法");
    }
    //@Override
    public String method()
    {
        //super.method();
        System.out.println(num);
        return null;
    }
    public void methodZ()
    {
        System.out.println(num);
    }
}

