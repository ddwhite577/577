package package05;
import java.io.*;


public class test05 {
    public static void main(String[] args) {
        System.out.println("Hello World!你好世界");

        //BufferReader流对象
//        char c;
//        //使用System.in创建BufferReader对象
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("输入字符，按下‘q’键退出。");
//        do {
//            c=(char)br.read();
//            System.out.println("c："+c);
//        }while(c!='q');

        //从控制台读取字符串
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        String str;
//        System.out.println("输入字符串，按下‘q’键退出。");
//        do {
//            str=br.readLine();
//            System.out.println(str);
//            if(str.equals("q"))
//                System.out.println("相等");
//        }while(!str.equals("q"));
        //文件操作
        try{
        byte[] b=new byte[128];
        File fp=new File("C:\\Users\\Administrator\\Desktop\\Java\\src\\package05\\test05.java");
        InputStream out=new FileInputStream(fp);
        //将文件流放入对象中
            InputStreamReader reader=new InputStreamReader(out,"UTF-8");
        int size=out.available();
            System.out.println("available："+size);
            while(reader.ready())
            {    char c=(char)reader.read();
                System.out.print(c);
            }
            out.close();
        }catch (IOException e)
        {
            System.out.println("Exception："+e);
        }
    }
}