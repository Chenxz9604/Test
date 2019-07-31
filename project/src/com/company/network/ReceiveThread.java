package com.company.network;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ReceiveThread extends Thread{

    private Socket socket;

    public ReceiveThread(Socket socket){
        this.socket = socket;
    }

    public void run(){
        try {
            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            boolean flag = true;
            while (flag){
                String msg = dataInputStream.readUTF();
                System.out.println(msg);
                if (msg == "bye"){
                    flag = false;
                    break;
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
