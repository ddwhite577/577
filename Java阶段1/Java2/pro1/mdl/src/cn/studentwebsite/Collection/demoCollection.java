package cn.studentwebsite.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class demoCollection {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"A","B","C","D","A");
        System.out.println(list);
        System.out.println("=============");
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("=============");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("=============");

        ArrayList<A> a=new ArrayList<>();
        a.add(new A("A",4));
        a.add(new A("B",2));
        a.add(new A("C",3));
        for (A a1 : a) {
            System.out.println(a1.str+" "+a1.age);
        }
        Collections.sort(a);
        System.out.println("==========");
        for (A a1 : a) {
            System.out.println(a1.str+" "+a1.age);
        }
        Collections.shuffle(a);
        System.out.println("==========");
        Collections.sort(a, new Comparator<A>() {
            //new一个Compartor对象，重写比较规则
            @Override
            public int compare(A o1, A o2) {
               // return 0;//返回0表示不排序
//                return o1.age-o2.age;//前面跟后面比较 是升序
                return o2.age-o1.age;//后面跟前面比较 是降序

            }
        });
        System.out.println(a);

    }
}

class A implements Comparable<A>{
    String  str;
    int age;

    public A() {
    }

    public A(String str, int age) {
        this.str = str;
        this.age = age;
    }
//重写toString方法，否则直接输出对象的时候 只显示地址


    @Override
    public String toString() {
        return "A{" +
                "str='" + str + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(A o) {
//        System.out.println("===========");
//        //自己和别人比较就是升序，别人跟自己比较就是降序
//        System.out.println(this.age+"-"+o.age);

        //自定义比较规则  自己和别人比较就是升序，别人跟自己比较就是降序
        return this.age-o.age;//升序
        // return o.age-this.age;//降序
    }
}
