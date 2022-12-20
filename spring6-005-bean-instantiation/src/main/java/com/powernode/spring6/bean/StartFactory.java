package com.powernode.spring6.bean;

/**
 * 简单工厂模式中的工厂类角色 星工厂
 * @ClassName : StartFactory
 * @Author : longZai
 * @Date : 2022/12/8 1:20
 */
public class StartFactory {
//    工厂类中有一个静态方法
//    简单工厂模式又叫做:静态工厂方法模式
    public static Star get(){
//        这个Star对象最终实际上创建的时候还是我们负责new的对象
        return  new Star();
    }

}
