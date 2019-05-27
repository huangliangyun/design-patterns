package com.hly.designPatterns.singletonPatterns;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/7
 */

//懒汉模式-线程安全-线程同步
public class IdlerPatternThreadSafeSynchronizedMethod {

    private static IdlerPatternThreadSafeSynchronizedMethod instance;

    private IdlerPatternThreadSafeSynchronizedMethod(){}

    public static synchronized IdlerPatternThreadSafeSynchronizedMethod getInstance(){
        if(instance == null){
            instance = new IdlerPatternThreadSafeSynchronizedMethod();
        }
        return instance;
    }
}
