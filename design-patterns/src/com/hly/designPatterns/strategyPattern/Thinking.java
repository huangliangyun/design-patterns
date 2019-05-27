package com.hly.designPatterns.strategyPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/10
 */
public class Thinking implements Strategy {
    @Override
    public void operate() {
        System.out.println("自己思考");
    }
}
