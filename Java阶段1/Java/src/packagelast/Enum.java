package packagelast;

import java.sql.SQLOutput;

//枚举
enum Color{
    RED,GREEN,BLUE;
}

public class Enum {
    public static void main(String[] args) {
//        System.out.println("你好Java世界");
          Color clr=Color.RED;
        System.out.println(clr);
        System.out.println("================");
        //遍历
        for(Color f:Color.values())
        {
            System.out.println(f+" at index["+f.ordinal()+"]");
        }
        System.out.println("===============");
        System.out.println(Color.valueOf("RED"));
    }
}
