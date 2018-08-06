package com.timo;

import java.net.InetAddress;
import java.net.Socket;

public class InetAddressTest {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost", 8080);
        InetAddress inetAddress = socket.getInetAddress();
        //InetAddress的用法：
        //获取本机的ipv4
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("localhost="+localHost);
        //得到本机的地址：
        byte[] address = localHost.getAddress();
        for(byte add:address){
            System.out.println("add="+add);
        }
        System.out.println(localHost.getHostAddress());
        System.out.println("本机的ip地址是："+InetAddress.getLocalHost().getHostAddress());
        System.out.println("本机的名字是："+InetAddress.getLocalHost().getHostName());
    }
}
