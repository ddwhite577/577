package stage2.day2;

import java.util.Vector;

public class demoVector {
    public static void main(String[] args) {
        //Vector容器 异步访问这是与ArrayList不同的地方
        //该容器主要用于事先不知道数组大小，或者只需一个可以改变大小的数组情况
        //创建一个容器v开始大小为3，当数据大于3时，以增量2自动扩大容器
        Vector<Integer> v=new Vector<>(3,2);
        System.out.println("容器当前元素个数："+v.size());
        System.out.println("容器大小最大值为："+v.capacity());
        //向容器添加元素
        for (int i = 0; i < v.capacity(); i++) {
          v.add(i);
        }
        System.out.println("add后，目前元素个数："+v.size());
        System.out.println("======================");
        //显示
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.elementAt(i));
        }
       // v.clear();
        System.out.println("======================");
        String str=v.toString();
        System.out.println(str);
        System.out.println("======================");
        System.out.println("======================");
        System.out.println("======================");
        System.out.println("======================");

    }
}
