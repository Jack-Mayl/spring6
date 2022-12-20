package com.powernode.spring6.dao.impl;

import com.powernode.spring6.dao.UserDao;

/**
 * @ClassName : UserDaoImpl
 * @Author : longzai
 * @Date : 2022/11/7 11:05
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void deleteById() {
        System.out.println("正在删除用户信息....");
    }
}
