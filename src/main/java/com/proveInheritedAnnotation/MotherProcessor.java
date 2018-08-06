package com.proveInheritedAnnotation;

import java.lang.reflect.Field;

/**
 * {@link Mother}这个自定义注解的处理器
 * @author qinlinsen
 */
public class MotherProcessor {
    public Parent process(Class clazz) throws Exception{
        //因为@Mother这个自定义的注解的Target只是在Fileld上，所以这里只写时得到getDeclaredFields
        Field[] fields = clazz.getDeclaredFields();
        //默认一个类是一个pojo有setter和getter方法
        Object obj = clazz.newInstance();
        //把obj强转成指定的类
        clazz.cast(obj);
        for(Field field:fields){
            //判断@Mother注解是否出现在某个类中的字段上
            boolean isPresent = field.isAnnotationPresent(Mother.class);
            if(isPresent){
                Mother annotation = field.getAnnotation(Mother.class);
                if(!field.isAccessible()){
                    field.setAccessible(true);
                }
                //赋值
                if ("name".equals(field.getName())) {
                    field.set(obj,annotation.name());
                    System.out.println(field.get(obj));
                }
                if ("age".equals(field.getName())) {
                    field.set(obj,annotation.age());
                    System.out.println(field.get(obj));
                }
            }
        }
        return (Parent) obj;
    }
}
