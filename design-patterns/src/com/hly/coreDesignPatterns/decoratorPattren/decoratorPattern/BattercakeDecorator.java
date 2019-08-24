package com.hly.coreDesignPatterns.decoratorPattren.decoratorPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/24
 * @QQ :1136513099
 * @desc :扩展套餐的抽象装饰者类
 */
public abstract class BattercakeDecorator extends Battercake {

    //静态代理，委派
    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMag() {
        return this.battercake.getMag();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
