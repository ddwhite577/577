package cn.studentwebsite.demoTestSocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class demoTestSocketServer {
    public static void main(String[] args) throws IOException {
        //创建服务器对象
        ServerSocket serverSocket=new ServerSocket(8888);
        //获取客户端对象
        Socket socket=serverSocket.accept();
        //获取客户端对象的字节输入流
        InputStream inputStream=socket.getInputStream();
        //读取客户端信息
        byte[] bytes=new byte[1024];
        int len=-1;
        while((len=inputStream.read(bytes))!=-1){
            //
            System.out.println(new String(bytes));
        }

        //获取客户端对象的字节输出流
        OutputStream outputStream=socket.getOutputStream();
        //写数据
        outputStream.write("好的谢谢你".getBytes());

        //关闭流数据
        inputStream.close();
        outputStream.close();
        serverSocket.close();
        socket.close();
    }
}
