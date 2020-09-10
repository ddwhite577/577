package packagelast;

/*
* final的四种用法（abstract和final不能同时使用，因为矛盾。abstract声明必须被子类重写或修改，
* final表示子类不能不能修改final修饰的东西，矛盾。）
* 1、可以修饰一个类
* 2、可以用来修饰一个方法
* 3、还可以用来修饰一个局部变量
* 4、还可以用来修饰一个成员变量
* */

import java.util.Spliterator;

public class last {
    public static void main(String[] args) {
        System.out.println("你好Java世界");
        Myclass a=new Myclass();
        a.method();

        port p=new A();
        p.p();

    }
}

//太监类 该类没有子类 但有父类   所有的成员方法都不可以覆盖重写
 final class  Myclass{
    public void method(){
        System.out.println("这是太监类");
    }
}

class A implements port{
    public final void fun(){
        System.out.println("这是一个A类,并且不能被覆盖重写");
    }

    @Override
    public int p() {
        System.out.println("port");
        return 0;
    }
}

interface port{
    public abstract int p();
}