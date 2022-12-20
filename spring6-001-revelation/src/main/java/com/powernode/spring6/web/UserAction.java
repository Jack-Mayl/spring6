package com.powernode.spring6.web;

import com.powernode.spring6.service.UserService;
import com.powernode.spring6.service.impl.UserServiceImpl;

/**
 * 表示层
 * @ClassName : UserAction
 * @Author : longzai
 * @Date : 2022/11/7 11:02
 */
public class UserAction {
    private UserService userService = new UserServiceImpl();

    /**
     * 删除用户信息的请求
     */
    public void deleteRequest(){
        userService.deleteUser();
    }
}
