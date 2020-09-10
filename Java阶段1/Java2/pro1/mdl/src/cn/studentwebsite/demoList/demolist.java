package cn.studentwebsite.demoList;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demolist {
    public static void main(String[] args) {
//        System.out.println("..");
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        System.out.println(list);
        System.out.println("========================");
        list.add(3,"D");
        System.out.println(list);
        System.out.println("========================");
        String e = list.remove(3);
        System.out.println(e);
        System.out.println("========================");
        list.set(3,"D");
        System.out.println(list);
        System.out.println("========================");
        //普通for遍历
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println("========================");
        //迭代器遍历
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("========================");
        //增强for遍历
        for(String s:list){
            System.out.print(s+" ");
        }


    }
}
