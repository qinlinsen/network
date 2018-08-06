package com.timo;

import java.net.URI;

public class URITest {
    public static void main(String[] args) throws Exception{
        //创建一个uri,根据[scheme:]<scheme-specific-part>[#fragment]
        URI uri = new URI("http", "//qinlin@localhost:8080/oi/oi?user='aieg'", "iewio");
        System.out.println(uri);
        System.out.println(uri.getPath());
    }
}
