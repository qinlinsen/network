package com.timo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UrlTest {
    public static final String SPEC = "http://www.baidu.com";
    public static final String SPEC2 = "http://localhost:8080/mobile/faceEntryRecord";

    public static void main(String[] args) throws Exception {
        URL url = new URL(SPEC2);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setConnectTimeout(20000);
        conn.setDoInput(true);/**/
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        //告诉服务端接收的数据类型
        conn.setRequestProperty("Content-Type","application/json");
        conn.setRequestProperty("Charset", "UTF-8");
        //下面就是请求体
        String body="name='12'";
        OutputStream outputStream = conn.getOutputStream();
        outputStream.write(body.getBytes());
        conn.setReadTimeout(20000);
        conn.setConnectTimeout(60000);
        conn.connect();
        Map<String, List<String>> headerFields = conn.getHeaderFields();
        Set<Map.Entry<String, List<String>>> entries = headerFields.entrySet();
        for(Map.Entry entry:entries){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        System.out.println(conn.getContentType());
        InputStream inputStream = conn.getInputStream();
        Scanner scanner = new Scanner(inputStream, "utf-8");
        if(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println("line="+line);
        }
        System.out.println(conn.getDate());
        System.out.println(conn.getHeaderField("Content-Type"));

    }
}
