package com.timo;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class NetTest {

    public static void main(String[] args) throws Exception{
       /* Socket socket = new Socket();
        //建立连接，连接到特定的地址和端口，并设置超时时间
        socket.connect(new InetSocketAddress("localhost",8080),10000);*/
        Socket socket = new Socket("localhost", 8080);
        //inetAddress就是Internet Address网络地址的简称
        InetAddress localhost = InetAddress.getByName("localhost");
        System.out.println("localhost="+localhost);
        String hostAddress = localhost.getHostAddress();
        System.out.println("hostAddress="+hostAddress);
        System.out.println("*******"+InetAddress.getLocalHost());
        InetAddress[] localhosts = InetAddress.getAllByName("localhost");
        System.out.println();
        for(InetAddress loca:localhosts){
            System.out.println("loca="+loca);
        }
        for(byte b:localhost.getAddress()){
            System.out.println("b="+b);
        }
        System.out.println(socket.isConnected());
    }
}
