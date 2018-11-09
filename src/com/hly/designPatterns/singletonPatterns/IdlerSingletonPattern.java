package com.hly.designPatterns.singletonPatterns;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/9
 */

//通用单例模式:懒汉模式
public class IdlerSingletonPattern {

    private static IdlerSingletonPattern singletonPattern = null;

    //不能直接生成实例
    private IdlerSingletonPattern() {
    }

    /*public static IdlerSingletonPattern getInstance() {
       if(singletonPattern == null){
           singletonPattern = new IdlerSingletonPattern();
        }
        return singletonPattern;
    }*/

    //多线程加同步锁
    public synchronized static IdlerSingletonPattern getInstance() {
        if(singletonPattern == null){
            singletonPattern = new IdlerSingletonPattern();
        }
        return singletonPattern;
    }
}
