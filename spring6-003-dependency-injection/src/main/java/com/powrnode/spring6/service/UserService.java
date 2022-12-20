package com.powrnode.spring6.service;

import com.powrnode.spring6.dao.UserDao;
import com.powrnode.spring6.dao.VipDao;

/**
 * @ClassName : UserService
 * @Author : 龙仔
 * @Data ： 2022/11/9 15:22
 **/
public class UserService {
    private UserDao aaa;
    private VipDao vipDao;

    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }

//    set注入的话，必须提供一个set方法
//    Spring容器会调用这个set方法,来给userDao属性赋值
//    我自己写一个set方法,不使用IDEA工具生成的,不符合javaBean规范
//    至少这个方法是以set单词开始的,前三个字母不能随便写,必须是"set"
//    public void setMySQLUserDao(UserDao userDao){
//        this.userDao = userDao;
//
//    }



//    这个set方法是IDEA工具生成的,符合JavaBean规范
    public void setUserDao(UserDao userDao) {
        this.aaa = userDao;
    }

    public void savaUser(){
//        保持用户信息到数据库
        aaa.insert();
    }
}
