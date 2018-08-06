package com.timo;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) throws Exception {

        //创建一个服务端的socket
        ServerSocket serverSocket = new ServerSocket(8765);

        System.out.println(Integer.parseInt("FFFF", 16));
        //waiting for connect
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        Scanner in = new Scanner(inputStream, "UTF-8");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"), true);
        out.print("hello ! enter bye to exit");
        //echo client input:
        boolean done=false;

        while (! done && in.hasNextLine()){
            String nextLine = in.nextLine();
            out.print("echo "+nextLine);
            if(nextLine.trim().equals("bye")){
                done=true;
            }
        }
        while(true){
            Thread.sleep(1000);
            System.out.println("1");
        }
    }
}
