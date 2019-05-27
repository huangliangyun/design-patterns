package com.hly.designPatterns.abstractFactoryPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/11
 */


//黑色的计算机
public class BlackComputer extends AbstractComputer {

    @Override
    public void color() {

        System.out.println("该笔记本的颜色为黑色！");

    }
}
