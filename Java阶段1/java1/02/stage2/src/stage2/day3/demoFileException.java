package stage2.day3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class demoFileException {
    public static void main(String[] args) {
//        //创建字节输入流对象 错误写法
//        FileReader fr=new FileReader("b.txt");
        FileWriter fw=null;
        try {
            //可能异常的代码  可能创建失败 所以fr先赋值为null
            fw=new FileWriter("w:\\txt");
            for (int i = 0; i <5 ; i++) {
                //写字符
                fw.write(i+"\r\n");
            }
            //刷新流
            fw.flush();
        }catch (IOException e){
            System.out.println("创建FileWriter对象发生错误");
            e.printStackTrace();
        }finally {
            if(fw!=null){
            //close声明可能抛出IOException异常，所以也要 要么throws 要么捕抓异常try catch
            try {
                //关闭流
                fw.close();
            }catch (IOException e){
                System.out.println("关闭FileWriter流发生错误");
                e.printStackTrace();
            }
            }
        }
    }
}
