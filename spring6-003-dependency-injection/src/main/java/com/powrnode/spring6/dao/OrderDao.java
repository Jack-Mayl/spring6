package com.powrnode.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.PropertyResourceBundle;

/**
 * @ClassName : OrderDao
 * @Author : 龙仔
 * @Data ： 2022/11/12 16:55
 **/
public class OrderDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    public void insert(){
        logger.info("订单正在生成...");
    }
}
