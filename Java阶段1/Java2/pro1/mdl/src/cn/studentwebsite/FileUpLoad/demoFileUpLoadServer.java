package cn.studentwebsite.FileUpLoad;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class demoFileUpLoadServer {
    public static void main(String[] args) {
        //服务器
        ServerSocket serverSocket=CreateServer(8888);
        //监听客户端的请求连接
        Socket socket=GetClient(serverSocket);
        //读取客户端发来的数据
        StringBuffer sb=read(socket);
        System.out.println(sb);
        //给客户端发送数据
        write(socket,new StringBuffer("收到谢谢"));

        //释放资源
        release(serverSocket,socket);
    }

    //创建服务对象
    public static ServerSocket CreateServer(int port){
        try {
            //创建服务器对象
            ServerSocket serverSocket = new ServerSocket(port);
//            System.out.println("服务器");
            //返回对象
            return serverSocket;
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    //处理客户端对象
    public static Socket GetClient(ServerSocket serverSocket){
        try {
            //获取请求的客户端对象
            Socket socket=serverSocket.accept();
//            System.out.println("接收请求");
            //将获取到的对象返回
            return socket;
        }catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //读取客户端发来的信息
    public static StringBuffer read(Socket socket){
        //存储数据的缓冲区
        StringBuffer sb=new StringBuffer();
        try{
            //使用客户端的输入流对象
            InputStream is = socket.getInputStream();
            //提高读取的效率
//        BufferedInputStream bis=new BufferedInputStream(is);
            //读取客户端发来的数据
            byte[] bytes=new byte[1024];
            int len=-1;
            //循环读取流
            while((len=is.read(bytes))!=-1){
                //将读取到的字节 转换成String类型 再存储sb 防止数据重复
                String str=new String(bytes,0,len);
                //存入数据拼接
                sb.append(str);
            }
            //数据读取完之后返回
            return sb;
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    //给客户端发送数据
    public static int write(Socket socket,StringBuffer data){
        try {
            //创建读取数据的输出流对象
            OutputStream os=socket.getOutputStream();
            //创建写文件的输出流缓冲区 提高写文件的速度 减少系统IO次数
//                BufferedOutputStream bos=new BufferedOutputStream(os);
            //写数据
            //先将数据转换成String
            String str=data.toString();
            os.write(str.getBytes());
            //让服务器的read读取到终止符 返回-1
            socket.shutdownOutput();
        }catch (IOException e){
            e.printStackTrace();
        }
        return -1;
    }

    //释放资源
    public static void release(ServerSocket serverSocket,Socket socket){
        try {
            serverSocket.close();
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
