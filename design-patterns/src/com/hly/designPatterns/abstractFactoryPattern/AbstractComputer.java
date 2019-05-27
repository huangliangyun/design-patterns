package com.hly.designPatterns.abstractFactoryPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/11
 */

//定义计算机的抽象类
//抽象类不允许实例化
//关于抽象类和接口 http://www.importnew.com/12399.html
public abstract class AbstractComputer implements Equipment {

    public void solveProblems() {
        System.out.println("Do any things if you want !");
    }

    public void useEnergy() {
        System.out.println("Use electricity");
    }


}
