package com.hly.designPatterns.singletonPatterns;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/9
 */

/**
 * 单例模式，单一，唯一
 * 定义了一个boss，唯一的boss
 */
public class Boss {
    private static Boss boss = null;//定义一个boss

    //不能直接生成实例
    private Boss() {
    }

    public static Boss getInstance() {
        if (boss == null) {//没有Boss，就选一个
            boss = new Boss();
        }
        return boss;
    }

    public static void bossName() {
        System.out.println("boss：hly");
    }

}
