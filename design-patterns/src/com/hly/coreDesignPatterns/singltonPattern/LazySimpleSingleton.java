package com.hly.coreDesignPatterns.singltonPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/26
 * @QQ :1136513099
 * @desc : 懒汉模式，被外部类调用的时候内部类才会加载(线程不安全)
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton singleton = null;
    public static LazySimpleSingleton getInstance(){
        if(singleton==null){
            singleton = new LazySimpleSingleton();
        }
        return singleton;
    }
}
