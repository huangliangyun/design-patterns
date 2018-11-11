package com.hly.designPatterns.factoryMethodPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/11
 */

//定义具体的设备
public class Computer implements Equipment {
    @Override
    public void solveProblems() {
        System.out.println("Do any things if you want !");
    }

    @Override
    public void useEnergy() {
        System.out.println("Use electricity");
    }
}
