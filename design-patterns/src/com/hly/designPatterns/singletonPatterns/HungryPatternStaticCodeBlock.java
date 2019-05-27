package com.hly.designPatterns.singletonPatterns;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/7
 */

//饿汉模式-静态代码块
public class HungryPatternStaticCodeBlock {
    private static HungryPatternStaticCodeBlock instance;

    static {
        instance = new HungryPatternStaticCodeBlock();
    }

    private HungryPatternStaticCodeBlock(){}

    public static HungryPatternStaticCodeBlock getInstance(){
        return instance;
    }
}
