package com.hly.designPatterns.builderPattern;

import java.util.ArrayList;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/26
 */
public class Direct {

    private ArrayList<String> sequence = new ArrayList<>();
    private PesticideAppBuilder pesticideAppBuilder = new PesticideAppBuilder();
    private MusicAppBuilder musicAppBuild = new MusicAppBuilder();

    public PesticideAppModel getPesticideApp(){
        this.sequence.clear();

        this.sequence.add("start");
        this.sequence.add("playGame");
        this.sequence.add("exit");
        this.pesticideAppBuilder.setSequence(sequence);
        return (PesticideAppModel) this.pesticideAppBuilder.getAppModel();
    }

    public MusicAppModel getMusicApp(){
        this.sequence.clear();

        this.sequence.add("start");
        this.sequence.add("listenMusic");
        this.sequence.add("exit");
        this.musicAppBuild.setSequence(sequence);
        return (MusicAppModel) this.musicAppBuild.getAppModel();
    }
}
