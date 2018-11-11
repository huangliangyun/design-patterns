package com.hly.designPatterns.multitionPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/10
 */
public class Boss {

    private String bossName;
    private static int maxBoss = 3;
    //老板列表
    private static ArrayList<Boss> bossList = new ArrayList(maxBoss);
    private  static  int thisBoss = 0;//目前哪个老板负责

    //初始化几个老板
    static {
        for(int i=0;i<3;i++){
            bossList.add(new Boss("老板"+i));
        }
    }

    private Boss() {
    }

    private Boss(String bossName) {
         this.bossName = bossName;
    }
    //选一个老板负责业务
    public static Boss getInstance(){
        Random random = new Random();
        thisBoss = random.nextInt(maxBoss);
        return bossList.get(thisBoss);
    }

    //这个老板叫啥
    public static void getBossName(){
        System.out.println(bossList.get(thisBoss).bossName);
    }
}
