package com.hly.designPatterns.templateMethodPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/26
 */
public class Xiaomi extends TelPhoneModel {

    private boolean overWallFlag = true;

    @Override
    public void startUp() {
        System.err.println("小米开机");
    }

    @Override
    public void shutDown() {
        System.err.println("小米关机");
    }

    @Override
    public void watchMovie() {
        System.err.println("用小米看小电影");
    }

    @Override
    public void study() {
        System.err.println("用小米学习");
    }

    //默认可以玩游戏
    @Override
    protected boolean overWall() {
        return this.overWallFlag;
    }

    //要不要翻墙
    public void setOverWall(Boolean overWall){
        this.overWallFlag = overWall;
    }

}
