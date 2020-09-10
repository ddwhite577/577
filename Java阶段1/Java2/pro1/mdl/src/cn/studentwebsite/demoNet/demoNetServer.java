package cn.studentwebsite.demoNet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class demoNetServer {
    public static void main(String[] args) throws IOException {
        //创建服务器对象
        ServerSocket serverSocket=new ServerSocket(8888);
        //使用服务器对象中的accept方法，获取请求的客户端对象
        Socket socket = serverSocket.accept();

        //创建字节输入流对象 接受客户端消息
        InputStream is = socket.getInputStream();
        //读取数据
        byte[] bytes=new byte[1024];
       int len= 0;
        System.out.println("1111111111111111111");
       while((len=is.read(bytes))!=-1) {
           System.out.println("22222222222222");
           System.out.println(new String(bytes, 0, len));
       }
        System.out.println("3333333333333333333");
//        //创建输出流对象
//        OutputStream os = socket.getOutputStream();
//        //写数据
//        os.write("收到谢谢".getBytes());
//        //释放资源
//        os.close();
        serverSocket.close();
    }
}
