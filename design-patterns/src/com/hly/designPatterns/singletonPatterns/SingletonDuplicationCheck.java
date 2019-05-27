package com.hly.designPatterns.singletonPatterns;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/7
 */
//单例模式-双重检查
public class SingletonDuplicationCheck {

    private static volatile SingletonDuplicationCheck instance;

    private SingletonDuplicationCheck(){}

    public static SingletonDuplicationCheck getInstance(){
        if(instance == null){
            synchronized (SingletonDuplicationCheck.class){
                if(instance == null){
                    instance = new SingletonDuplicationCheck();
                }
            }
        }
        return instance;
    }
}
