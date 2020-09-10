package stage2.day1;


import java.util.ArrayList;

/*
* ArrayList集合
* 1、ArrayList<>，尖括号表示泛型，泛型只能是引用类型
* 备注：从jdk1.7+开始，右侧的尖括号内部可以不写内容，低版本的jdk要求左右一致
* 2、java中所有变量都会自动初始化.
* 3、如果创建的ArrayList没有手动初始化，则为[]
* 4、ArrayList集合常用的方法：添加元素返回是否添加成功add，获取元素返回元素get，删除元素返回删除元素remove，集合的长度size
*
* */
public class demoArrayList1 {
    public static void main(String[] args) {
       // System.out.println("你好Java世界");
        //创建ArrayList集合 类型为string
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        System.out.println("===================");
        list.add("AAA");
        System.out.println(list);
        System.out.println("===================");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        System.out.println(list);//逗号空格分开
        System.out.println("===================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("===================");
        System.out.println(list.size());
        System.out.println("===================");
        int len=list.size();
        for (int i = 0; i < len; i++) {
            System.out.println(list.remove(0));
            System.out.println("删除之后的大小："+list.size());
        }
        System.out.println("===================");
        System.out.println(list);


    }
}
