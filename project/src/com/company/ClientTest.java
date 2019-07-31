package com.company;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTest {
    public static void main(String[] args){
        try {
            int port = 8888;
            Socket s = new Socket("127.0.0.1",port);


            //打开输出流
            OutputStream os = s.getOutputStream();

            //把输出流封装在DataOutputStream
            DataOutputStream dataOutputStream = new DataOutputStream(os);

            //读取控制台输入，发送到服务端
            Scanner input = new Scanner(System.in);
            while (input.hasNext()){
                String str = input.next();
                dataOutputStream.writeUTF(str);
            }
            //String str = input.next();

            //使用writeUTF发送字符串
            //dataOutputStream.writeUTF(str);
            dataOutputStream.close();

            //发送数据 到 服务端   二进制？
            //os.write(1102);
            //os.close();

            s.close();
        } catch (UnknownHostException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
