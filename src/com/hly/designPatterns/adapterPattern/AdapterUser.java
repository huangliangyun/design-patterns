package com.hly.designPatterns.adapterPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/13
 */

//定义适配器，把学校人员信息引进来
public class AdapterUser extends SchoolUserServiceImpl implements UserService {

    //学校人员信息,获得SchoolUserServiceImpl,getUser方法信息
    private Map<String,String> schoolUser  = super.getUser();

    public String getUserName() {

        String userName = schoolUser.get("userName");
        System.out.println(userName);
        return userName;

    }

    public String getUserTel() {

        String userTel = schoolUser.get("userTel");
        System.out.println(userTel);
        return userTel;
    }

    public String getAddress() {

        String userAddress = schoolUser.get("userAddress");
        System.out.println(userAddress);
        return userAddress;
    }
}
