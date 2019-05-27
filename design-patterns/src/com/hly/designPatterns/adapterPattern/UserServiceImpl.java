package com.hly.designPatterns.adapterPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/13
 */
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName() {
        System.out.println("用户名:hly");
        return null;
    }

    @Override
    public String getUserTel() {
        System.out.println("电话:178123*****");
        return null;
    }

    @Override
    public String getAddress() {
        System.out.println("用户地址:地球");
        return null;
    }
}
