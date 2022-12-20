package com.powernode.simple.factory;

/**
 *
 * 具体产品角色
 * @ClassName : Dagger
 * @Author : longZai
 * @Date : 2022/12/8 0:09
 */
public class Dagger extends Weapon{
    @Override
    public void attack() {
        System.out.println("砍丫的!!!");
    }
}
