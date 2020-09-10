package cn.studentwebsite.FileUpLoad;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class demoFileUpLoadClient {
    public static void main(String[] args)  {
        //客户端
        Socket socket=CreateClient("127.0.0.1",8888);
        //发送信息
        write(socket,new StringBuffer("你好服务器"));

        //接受信息
        StringBuffer sb=read(socket);
        System.out.println(sb);

        //释放资源
        release(socket);
    }

    //创建客户端套接字
    public static Socket CreateClient(String host,int port){

        try {
            //创建套接字
            Socket socket = new Socket(host, port);
            //返回此套接字
            return socket;
        }catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }


    //读取服务器发来的信息
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

    //给服务器发送数据
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
    public static void release(Socket socket){
        try {
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
