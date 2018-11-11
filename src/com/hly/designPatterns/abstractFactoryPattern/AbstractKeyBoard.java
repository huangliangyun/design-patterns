package com.hly.designPatterns.abstractFactoryPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/11
 */
public abstract class AbstractKeyBoard implements Equipment{

    public void solveProblems() {
        System.out.println("打字");
    }

    public void useEnergy() {
        System.out.println("Use electricity");
    }

}
