package com.timo;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTest{
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            socket.setSoTimeout(10000);
            System.out.println("the socket connection is: "+socket.isConnected());
            System.out.println(InetAddress.getByName("localhost"));
            InetAddress inetAddress = socket.getInetAddress();
            if(InetAddress.class.isInstance(inetAddress)){
                byte[] address = inetAddress.getAddress();
                System.out.println("address="+address);
            }
            System.out.println("inetAddress="+inetAddress);
            InputStream inputStream = socket.getInputStream();
            System.out.println("inputstream="+inputStream);
            System.out.println();
            System.out.println("socket");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
