package cn.studentwebsite.demoList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class demoHashset {
    public static void main(String[] args) {
        //
        Set<String> hs=new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        System.out.println(hs);
        System.out.println("===============");
        //使用迭代器
        Iterator<String> it=hs.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("==========");
        //增强for
        for(String s:hs){
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("===========");
        System.out.println(hs.hashCode());
        System.out.println("===========");
        fun(1);
    }
public static void fun(int...num){
    System.out.println("可变参");
}
public static void fun()
{
    System.out.println("无参");
}

}

