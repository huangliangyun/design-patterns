package com.hly.designPatterns.builderPattern;

import java.util.ArrayList;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/26
 */
public class PesticideAppBuilder extends AppBuilder {
    private PesticideAppModel pesticide = new PesticideAppModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
            this.pesticide.setSequence(sequence);
    }

    @Override
    public AppModel getAppModel() {
        return this.pesticide;
    }
}
