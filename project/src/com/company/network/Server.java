package com.company.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        int port = 8888;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("监听端口 " + port);

            Socket socket = serverSocket.accept();
            //启动发送消息线程
            new SendThread(socket).start();
            //启动接收消息线程
            new ReceiveThread(socket).start();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
