package com.powernode.simple.factory;

/**
 * @ClassName : WeaponFactory
 * @Author : lonZzai
 * @Date : 2022/12/8 0:10
 */
public class WeaponFactory {
    /**
     * 静态方法,要获取什么产品? 就看你传入什么参数 传入Tank获取坦克 传DAGGER获取匕首  传入FIGHTER获取战斗机
     * @param weaponType
     * @return
     */
    public static Weapon get(String weaponType){
        if("TANK".equals(weaponType)){
            return new Tank();
        }else  if("DAGGER".equals(weaponType)){
            return new Dagger();
        }else  if("FIGHTER".equals(weaponType)){
            return  new Fighter();
        }else {
            throw new RuntimeException("不支持该武器的生成");
        }

    }
}
