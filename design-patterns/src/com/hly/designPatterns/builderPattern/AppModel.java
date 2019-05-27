package com.hly.designPatterns.builderPattern;

import java.util.ArrayList;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/26
 */
public abstract  class AppModel {

    //各个方法的执行顺序
    private ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void start();

    protected abstract void listenMusic();

    protected abstract void watchMovie();

    protected abstract void playGame();

    protected abstract void  exit();

    final public void run(){

        for(int i=0;i<sequence.size();i++){

            String actionName = this.sequence.get(i);
            if(actionName.equalsIgnoreCase("start"))
                this.start();
            else if (actionName.equalsIgnoreCase("listenMusic"))
                this.listenMusic();
            else if (actionName.equalsIgnoreCase("watchMovie"))
                this.watchMovie();
            else if (actionName.equalsIgnoreCase("playGame"))
                this.playGame();
            else if (actionName.equalsIgnoreCase("exit"))
                this.exit();
        }
    }

    final public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }

}
