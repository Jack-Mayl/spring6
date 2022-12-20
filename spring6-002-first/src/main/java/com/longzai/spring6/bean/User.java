package com.longzai.spring6.bean;

/**
 * 这个一个Bean 封装了用户的信息 Spring可以帮助外面创建User对象
 * @ClassName : User
 * @Author : longzai
 * @Date : 2022/11/7 23:57
 */
public class User {
//    spring是怎么实例化对象的?
//    默认情况下spring会通过反射机制,调用类的无参构造方法来实例化对象
//    实例原理如下:
//    Class clazz = Class.forName("com.longzai.spring6.bean.User");
//    object obj = clazz.newInstance()
    public User(){
        System.out.println("User的无参构造方法执行");
    }

    public User(String name){}
}
