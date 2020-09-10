package package06;
import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class test06 {
    public static void main(String[] args) {
        System.out.println("-----文件操作-----");

        try {
            //文件对象 当前目录的文件
            File fp = new File("a.txt");

            //创建写入文件的流
            OutputStream in =new FileOutputStream(fp);
            //将写取文件的流放入写文件流的对象
            OutputStreamWriter writer=new OutputStreamWriter(in,"UTF-8");
            //将数据写入文件
            String str="你好世界，Hello World!";
            writer.append(str);
            //关闭写文件的对象
            writer.close();
            //关闭写文件的流
            in.close();






            //创建读取文件的流
            InputStream out = new FileInputStream(fp);
            //将读取文件流装入读流的对象
            InputStreamReader reader=new InputStreamReader(out,"UTF-8");
            //循环读取文件
            while(reader.ready())
            {
                System.out.print((char)reader.read());
            }
            //关闭读文件的对象
            reader.close();
            //关闭读文件的流
            reader.close();

        }catch (IOException e)
        {
            System.out.println("IOException："+e);
        }

    }
}
