package com.hly.coreDesignPatterns.decoratorPattren.decoratorPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/24
 * @QQ :1136513099
 * @desc :基础套餐
 */
public class BaseBattercake extends Battercake {
    @Override
    protected String getMag() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
