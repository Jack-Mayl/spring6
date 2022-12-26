package com.powernode.spring6.bean;

/**
 * 工厂方法模式当中的 具体工厂角色
 * @ClassName : GunFactory
 * @Author : Jack-Myl
 * @Date : 2022/12/26 11:23
 */
public class GunFactory {

//    工厂方法模式当中的具体工厂角色中的方法是:实例方法
    public Gun getGun(){
//        实际上new这个对象还是我们程序自己new的
        return new Gun();
    }
}
