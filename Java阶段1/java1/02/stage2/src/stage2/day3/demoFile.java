package stage2.day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class demoFile {
    public static void main(String[] args) throws IOException {
       // System.out.println("...");
        //创建文件写入对象
        FileOutputStream fileOutputStream=new FileOutputStream("a.txt");
        //写数据
        fileOutputStream.write(97);
        //关闭流
//        fileOutputStream.close();

        //创建文件写入对象
//        FileOutputStream  fos=new FileOutputStream(new File("b.txt"));
        //写多个数据
       // byte[] bytes={-65,-66,-67,68,69};
        //fos.write(bytes);

        //将字节数组的一部分写入文件中
//        byte[] bytes1={65,66,67,68,69};
//        fos.write(bytes1,1,4);

        //字符串转换为字节写入文件
//        String str="你好ABC";
//        byte[] bytes2=str.getBytes();
//        fos.write(bytes2);


        //关闭流
//        fos.close();

        //追加数据 创建文件写入对象
//        FileOutputStream fos1=new FileOutputStream("b.txt",true);
        //写数据
//        fos1.write("hello".getBytes());
        //换行追加
//        for (int i = 0; i <5 ; i++) {
//            fos1.write("World".getBytes());
            //换行
//            fos1.write("\r\n".getBytes());

        //关闭流
//        fos1.close();
        //创建读文件流对象
        FileInputStream fis=new FileInputStream("b.txt");
//        //读数据
//        int len=-1;
//        while ((len=fis.read())!=-1)
//        {
//            System.out.print((char) len);
//        }
        //读取多个字节
////        byte[] b=new byte[100];
////        int size=fis.read(b);
////        System.out.println("length:"+b.length);
////        System.out.println("size:"+size);
////        for (int i = 0; i < size; i++) {
////            System.out.print((char)b[i]);
////        }
////        System.out.println("=============");
////        System.out.println(Arrays.toString(b));
////        System.out.println("=============");
////        System.out.println(new  String(b));
//        //关闭流
//        fis.close();
    }
}
