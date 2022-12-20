package com.powrnode.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName : VipDao
 * @Author : 龙仔
 * @Data ： 2022/11/12 15:06
 **/
public class VipDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);
    public  void insert(){
//        System.out.println("数据库正在保持用户信息");
//        使用一下log4j2日志框架
        logger.info("正在保存vip信息");

    }
}


