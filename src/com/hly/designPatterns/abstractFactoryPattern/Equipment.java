package com.hly.designPatterns.abstractFactoryPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/11
 */
//设备接口，工厂生产的设备
public interface Equipment {

    //设备有什么功能，设备能用来解决问题
    public void solveProblems();

    //设备一般都消耗资源
    public void useEnergy();

    //定义颜色
    public void color();


}
