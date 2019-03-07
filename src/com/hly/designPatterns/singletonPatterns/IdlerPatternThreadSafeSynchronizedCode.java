package com.hly.designPatterns.singletonPatterns;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/7
 */

//懒汉模式-线程安全-同步的代码块
public class IdlerPatternThreadSafeSynchronizedCode {

    private static IdlerPatternThreadSafeSynchronizedCode instance;

    private IdlerPatternThreadSafeSynchronizedCode(){}

    public static IdlerPatternThreadSafeSynchronizedCode getInstance(){

        if(instance == null){
            synchronized (IdlerPatternThreadSafeSynchronizedCode.class){
                instance = new IdlerPatternThreadSafeSynchronizedCode();
            }
        }
        return instance;
    }
}
