package com.hly.designPatterns.proxyPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/7
 */

//定义秘书，作为 Boss 的代理
public class Secretary implements ProxyMen {

    private ProxyMen proxyMen;

    //秘书默认为老板的代理人，她也可以是总经理的代理人
    public Secretary() {
        this.proxyMen = new Boss();
    }

    //秘书也可以是别的领导的代理
    public Secretary(ProxyMen proxyMen) {
        this.proxyMen = proxyMen;
    }

    @Override
    public void driving() {
        this.proxyMen.driving();
    }

    @Override
    public void business() {
        this.proxyMen.business();
    }
}
