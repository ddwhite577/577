package stage2.day2;

import java.util.ArrayList;
import java.util.List;

/*
* Java泛型：泛型的本质是参数化数据类型，也就是说所操作的数据类型被指定为一个参数
* 1、泛型类型参数只能是引用类型，不能是原始类型（基础类型）
* 2、所有的泛型方法声明都有一个类型参数声明部分（由尖括号分隔），该类型参数说明部分在方法返回之前
* 3、每个类型参数声明部分包含一个或多个类型参，参数之间用逗号隔开
* 4、泛型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符
* */
//泛型类
class  Box<T>{
    private T t;
    public void setT(T t){
        this.t=t;
    }

    public Box(T t) {
        this.t = t;
    }

    public Box() {
    }

    public T getT() {
        return t;
    }
}
public class demoGenerics {
    public static void main(String[] args) {
        //创建不同基础类型的包装类
        Integer[] intArr={1,2,3,4,5};
        Double[] doubleArr={1.1,2.2,3.3,4.4,5.5};
        Character[] charArr={'H','e','l','l','o'};

        printArray(intArr);
        System.out.println("===========");
        printArray(doubleArr);
        System.out.println("===========");
        printArray(charArr);
        System.out.println("===========");
        System.out.println(maximum(3,4,5));
        System.out.println(maximum("s","v","a"));
        System.out.println("===========");
        Box<Integer> integerBox=new Box<>();
        integerBox.setT(1);
        System.out.println(integerBox.getT());
        System.out.println("===========");
        List<String> str=new ArrayList<>();
        str.add("AAA");
        getData(str);
        System.out.println("===========");

    }
    //泛型方法打印不同字符串的元素
    public static <E> void printArray(E[] inputArray)
    {
        for (E element:inputArray)
        {
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
    //有界的类型参数
    public static <T extends Comparable<T>> T maximum(T x,T y,T z){
        T max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if (z.compareTo(max)>0){
            max=z;
        }

        return max;
    }
    //通配符 用？代替类型参数
    public static void getData(List<?> data){
        System.out.println("data: "+data.get(0));
    }

}
