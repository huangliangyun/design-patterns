package com.hly.designPatterns.strategyPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/10
 */
//策略的内容
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //根据不同情况，使用不同策略
    public void operate(){
        this.strategy.operate();
    }
}
