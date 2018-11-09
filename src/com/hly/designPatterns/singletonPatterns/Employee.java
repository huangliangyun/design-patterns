package com.hly.designPatterns.singletonPatterns;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/9
 */

public class Employee {

    public static void main(String[] args){

        Boss boss1 = Boss.getInstance();
        boss1.bossName();

        Boss boss2 = Boss.getInstance();
        boss2.bossName();

        Boss boss3 = Boss.getInstance();
        boss3.bossName();

        //每一次开会都是同一个boss

    }


}
