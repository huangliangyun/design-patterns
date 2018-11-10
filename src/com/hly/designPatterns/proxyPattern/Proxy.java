package com.hly.designPatterns.proxyPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/10
 */
//定义代理人的接口
//代理人需要知道被代理人会做什么
public interface Proxy {

    //被代理人能做什么事
    //敲代码
    public void coding();

    //写作
    public void writing();

}
