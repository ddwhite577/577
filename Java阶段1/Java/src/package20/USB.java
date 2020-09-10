package package20;
/*
* 1、接口内部没有方法的实现，都是方法的声明
* 2、接口的权限是public，不能修改成其他权限
* 3、接口没有构造器
* 4、接口可以多继承多个接口
* */
public interface USB {
    public static final int num = 0;

    public abstract int open();

//    public default int close();//错误写法
    public default int close() {
        return 0;
    }

    //静态方法
//    public static void eat();//错误写法
    public static void eat(){}


    //普通私有
//    private void sleep();//错误写法
    private void sleep(){}
    //静态私有
//    private static void behavior();//错误写法
    private static void behavior(){}


    ;
}
