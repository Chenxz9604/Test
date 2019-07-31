package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class TestSocket {

    public static void main(String[] args) throws UnknownHostException, IOException {
		/**
		 * 本机ip地址
		 */
	    InetAddress host = InetAddress.getLocalHost();
	    String ip = host.getHostAddress();
	    System.out.println("本机ip地址: " + ip);

		Process p = Runtime.getRuntime().exec("ping " + "192.168.11.1");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		StringBuilder stringBuilder = new StringBuilder();
		while ((line = bufferedReader.readLine()) !=  null){
			if( line.length() != 0){
				stringBuilder.append(line +"\r\n");
			}
		System.out.println("本次指令返回的消息是：");
		System.out.println(stringBuilder.toString());

		}
    }
}
