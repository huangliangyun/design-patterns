package com.hly.designPatterns.singletonPatterns;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/9
 */
//通用单例模式:饿汉模式
//解决线程时间差造成的对象多余和混乱
public class HungrySingletonPattern {

    //加载时被初始化，直接生成对象，需要时直接获取
    private static final HungrySingletonPattern singletonPattern = new HungrySingletonPattern();

    //不能直接生成实例
    private HungrySingletonPattern() {
    }

    public synchronized static HungrySingletonPattern getInstance() {
        return singletonPattern;
    }
}
