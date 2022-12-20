package com.powrnode.spring6.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName : Person
 * @Author : longZai
 * @Date : 2022/12/5 11:49
 */
public class Person {
//    注入list集合
    private List<String> names;
////    注入set集合
    private Set<String> addrs;
//    注入map集合
    private Map<Integer,String> phones;
//    注入Properties 属性类
//    Properties本质上也是一个map集合
//    Properties的父类Hashtable Hashtable实现了Map接口
//    虽然这个也是个Map集合 但是和Map集合的注入方式有点像,但是不同
//    Properties的key和value只能是String字符串类型的
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setPhones(Map<Integer, String> phones) {
        this.phones = phones;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setAddrs(Set<String> addrs) {
        this.addrs = addrs;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", addrs=" + addrs +
                ", phones=" + phones +
                ", properties=" + properties +
                '}';
    }
}
