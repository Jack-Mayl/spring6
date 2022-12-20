package com.powernaode.factory.method;

/**
 * 具体产品角色
 * @ClassName : Gun
 * @Author : longzai
 * @Date : 2022/12/8 0:40
 */
public class Dagger extends Weapon{
    @Override
    public void attack() {
        System.out.println("砍丫的！");
    }
}