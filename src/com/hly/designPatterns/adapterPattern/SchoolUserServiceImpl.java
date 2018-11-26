package com.hly.designPatterns.adapterPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/13
 */
public class SchoolUserServiceImpl implements SchoolUserService {


    @Override
    public Map<String,String> getUser() {
        HashMap<String,String> userMap = new HashMap<String,String>();
        userMap.put("userName","sirius");
        userMap.put("userTel","123");
        userMap.put("userAddress","地球");
        return userMap;
    }
}
