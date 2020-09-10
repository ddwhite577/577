package package16;

public class test16 {
    public static void main(String[] args) {
      //  System.out.println("你好Java世界");
        //创建父类对象
        father a=new father();
        a.method();
        a.fatherSole();
        System.out.println(a.num);
        System.out.println(a.father_sole);
        System.out.println("——————————————————————————————++");
        //创建子类对象 向上转型
        father ab=new sub();
        ab.method();
        ab.fatherSole();
        System.out.println(ab.num);
        System.out.println(ab.father_sole);
        System.out.println("——————————————————————————————++");
        //向下转型
        sub b=(sub)ab;
        b.method();
        b.fatherSole();
        b.sunSole();
        System.out.println(b.num);
        System.out.println(b.father_sole);
        System.out.println(b.sub_sole);
    }
}

//父类
class father{
    //相同变量名
    int num=0;
    //仅父类拥有的变量
    int father_sole=1;
    //父类构造方法
    father()
    {
        System.out.println("调用父类构造方法");
    }
    //相同方法名
    void method()
    {
        System.out.println("调用父类重写方法");
    }
    //仅父类有的方法
    void fatherSole()
    {
        System.out.println("调用父类仅有的方法");
    }
}

//子类
class sub extends father {
    //相同变量名
    int num = 2;
    //仅子类拥有的变量
    int sub_sole = 3;
    //子类构造方法
    sub()
    {
        System.out.println("调用子类构造方法");
    }
    //相同方法名
    @Override
    void method() {
        System.out.println("调用子类重写方法");
    }

    //仅子类拥有的方法
    void sunSole()
    {
        System.out.println("仅子类拥有的方法");
    }
}