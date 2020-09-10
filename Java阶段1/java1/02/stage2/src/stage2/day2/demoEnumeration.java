package stage2.day2;

/*
* Enumeration接口的方法
* 1、boolean hasMoreElement()。测试此枚举是否包含更多的元素
* 2、Object nextElement()。如果枚举对象至少有一个可提供的元素，则返回此枚举的下一个元素
* */

import java.util.Enumeration;
import java.util.Vector;

public class demoEnumeration {
    public static void main(String[] args) {
        //枚举数据结构接口
        Enumeration<String> days;
        //Vector容器
        Vector<String> dayNames=new Vector<>();
        //装载内容
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");

        //将容器的元素放到枚举集合中
        days=dayNames.elements();
        //显示枚举集合的元素
        System.out.println("============枚举集合===============");
        while(days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
        System.out.println("============vector容器===============");
        int len=dayNames.size();
        for (int i = 0; i <len ; i++) {
            System.out.println(dayNames.elementAt(i));
        }
    }
}
