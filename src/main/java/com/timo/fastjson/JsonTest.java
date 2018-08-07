package com.timo.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class JsonTest {
    public static void main(String[] args) throws Exception{
      //用java反射初始化Student类中的值
        Class<Student> studentClass = Student.class;
        Constructor<Student> studentConstructor = studentClass.getDeclaredConstructor();
        Student student = studentConstructor.newInstance();
        Field[] fields = studentClass.getDeclaredFields();
        for(Field field:fields){
            //给student类中的属性放行。
            field.setAccessible(true);
            if(field.getName().equals("name")){
                field.set(student,"黄老邪");
            }
            if(field.getName().equals("address")){
                field.set(student,"桃花岛");
            }
            if(field.getName().equals("age")){
                field.set(student,18);
            }
        }
        //把一个对象转成json
        String s = JSON.toJSONString(student);
        System.out.println(s);

        //把一个json中的内容填充到一个对象中
        Student jsonObject = JSON.parseObject(s,Student.class);
        System.out.println(student);
    }
}
