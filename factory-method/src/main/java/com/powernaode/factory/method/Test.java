package com.powernaode.factory.method;

/**
 *
 * 这是客户端程序
 * @ClassName : Test
 * @Author : longZai
 * @Date : 2022/12/8 0:14
 */
public class Test {
    public static void main(String[] args) {
        WeaponFactory weaponFactory = new DaggerFactory();
        WeaponFactory weaponFactory1 =new GunFactory();
        Weapon weapon = weaponFactory.get();
        Weapon weapon1 = weaponFactory1.get();
        weapon.attack();
        weapon1.attack();

        WeaponFactory weaponFactory2 =new FighterFactory();
        Weapon weapon2 = weaponFactory2.get();
        weapon2.attack();


    }
}
