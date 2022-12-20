package com.powernaode.factory.method;

/**
 * @ClassName : Fighter
 * @Author : longzai
 * @Date : 2022/12/8 1:02
 */
public class Fighter extends Weapon{
    @Override
    public void attack() {
        System.out.println("抛下了卖导弹的小女孩!!!");
    }
}
