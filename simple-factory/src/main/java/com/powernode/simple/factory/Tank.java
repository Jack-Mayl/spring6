package com.powernode.simple.factory;

/**
 * @ClassName : Tank
 * @Author : longZai
 * @Date : 2022/12/8 0:07
 */
public class Tank extends Weapon{
    @Override
    public void attack() {
        System.out.println("坦克开炮!!!");
    }
}
