package com.hly.coreDesignPatterns.factoryPattern.factoryMethodPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/26
 * @QQ :1136513099
 * @desc :
 */
public class JavaStudyFactory implements IStudyFactory {

    @Override
    public IStudy study() {
        return new JavaStudy();
    }
}
