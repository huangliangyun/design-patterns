package com.hly.designPatterns.singletonPatterns;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/9
 */

//懒汉模式-线程不安全
public class IdlerPatternUnThreadSafe {

    private static IdlerPatternUnThreadSafe instance = null;

    //不能直接生成实例
    private IdlerPatternUnThreadSafe() {
    }

    public static IdlerPatternUnThreadSafe getInstance() {
       if(instance == null){
           instance = new IdlerPatternUnThreadSafe();
        }
        return instance;
    }
}
