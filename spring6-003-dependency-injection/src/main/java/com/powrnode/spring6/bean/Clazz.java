package com.powrnode.spring6.bean;
/**
 * @ClassName : SimpleValueType
 * @Author : 龙仔
 * @Data ： 2022/11/12 20:12
 **/
public class Clazz {
    private String name;

    public Clazz() {
    }
    // 使用级联属性赋值,这个需要这个get方法
    public Clazz(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "name='" + name + '\'' +
                '}';
    }
}