package com.powrnode.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @ClassName : UserDao
 * @Author : 龙仔
 * @Data ： 2022/11/9 15:18
 **/
public class UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    public  void insert(){
//        System.out.println("数据库正在保持用户信息");
//        使用一下log4j2日志框架
        logger.info("数据库正在保存用户信息");

    }
}
