package cn.studentwebsite.demoNet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class demoNetClient {
    public static void main(String[] args) {

        Socket socket=null;
        try {
            //创建客户端对象
             socket=new Socket("127.0.0.1",8888);

            //使用对象获取网络字节输出流
            OutputStream os=socket.getOutputStream();
            //使用流对象 给服务器发送信息
            os.write("你好服务器".getBytes());

            //给服务器发送个读取文件结束符，让服务器的read方法结束
           // socket.shutdownOutput();
            //Thread.sleep(15000);
            //创建输入流对象
//            InputStream is = socket.getInputStream();
//            byte[] bytes=new byte[1024];
//            int len=0;
//
//            System.out.println("11111111111111");
//            while((len=is.read(bytes))!=-1) {
//                System.out.println("22222222222222222222222");
//                System.out.println(new String(bytes, 0, len));
//            }
//            System.out.println("3333333333333333");

        }catch (IOException /*| InterruptedException*/ e){
            e.printStackTrace();
        }finally {
            try{
                //释放资源
                socket.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }

    }
}
