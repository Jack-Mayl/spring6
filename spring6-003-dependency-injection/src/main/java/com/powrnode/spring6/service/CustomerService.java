package com.powrnode.spring6.service;

import com.powrnode.spring6.dao.UserDao;
import com.powrnode.spring6.dao.VipDao;

/**
 * @ClassName : CustomerService
 * @Author : 龙仔
 * @Data ： 2022/11/12 15:54
 **/
public class CustomerService {
    private UserDao userDao;
    private VipDao vipDao;

//    public CustomerService(UserDao userDao, VipDao vipDao) {
//        this.userDao = userDao;
//        this.vipDao = vipDao;
//    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }

    public  void save(){
        userDao.insert();
        vipDao.insert();
    }
}
