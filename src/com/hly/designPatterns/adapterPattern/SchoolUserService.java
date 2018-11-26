package com.hly.designPatterns.adapterPattern;

import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/13
 */

//学校系统保存用户信息的方式
public interface SchoolUserService {

    public Map<String,String> getUser();


}
