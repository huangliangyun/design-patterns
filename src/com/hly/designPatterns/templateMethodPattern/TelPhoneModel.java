package com.hly.designPatterns.templateMethodPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/26
 */
public abstract class TelPhoneModel {

    protected abstract void startUp();

    protected abstract void shutDown();

    protected abstract void watchMovie();

    protected abstract void study();

    protected abstract boolean overWall ();

    final public void use() {
        this.startUp();
        this.watchMovie();
        this.study();
        this.shutDown();
    }

}
