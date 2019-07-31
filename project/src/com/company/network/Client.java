package com.company.network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public static void main(String[] aegs){
        int port = 8888;
        try {
            Socket socket = new Socket("127.0.0.1", port);
            new SendThread(socket).start();
            new ReceiveThread(socket).start();

        } catch (UnknownHostException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
