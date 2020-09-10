package stage2.day2;

import java.util.HashMap;
import java.util.Map;

public class demoDictionary {
    public static void main(String[] args) {
        //字典是一个抽象类 它定义了键映射到值的数据结构
        //字典已过时 用Map代替接口
        //d定义Map接口中的键值映射
        Map map=new HashMap();
        System.out.println(map.size());
        System.out.println(map);
        map.put("1","1");
        map.put("2","2");
        map.put(3,3);
        System.out.println(map);
        System.out.println(map.get("1"));
        System.out.println(map.get(3));
        map.remove("2");
        System.out.println(map);
        System.out.println(map.keySet());
    }
}
