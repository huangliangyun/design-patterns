package com.hly.coreDesignPatterns.factoryPattern.simpleFactoryPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/26
 * @QQ :1136513099
 * @desc :
 */
public class StudyFactory {

    //为了调用方便，可以将该方法改为静态方法
    public IStudy study(Class<?extends IStudy> clazz){
        if(clazz!=null){
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
