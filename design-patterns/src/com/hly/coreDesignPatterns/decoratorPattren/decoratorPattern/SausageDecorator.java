package com.hly.coreDesignPatterns.decoratorPattren.decoratorPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/24
 * @QQ :1136513099
 * @desc :香肠装饰者
 */
public class SausageDecorator extends BattercakeDecorator {

    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMag() {
        return super.getMag()+"+1香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+2;
    }
}
