package com.powernaode.factory.method;

/**
 * @ClassName : Fighter
 * @Author : longzai
 * @Date : 2022/12/8 1:02
 */
public class FighterFactory implements WeaponFactory{

    @Override
    public Weapon get() {
        return new Fighter();
    }
}
