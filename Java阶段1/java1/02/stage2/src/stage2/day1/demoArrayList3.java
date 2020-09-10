package stage2.day1;

import java.util.ArrayList;

public class demoArrayList3 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        //学生对象
        Student[] stu=new Student[3];//这里只是分配了三个对象大小内存对象引用
        System.out.println(stu);

        //继续引用分配空间
        for (int i = 0; i < stu.length; i++) {
            stu[i]=new Student();

        }
        //赋值
        stu[0].setName("A");
        stu[0].setAge(1);
        stu[1].setName("B");
        stu[1].setAge(2);
        stu[2].setName("C");
        stu[2].setAge(3);

        for (Student student : stu) {
            System.out.println("===============");
            System.out.println("姓名："+student.getName());
            System.out.println("年龄："+student.getAge());
        }
        System.out.println("===============");
        //将学生数组添加到集合
        for (int i = 0; i < stu.length; i++) {
            list.add(stu[i]);//将每个元素对象的地址放到集合
        }
        //显示输出
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));//地址
            System.out.println("Array姓名："+list.get(i).getName());
            System.out.println("Array年龄："+list.get(i).getAge());
        }

        System.out.println("===============");






        System.out.println("===================");
        //基本数据类型的数组
        int[] a=new int[3];
        for (int i = 0; i < a.length; i++) {
            //赋值
            a[i]=i;
        }
        for (int i = 0; i < a.length; i++) {
            //输出显示
            System.out.println("a["+i+"]= "+a[i]);
        }

        System.out.println("===================");
        //包装类型的数组
        Integer[] b=new Integer[3];
        for (int i = 0; i < b.length; i++) {
            //赋值
            b[i]=i;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("b["+i+"]= "+b[i]);
        }
    }
}
