package com.powrnode.spring6.bean;

/**
 * @ClassName : Woman
 * @Author : longzai
 * @Date : 2022/12/5 11:33
 */
public class Woman {
    private String name;

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
