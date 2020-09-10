package package10;

import javax.naming.InsufficientResourcesException;
import java.io.*;
import java.rmi.RemoteException;

public class test10 {
    public static void main(String[] args) throws RemoteException, InsufficientResourcesException {
        System.out.println("你好世界..");

//        //数组越界异常
//        try{
//            int a[]=new int[2];
//            System.out.println("Access element three："+a[3]);
//        }catch (Exception e)
//        {
//            System.out.println("Exception thrown："+e);
//        }

//        //多重异常
//        try {
//            FileInputStream file = new FileInputStream("b.txt");
//        } catch(FileNotFoundException f) { // Not valid!
//            f.printStackTrace();
//            return;
//        }
//        return;
        deposit();
    }
    //方法主动抛出异常
    public static void deposit() throws RemoteException, InsufficientResourcesException
    {
        try{
            System.out.println("异常之前的输出");
            throw new RemoteException();
        }
        finally {
            //throw new InsufficientResourcesException();
            System.out.println("异常之后的输出");
        }
    }
}
