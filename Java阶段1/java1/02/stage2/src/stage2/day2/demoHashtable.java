package stage2.day2;

import java.util.Enumeration;
import java.util.Hashtable;

public class demoHashtable {
    public static void main(String[] args) {
        //哈希表时字典的具体实现 实现了Map接口
        //创建一张哈希表
        Hashtable hashtable=new Hashtable();
        System.out.println(hashtable);
        System.out.println(hashtable.size());
        System.out.println("===================");

        //枚举
        Enumeration key;
        //字符串
        String str;
        hashtable.put("A",1);
        hashtable.put("B",2);

        //将键存到枚举
        key=hashtable.keys();
        System.out.println(key);
        while(key.hasMoreElements())
        { System.out.println("Key: "+key.nextElement());}
    }
}
