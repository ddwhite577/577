package stage2.day1;


import java.util.ArrayList;
import java.util.Random;

/*
* ArrayList集合
* 1、泛型只能是引用类型 不能是基本数据类型 因为泛型存储的是地址值
* 2、如果要使用基本数据类型，那就要使用基本数据类型的包装类中，比如int对应的包装类Integer
*
* 基本数据类型       包装类
* byte              Byte
* short             Short
* int               Integer 【特殊】
* long              Long
* float             Float
* double            Double
* char              Character   【特殊】
* boolean           Boolean
*
* 从1.5开始，支持自动装箱和拆箱
* 装箱：基本类型-->包装类型
* 拆箱：包装类型-->基本类型
* */
public class demoArrayList2 {
    public static void main(String[] args) {
       // System.out.println("你好Java世界");
        //创建ArrayList集合 类型为string
        //泛型只能是引用类型 不能是基本数据类型 因为泛型存储的是地址值
       // ArrayList<String> list=new ArrayList<>();
//        ArrayList<int> listA=new ArrayList<int>();//错误类型

        //用包装类使用基本数据类型
        ArrayList<Integer> listInt=new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        System.out.println(listInt);
        System.out.println("====================");
        for (int i = 0; i < listInt.size(); i++) {
            System.out.println(listInt.get(i));
        }
        System.out.println("====================");
        int len=listInt.size();
        for (int i = 0; i < len; i++) {
            System.out.println(listInt.remove(0));
        }
        System.out.println("====================");
        System.out.println(listInt.size());

        System.out.println("====================");


        //随机生成数字 存到ArrayList
        ArrayList<Integer> listRandom=new ArrayList<>();

        //生成随机数存到ArrayList
        Random rnd=new Random();//创建一个生成随机数的对象
        for (int i = 0; i <6 ; i++) {
            int num=rnd.nextInt(33)+1;//数字生成的范围[1,33]
            //将数字添加到集合
            listRandom.add(num);
        }

        //显示
        for (int i = 0; i < listRandom.size(); i++) {
            System.out.println(listRandom.get(i));
        }



    }
}
