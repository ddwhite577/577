package stage2.day5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demoCollection {
    public static void main(String[] args){
       // System.out.println("..");
        Collection<String> coll=new ArrayList<>();
        //添加元素
        coll.add("A");
        coll.add("B");
        coll.add("C");


        System.out.println(coll);

        //删除元素
        //coll.remove("B");
        System.out.println(coll);

        //清空集合
        //coll.clear();
        System.out.println(coll);

        //判断是否存在元素
        System.out.println(coll.contains("B"));

        //判断集合是否为空
        System.out.println(coll.isEmpty());

        //获取集合长度
        System.out.println(coll.size());

        //返回数组
        Object[] obj=coll.toArray();

        //遍历数组
        for (int i = 0; i <obj.length ; i++) {
            System.out.print(obj[i]+" ");
        }

        System.out.println();
        //迭代器遍历集合
        Iterator<String> it=coll.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
