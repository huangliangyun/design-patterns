package com.hly.designPatterns.builderPattern;

import java.util.ArrayList;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/26
 */
public class MusicAppBuilder extends AppBuilder {
    private MusicAppModel musicApp = new MusicAppModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.musicApp.setSequence(sequence);
    }

    @Override
    public AppModel getAppModel() {
        return this.musicApp;
    }
}
