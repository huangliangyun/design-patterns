package com.hly.designPatterns.builderPattern;

import java.util.ArrayList;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/26
 */
public  abstract class AppBuilder {

    //APP功能实现顺序
    public abstract void setSequence(ArrayList<String> sequence);

    //得到想要的APP
    public abstract AppModel getAppModel();

}
