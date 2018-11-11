package com.hly.designPatterns.factoryMethodPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/11
 */
public class KeyBoard implements Equipment {
    @Override
    public void solveProblems() {
        //键盘能够打字
        System.out.println("typewriting");
    }

    @Override
    public void useEnergy() {
        System.out.println("Use electricity");
    }
}
