package com.hly.designPatterns.adapterPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/13
 */
public class Web {

    public static void main(String[] args) {

        UserService user = new UserServiceImpl();

        //单独一个系统的实现
        /*
            System.out.println(user.getUserName());
       */

        UserService users = new AdapterUser();
        System.out.println(users.getAddress());
    }
}
