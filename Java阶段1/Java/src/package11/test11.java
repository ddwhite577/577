package package11;
import java.io.*;
import java.util.*;

public class test11 {
    public static void main(String[] args) {
        System.out.println("你好世界");
        try {
            reg();
        }catch (myException e)
        {
            //System.out.println(e);
            e.printStackTrace();
        }
    }
    //普通方法抛出可能的异常
    public static void reg() throws myException {
        throw new myException("这是一个自定义的异常");
    }
}
//自定义异常
class myException extends Exception
{
    //异常类的构造方法
    myException(String msg)
    {
        //调用父级（Exception）构造函数创建异常信息
        super(msg);
    }
}