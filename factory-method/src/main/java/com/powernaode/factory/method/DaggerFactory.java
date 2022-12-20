package com.powernaode.factory.method;

/**
 *	具体工厂角色
 * @ClassName : DaggerFactory
 * @Author : longZai
 * @Date : 2022/12/8 0:41
 */
public class DaggerFactory implements WeaponFactory{
    @Override
    public Weapon get() {
        return new Dagger();
    }
}