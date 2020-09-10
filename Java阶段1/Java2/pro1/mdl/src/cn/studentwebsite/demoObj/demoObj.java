package cn.studentwebsite.demoObj;

import java.io.*;
import java.security.PrivateKey;

public class demoObj {
    public static void main(String[] args) {

        //序列化
        try
                (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("a.txt"));){
            oos.writeObject(new Person("AA",1));
        }catch (IOException e){
            e.printStackTrace();
        }

        //反序列化
        try(
                ObjectInputStream ois=new ObjectInputStream(new FileInputStream("a.txt"));
                ){
            Object obj=ois.readObject();
            System.out.println(obj);
            Person p=(Person)obj;
            System.out.println("姓名："+p.getName()+"年龄："+p.getAge());
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

class Person implements Serializable {
    //手动添加序列号
    private static final long servialVersionID=1L;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
