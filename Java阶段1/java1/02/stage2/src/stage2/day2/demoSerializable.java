package stage2.day2;

import java.io.*;

class Employee implements Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck(){
        System.out.println("Mail a check to "+name+" "+address);
    }
}

public class demoSerializable {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.name="A";
        e.address="zh-ch";
        e.SSN=123456;
        e.number=101;
        e.mailCheck();
        try{
            FileOutputStream fileOut=new FileOutputStream("./e.ser");
            ObjectOutputStream out=new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
        }catch (IOException i)
        {
            i.printStackTrace();
        }

        //反序列化
        Employee ee=null;
        try {
            FileInputStream fileIn=new FileInputStream("./e.ser");
            ObjectInputStream in=new ObjectInputStream(fileIn);
            ee=(Employee)in.readObject();
            in.close();
            fileIn.close();
        }catch (IOException i){
            i.printStackTrace();
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }
        //
        System.out.println(ee.name);
        System.out.println(ee.address);
        System.out.println(ee.SSN);
        System.out.println(ee.number);
    }
}
