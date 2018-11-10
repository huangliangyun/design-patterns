package com.hly.designPatterns.proxyPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/10
 */

//还有另一个学生想要代理
public class Student implements Proxy {

    @Override
    public void coding() {
        System.out.println("Student在敲代码");
    }

    @Override
    public void writing() {
        System.out.println("Student在写作业");
    }
}
