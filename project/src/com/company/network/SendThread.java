package com.company.network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread{
    private Socket socket;

    public SendThread(Socket socket){
        this.socket = socket;
    }

    public void run(){
        try {
            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            boolean flag = true;
            while(flag){
                Scanner input = new Scanner(System.in);
                String str = input.next();
                dataOutputStream.writeUTF(str);
                if (str == "bye"){
                    flag = false;
                    break;
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
