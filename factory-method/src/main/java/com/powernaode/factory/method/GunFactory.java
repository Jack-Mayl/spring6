package com.powernaode.factory.method;

/**
 * @ClassName : GunFactory
 * @Author : longZai
 * @Date : 2022/12/8 0:42
 */
public class GunFactory implements WeaponFactory{
    @Override
    public Weapon get() {
        return new Gun();
    }
}
