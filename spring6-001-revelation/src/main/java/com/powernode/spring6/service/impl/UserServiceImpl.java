package com.powernode.spring6.service.impl;

import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.dao.impl.UserDaoImpl;
import com.powernode.spring6.service.UserService;

/**
 * @ClassName : UserServiceImpl
 * @Author : longzai
 * @Date : 2022/11/7 11:05
 */
public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();
    @Override
    public void deleteUser() {
        userDao.deleteById();
    }


}
