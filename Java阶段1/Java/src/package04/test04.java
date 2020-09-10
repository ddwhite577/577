package package04;

public class test04 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Cake c1=new Cake(1);
        Cake c2=new Cake(2);
        Cake c3=new Cake(3);

        c1=c2=c3=null;

        //调用java垃圾收集器
        System.gc();
    }
}

//普通类
class Cake extends Object
{
    private int id;
    //构造函数
    public Cake(int id)
    {
        this.id=id;
        System.out.println("Cake Object："+id+" is created！");
    }

    //在析构函数之前手动让jvm回收对象内存
    protected void finalize() throws java.lang.Throwable{
        super.finalize();
        System.out.println("Cake Object："+id+" is disposed!");
    }
}
