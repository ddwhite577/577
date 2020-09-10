package stage2.day3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demoCopyImageFile {
    public static void main(String[] args) throws IOException {

        //计算优化后时间1
        long s1=System.currentTimeMillis();

        //读取文件的流FileInputStream
        FileInputStream fis=new FileInputStream("C:\\Users\\Administrator\\Desktop\\copy.jpeg");
        //写如文件的流FileOutputStream
        FileOutputStream fos=new FileOutputStream("copy.jpeg");
//        //一次读取一个字节的方式读写文件
//        int data=-1;//读取的数据
//        int size=0;//文件大小
//
//        while((data=fis.read())!=-1)
//        {
//            //将读取的数据写入到另外一个文件  copy
//            fos.write(data);
//            size+=1;
//        }
        //优化 一次性读多个字节和写多个字节
        int len=-1;//每次读取的有效字节个数
        byte[] datas=new byte[1024];
        int sizes=0;//文件大小
        //
        while((len=fis.read(datas))!=-1){
            //写
            fos.write(datas,0,len);
            sizes+=len;
        }


        //先关闭写再关闭读
        //关闭文件输出流
        fos.close();
        //关闭文件输入流
        fis.close();
        //计算优化后时间1
        long s2=System.currentTimeMillis();
//        System.out.println("文件大小："+size+"B");
//        System.out.println("文件大小："+size/1024+"KB");
        System.out.println("文件大小："+sizes+"B");
        System.out.println("文件大小："+sizes/1024+"KB");
        System.out.println("优化后所需的时间："+(s2-s1)+"ms");
    }
}
