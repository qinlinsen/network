package com.proveInheritedAnnotation;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception {
        Class<Parent> parentClass = Parent.class;
        Field[] fields = parentClass.getDeclaredFields();
        for(Field field:fields){
            System.out.println(field.getName());
        }
        Parent parent = new MotherProcessor().process(Son.class);
        System.out.println(parent.getAge());
        System.out.println(parent.getName());

    }
}
