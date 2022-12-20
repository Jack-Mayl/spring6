package com.powernaode.factory.method;

/**
 * @ClassName : WeaponFactory
 * @Author : lonZzai
 * @Date : 2022/12/8 0:10
 */
public interface WeaponFactory {
    /**
     * 这个方法不是静态的 是实例方法
     * @return
     */
  public abstract Weapon get();
}
