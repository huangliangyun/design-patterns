package com.hly.designPatterns.proxyPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/10
 */
//定义我(被代理人)能做什么
public class Me implements Proxy {

    @Override
    public void coding() {
        System.out.println("我在敲代码");
    }

    @Override
    public void writing() {
        System.out.println("我在写作业");
    }

}
