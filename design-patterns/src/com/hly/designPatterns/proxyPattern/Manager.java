package com.hly.designPatterns.proxyPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/7
 */
//再定义一个经理
public class Manager implements ProxyMen {
    @Override
    public void driving() {
        System.out.println("驾驶保时捷");
    }

    @Override
    public void business() {
        System.out.println("出差去英国");
    }
}
