package com.hly.designPatterns.templateMethodPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/26
 */
public class Huawei extends TelPhoneModel {
    @Override
    public void startUp() {
        System.err.println("华为开机");
    }

    @Override
    public void shutDown() {
        System.err.println("华为关机");
    }

    @Override
    public void watchMovie() {
        System.err.println("用华为看小电影");
    }

    @Override
    public void study() {
        System.err.println("用华为学习");
    }

    @Override
    protected boolean overWall() {
        return true;
    }


}
