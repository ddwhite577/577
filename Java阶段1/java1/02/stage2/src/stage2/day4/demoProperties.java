package stage2.day4;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class demoProperties {
    public static void main(String[] args) {
        //
       // show1();
        //将Properties集合中的数据写入文件
       // show2();
        //将文件中的数据保存到properties集合
        show3();
    }
    public static void show1(){
       //属性Properties集合的使用
        Properties prop=new Properties();//创建一个集合 键值默认为String
        //向集合中存储数据
        prop.setProperty("A","a");//底层用的是HashTable的put方法
        prop.setProperty("B","b");
        prop.setProperty("C","c");

        //取出集合中的键
        Set<String> key=prop.stringPropertyNames();
        //读取集合中的数据
        for (String s : key) {
            System.out.println("键："+s+" 值："+prop.getProperty(s));
        }
    }
    public static void show2(){
        //属性Properties集合的使用
        Properties prop=new Properties();//创建一个集合 键值默认为String
        //向集合中存储数据
        prop.setProperty("A","a");//底层用的是HashTable的put方法
        prop.setProperty("B","b");
        prop.setProperty("C","c");

        try (//创建字节流对象
             FileOutputStream fos = new FileOutputStream("prop.txt");){
            //将集合中的数据保存到文件
            prop.store(fos,"SAVE DATA");
        }catch (IOException e){
            e.printStackTrace();
        }

        //属性Properties集合的使用
        Properties prop1=new Properties();//创建一个集合 键值默认为String
        //向集合中存储数据
        prop1.setProperty("李","a");//底层用的是HashTable的put方法
        prop1.setProperty("张","b");
        prop1.setProperty("成","c");

        try (//创建字符流对象
             FileWriter fw = new FileWriter("prop.txt",true);){
            //将集合中的数据保存到文件
            prop1.store(fw,"SAVE DATA");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void show3(){
        //创建Properties集合
        Properties prop=new Properties();
        //字节流读取
        try(
                //创建字节流
                FileInputStream fis=new FileInputStream("prop.txt");
                ){
            //读取数据
            prop.load(fis);
            //不为空 有数据 显示
            if(!prop.isEmpty()){
                //获取键
                Set<String> set=prop.stringPropertyNames();
                //获取值
                for(String v:set){
                    System.out.println("键："+v+" 值："+prop.getProperty(v));
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        prop.clear();
        System.out.println("============");
        //字符流读取
        try(
                //创建字节流对象
                FileReader fr=new FileReader("prop.txt");
                ){
            //读取数据
            prop.load(fr);
            //
            if(!prop.isEmpty()){
                //获取键
                Set<String> set=prop.stringPropertyNames();
                System.out.println(set);
                //获取值
                for (String s : set) {
                    System.out.println("键："+s+" 值："+prop.getProperty(s));
                }
            }
        }catch (IOException  e){
            e.printStackTrace();
        }
    }
}
