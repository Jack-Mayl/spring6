package com.powrnode.spring6.bean;

/**
 * @ClassName : Cat
 * @Author : longZai
 * @Date : 2022/12/5 12:20
 */
public class Cat {
    private String name;

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
