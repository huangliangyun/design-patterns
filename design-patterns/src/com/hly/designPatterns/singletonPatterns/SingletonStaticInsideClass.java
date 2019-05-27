package com.hly.designPatterns.singletonPatterns;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/7
 */

//单例模式-静态内部类
public class SingletonStaticInsideClass {

    private SingletonStaticInsideClass(){}

    private static class SingletonInstance{
        private static final SingletonStaticInsideClass INSTANCE = new SingletonStaticInsideClass();
    }

    public static SingletonStaticInsideClass getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
