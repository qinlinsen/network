package com.proveInheritedAnnotation;

/**
 * @author qinlinsen
 */
public class Parent {
    @Mother
    private String name;
    @Mother
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
