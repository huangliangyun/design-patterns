package com.hly.designPatterns.strategyPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/10
 */
public class Coder {

    //码农出场了，开始调用不同策略解决不同的问题了
    public static void main(String[] args) {
        Context useStrategy;
        System.out.print("遇到Bug：");
        useStrategy = new Context(new Thinking());
        useStrategy.operate();

        System.out.print("思考无法解决Bug：");
        useStrategy = new Context(new Baidu());
        useStrategy.operate();

        System.out.print("百度无法解决Bug：");
        useStrategy = new Context(new Question());
        useStrategy.operate();

    }

}
