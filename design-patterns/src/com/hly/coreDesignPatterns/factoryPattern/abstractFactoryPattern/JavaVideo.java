package com.hly.coreDesignPatterns.factoryPattern.abstractFactoryPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/26
 * @QQ :1136513099
 * @desc :
 */
public class JavaVideo implements IVideo {
    @Override
    public void video() {
        System.out.println("看视频学习Java");
    }
}
