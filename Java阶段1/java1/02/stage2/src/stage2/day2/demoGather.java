package stage2.day2;

import java.util.*;

public class demoGather {
    public static void main(String[] args) {
        //遍历ArrayList的三种方法
        List<String> list=new ArrayList<>();//多态 父类引用指向子类对象
        //添加元素
        list.add("Hello");
        list.add("World");
        list.add("你好Java世界");


        //第一种使用for-each或for-i
        for(String str:list)
        {
            System.out.println(str);
        }
        System.out.println("===============");

        //第二种将容器内容转换存储到数组中
        String[] string=new String[list.size()];
        list.toArray(string);//存储到数组中
        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i]);
        }

        System.out.println("===============");

        //第三种是使用迭代器iterator
        Iterator<String> itr=list.iterator();//迭代器指向存字符串的内存
        while(itr.hasNext()){
            System.out.println(itr.next());
        }




        //遍历Map图    多态 父类引用指向子类对象
        Map<String,String> map=new HashMap<String,String>();//固定了键与值的数据类型
        map.put("1","value1");
        map.put("2","value2");
        map.put("3","value3");

        //第一种是for-each 获取键值然后获取值  即二次取值
        for(String str:map.keySet())
        {
            System.out.println("键为："+str+" 值为："+map.get(str));
        }
        //
        System.out.println("================");

        //第二种方法是迭代器iterator
        Iterator<Map.Entry<String,String>> it=map.entrySet().iterator();
        while (it.hasNext())
        {
            System.out.println("键=值："+it.next());
        }
        System.out.println("================");

        //第三种推荐方法  for-each+entrySet  遍历的速度极快 遍历Map图时 优先考虑
        for (Map.Entry<String,String> entry:map.entrySet()){
            //省去了迭代器
            System.out.println("键："+entry.getKey()+" 值："+entry.getValue());
        }
        System.out.println("================");
        //第四种是直接遍历值
        for (String value:map.values()){
            System.out.println(value);
        }






    }
}
