package package08;

import java.io.*;

public class test08 {
    public static void main(String[] args) {
        System.out.println("你好世界..");

        //文件读写
        File fp=new File("./a.txt");
        try{
            //写
            FileWriter writer = new FileWriter(fp,true);
            writer.write("\n你好、世界\n你好陌生人");
            //刷新缓存流
            writer.append("\n这是追加的文字");
            writer.flush();
            System.out.println();
            writer.close();

            //读
            FileReader reader=new FileReader(fp);
            while (reader.ready())
            System.out.print((char) reader.read());
        }catch (IOException e)
        {

        }

    }
}
