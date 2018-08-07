package com.proveInheritedAnnotation;

/**
 * @author qinlinsen
 */
public class Son extends Parent {
    @Mother
    private String name;
    @Mother
    private int age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}
