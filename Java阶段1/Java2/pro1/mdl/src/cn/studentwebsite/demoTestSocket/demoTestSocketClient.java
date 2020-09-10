package cn.studentwebsite.demoTestSocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class demoTestSocketClient {
    public static void main(String[] args) throws IOException {
        //创建客户端
        Socket socket=new Socket("127.0.0.1",8888);
        //获取对象的字节输出流
        OutputStream outputStream = socket.getOutputStream();
        //写
        outputStream.write("服务器你好".getBytes());

        socket.shutdownOutput();
        //获取对象的字节输入流
        InputStream inputStream = socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=0;
//        len=inputStream.read(bytes);
        while((len=inputStream.read(bytes))!=-1){
            //
            System.out.println(new String(bytes));
        }


        //关闭流数据
        inputStream.close();
        outputStream.close();
        socket.close();

    }
}
