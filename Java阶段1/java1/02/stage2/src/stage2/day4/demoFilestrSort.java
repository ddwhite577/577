package stage2.day4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demoFilestrSort {
    public static void main(String[] args) {
       //存储序号和内容的字典集合
        Map<String,String> map=new HashMap<>();
        read(map);
        write(map);
    }
    public static void  read(Map<String,String> map){
        long s1=System.currentTimeMillis();//耗时
        try (//创建字符输入流对象
             FileReader fr=new FileReader("出师表.txt");
             //创建缓冲字字符流 减少系统IO次数  提高读取文件效率
             BufferedReader br=new BufferedReader(fr);
             ){
            //创建字符数组缓冲区 提高读取效率
            String str=null;
            //上一个键key
            String upKey=null;
            //读取文件
            while ((str =br.readLine())!=null){
                //如果这个字符串有分割符“.”z则拆分两部分  否则添加到上一个key的值的结尾
                int isPoint=-1;
                isPoint=str.indexOf(".");
                if(isPoint!=-1){
                    //存储拆分后的两部分key-value
                    String[] arr=null;
                    arr=str.split("\\.");
                    //存入Map集合中
                    map.put(arr[0],arr[1]);
                    upKey=arr[0];
                }else if (upKey!=null){
                    //取出上一键值
                    String upValue=map.get(upKey);
                    //将当前没有序号的字符拼接到上一段
                    map.put(upKey,upValue+str);
                }else {
                    //其他情况 如开始位置就无序 则不做任何处理
                    System.out.println("无需处理字段："+str);
                }
            }
            long s2=System.currentTimeMillis();//耗时
            System.out.println("读取文件耗时："+(s2-s1)+"ms");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void  write(Map<String,String> map){
        long s1=System.currentTimeMillis();//耗时
        try (
                //创建字符输出流对象
                FileWriter fw=new FileWriter("出师表排序后.txt");
                //创建缓冲字符输出流对象
                BufferedWriter bw=new BufferedWriter(fw);
                ){
            //获取Map集合的键
            Set<String> key=map.keySet();
            //写数据
            for (String s : key) {
                String v=s+"."+map.get(s);
                System.out.println(v);
                bw.write(v);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        long s2=System.currentTimeMillis();//耗时
        System.out.println("写入文件耗时："+(s2-s1)+"ms");
    }
}
