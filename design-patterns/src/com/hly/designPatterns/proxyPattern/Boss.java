package com.hly.designPatterns.proxyPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/10
 */
//定义Boss(被代理人)能做什么
public class Boss implements ProxyMen {

    @Override
    public void driving() {
        System.out.println("驾驶法拉利");
    }

    @Override
    public void business() {
        System.out.println("出差去美国");
    }
}
