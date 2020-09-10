package stage2.day3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class demoStrFile {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileReader fr=new FileReader("b.txt");
//        //读取数据
//        int data=-1;
//        while ((data=fr.read())!=-1)
//        {
//            System.out.print((char)data);
//        }
        //多个字节读取
        char[] datas=new char[1024];
        int size=0;//每次读取到的实际字节数
        int i=0;
        while((size=fr.read(datas))!=-1)
        {
            i+=1;
            System.out.println("第"+i+"次读取到的字符个数："+size);
        }
        System.out.println(datas);
        //释放流
        fr.close();

        //创建输出流对象
        FileWriter fw=new FileWriter("a.txt",true);
        //写字符
        fw.write("\r\nHello World");
        //刷新流
        fw.flush();
        fw.write("\r\n流继续使用");
        //关闭流
        fw.close();
    }
}
