package com.company;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args){
        try {
            int port = 8888;
            ServerSocket ss = new ServerSocket(port);
            System.out.println("开启监听端口: "+ port);

            Socket s = ss.accept();
            System.out.println("接收到连接：" + s);

            //打开输入流
            InputStream is = s.getInputStream();

            //把输入流封装在DataInputStream
            DataInputStream dataInputStream = new DataInputStream(is);
            String msg = dataInputStream.readUTF();
            //打印数据
            System.out.println(msg);

            dataInputStream.close();
//            //读取客户端发送过来的数据
//            int msg = is.read();

            is.close();

            s.close();
            ss.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
