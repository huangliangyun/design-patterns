package com.hly.coreDesignPatterns.factoryPattern.simpleFactoryPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/26
 * @QQ :1136513099
 * @desc :简单工厂模式
 */
public class Main {
    public static void main(String[] args) {
        StudyFactory factory = new StudyFactory();
        IStudy study = factory.study(JavaStudy.class);
        study.study();
    }
}
