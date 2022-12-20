package com.powrnode.spring6.service;

import com.powrnode.spring6.dao.OrderDao;

/**
 * @ClassName : OrderDaoService
 * @Author : 龙仔
 * @Data ： 2022/11/12 16:56
 **/
public class OrderDaoService {
    private OrderDao orderDao;
    // 通过set方法给属性赋值
    public void setDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    /**
     * 生成订单的业务方法..
     */
    public  void generate(){
        orderDao.insert();
    }
}
