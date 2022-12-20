package com.powrnode.spring6.bean;

/**
 * @ClassName : People
 * @Author : longZai
 * @Date : 2022/12/6 11:25
 */
public class People {
    private String name;
    private int age;
    private boolean sex;
//    c命名空间是简化构造注入的
//    c命名空间注入方法是基于构造方法的
//    public People(String name, int age, boolean sex) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
