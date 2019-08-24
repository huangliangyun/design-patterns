package com.hly.coreDesignPatterns.factoryPattern.factoryMethodPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/26
 * @QQ :1136513099
 * @desc :
 */
public class Main {

    public static void main(String[] args){
        IStudyFactory factory = new JavaStudyFactory();
        IStudy study = factory.study();
        study.study();
    }
}
