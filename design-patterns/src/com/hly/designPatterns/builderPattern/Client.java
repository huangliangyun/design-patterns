package com.hly.designPatterns.builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/26
 */
public class Client {

    public static void main(String[] args){
        //启动，伴随音乐，出现视频，玩，退出
        //我们可以根据需求修改顺序,适合多种功能组合
        /*ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("start");
        sequence.add("listenMusic");
        sequence.add("playGame");
        //sequence.add("watchMovie");
        sequence.add("exit");
        PesticideAppBuilder pesticideBuilder = new PesticideAppBuilder();
        pesticideBuilder.setSequence(sequence);
        PesticideAppModel pesticide = (PesticideAppModel) pesticideBuilder.getAppModel();
        pesticide.run();*/
        Direct direct = new Direct();
        direct.getMusicApp().run();
        direct.getPesticideApp().run();

        List<String> list = new ArrayList<>();
    }
}
