package com.powernode.spring6.dao;

/**
 * 持久层
 * @ClassName : UserDao
 * @Author : longzai
 * @Date : 2022/11/7 11:01
 */
public interface UserDao {
    /**
     * 根据id删除用户信息
     */
    void deleteById();
}
