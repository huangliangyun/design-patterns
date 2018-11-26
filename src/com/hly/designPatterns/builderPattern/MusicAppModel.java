package com.hly.designPatterns.builderPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/26
 */
public class MusicAppModel extends AppModel {
    @Override
    protected void start() {
        System.err.println("音乐APP启动");
    }

    @Override
    protected void listenMusic() {
        System.err.println("音乐APP播放音乐");
    }

    @Override
    protected void watchMovie() {
        System.err.println("音乐APP看视频");
    }

    @Override
    protected void playGame() {
        System.err.println("音乐APP农药");
    }

    @Override
    protected void exit() {
        System.err.println("音乐APP退出");
    }
}
