package stage2.day2;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class demoProperties {
    public static void main(String[] args) {
        //属性 每个键对应的都是一个字符串
        Properties properties=new Properties();
        Set states;

        System.out.println(properties);
        System.out.println(properties.size());
        properties.put(1,2);
        properties.put("A","a");
        properties.put("B",10);

        System.out.println(properties);
        System.out.println("============");

        //获取设置视图
        states=properties.keySet();//
        System.out.println("Set: "+states);

        //遍历键
        Iterator itr= states.iterator();
        System.out.println(itr);
        System.out.println("============");
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
