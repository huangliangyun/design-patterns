package com.hly.designPatterns.proxyPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/10
 */
public class Test {

    public static void main(String[] args){
        //Secretary 代理 Boss
        Secretary secretary = new Secretary();
        secretary.driving();
        secretary.business();

        //秘书也可以作为经理的代理
        Manager manager = new Manager();
        secretary = new Secretary(manager);
        secretary.driving();
        secretary.business();

    }
}
