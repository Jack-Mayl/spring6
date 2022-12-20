package com.powernode.simple.factory;

/**
 * @ClassName : Fighter
 * @Author : longZai
 * @Date : 2022/12/8 0:08
 */
public class Fighter extends Weapon {

    @Override
    public void attack() {
        System.out.println("战斗机抛下卖导弹的小女孩!!!!");
    }
}
