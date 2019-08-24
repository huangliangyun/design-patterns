package com.hly.coreDesignPatterns.decoratorPattren.unDecoratorPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/24
 * @QQ :1136513099
 * @desc :加鸡蛋的煎饼
 */
public class BattercakeWithEgg extends Battercake {

    @Override
    protected String getMsg() {
        return super.getMsg()+"+1鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1;
    }
}
