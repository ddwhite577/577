package stage2.day4;

import java.io.*;

public class demoBufferStream {

    public static void main(String[] args) {
//        show1();
//        show2();
//        show3();
        show4();
    }
    public static void show1(){
        try(//创建字节输出流对象
            FileOutputStream fos=new FileOutputStream("buffered.txt");
            //创建字节缓冲输出流对象
            BufferedOutputStream  bufos=new BufferedOutputStream(fos);
            ){
            //写数据
            bufos.write("字节流缓冲去的数据".getBytes());
            //因为创建对象在try（）里面，所以省去了flush。在try语句结束时，系统自动释放流绑定的相关系统资源
        }catch(IOException e){
            e.printStackTrace();
        }


    }
    public static void show2(){
        //提高读取效率
        try(
                //创建文件输入流对象
                FileInputStream fis=new FileInputStream("buffered.txt");
                //创建文件输入流的缓冲对象
                BufferedInputStream bufis=new BufferedInputStream(fis);
                ){
            //读取数据
            int len=-1;
            while((len =bufis.read())!=-1){
                System.out.print((char)len+"\t");
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void show3(){
        try(
                //创建字符输出流对象
                FileWriter fw=new FileWriter("b.txt");
                //创建缓冲字符输出流对象
                BufferedWriter bw=new BufferedWriter(fw);
                ){
            //写数据
            for(int i=0;i<10;i++){
                bw.write("第"+(i+1)+"次输入的数据");
                //使用特有方法
                bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void show4(){
        try (
                FileReader fr=new FileReader("b.txt");
                BufferedReader br=new BufferedReader(fr);
        ){
            //读取数据
            char[] data=new char[1024];
            int size=0;
           while ((size=br.read(data))!=-1){
               System.out.println("文件大小："+size);
               System.out.println(data);
           }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
