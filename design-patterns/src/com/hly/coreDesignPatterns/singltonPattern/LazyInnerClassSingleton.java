package com.hly.coreDesignPatterns.singltonPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/26
 * @QQ :1136513099
 * @desc :静态内部类懒汉模式
 */

//兼顾饿汉模式单例模式的内存浪费问题和synchronized的性能问题
//屏蔽了这两个缺点
public class LazyInnerClassSingleton {
    
    //static 使单例共享空间，保证这个方法不会被重写，重载
    public static final LazyInnerClassSingleton getInstance(){
        //返回结果之前，会先加载内部类
        return LazyHolder.INSTANCE;
    }
    //默认不会加载
    private static class LazyHolder{
        private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }
}
