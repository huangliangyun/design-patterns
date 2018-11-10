package com.hly.designPatterns.proxyPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/10
 */
//定义一个学霸，作为一类人的代理
//也实现代理接口
public class StudyBa implements Proxy {
    Proxy proxyMan;

    //默认为我的代理
    public StudyBa() {
        this.proxyMan = new Me();
    }

    //也可以是任何一个学生的代理
    public StudyBa(Proxy proxyMan) {
        this.proxyMan = proxyMan;
    }

    @Override
    public void coding() {
        this.proxyMan.coding();
    }

    @Override
    public void writing() {
        this.proxyMan.writing();
    }
}
