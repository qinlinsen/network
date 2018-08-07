package com.timo.parsedom;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * @author qinlinsen
 */
public class ParseDomWithDom4j {
    public static final String path="E:\\google-download\\network\\src\\main\\java\\resources\\com\\parsedom\\book.xml";
//    public static void main(String[] args) throws Exception{
//        SAXReader reader = new SAXReader();
//
//        boolean equals = Objects.equals("1", "1");
//        System.out.println("equals="+equals);
//        String url="./src/book.xml";
//        File file = new File(path);
//        String path = file.getPath();
//        String canonicalPath = file.getCanonicalPath();
//        System.out.println(canonicalPath);
//
//        System.out.println(path);
//        //获取文档
//        Document document = reader.read(url);
//        //获取这个文档的根节点：
//        Element bookstore = document.getRootElement();
//        //获取根节点下的子节点
//        Iterator it = bookstore.elementIterator();
//        while(it.hasNext()){
//            System.out.println("*****");
//            Element book= (Element) it.next();
//            Object data = book.getData();
//            System.out.println("data="+data );
//            //获取book的属性名和属性值：
//            Iterator iterator = book.elementIterator();
//            while(iterator.hasNext()){
//              Element b= (Element)it.next() ;
//                System.out.println(b.getName()+"********"+b.getStringValue());
//            }
//        }
//    }
public static void main(String[] args) throws Exception{
    String s = URLDecoder.decode(URLEncoder.encode("！", "UTF-8"), "UTF-8");
    System.out.println(s);
    System.out.println((int)"!".charAt(0));

    List<Integer> integers = Arrays.asList(1, 2, 3, 4);
    integers.remove(0);
}
}
