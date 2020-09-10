package stage2.day2.NET;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class demoNetClient{

    public static void main(String[] args) {
            String serverName = "127.0.0.1";
            int port = Integer.parseInt("80");
            try
            {
                System.out.println("连接到主机：" + serverName + " ，端口号：" + port);
                Socket client = new Socket(serverName, port);
                System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
                OutputStream outToServer = client.getOutputStream();
                DataOutputStream out = new DataOutputStream(outToServer);

                out.writeUTF("Hello from " + client.getLocalSocketAddress());
                InputStream inFromServer = client.getInputStream();
                DataInputStream in = new DataInputStream(inFromServer);
                System.out.println("服务器响应： " + in.readUTF());
                client.close();
            }catch(IOException e)
            {
                e.printStackTrace();
            }
    }
}
