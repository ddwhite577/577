package package19;

import java.util.ArrayList;

public class test19 {
    public static void main(String[] args) {
//        System.out.println("你好Java世界");
        //创建一个群主
        Manager manager=new Manager("群主",100);
        //群成员
        Menber one=new Menber("成员A",0);
        Menber two=new Menber("成员B",0);
        Menber three=new Menber("成员C",0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("===============");

        //群主发红包
        ArrayList<Integer>  list=manager.send(20,3);
        //群成员收红包
        one.receive(list);
        two.receive(list);
        three.receive(list);

        manager.show();
        one.show();
        two.show();
        three.show();

    }
}
