package com.hly.designPatterns.proxyPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/10
 */

//定义一个老师，布置任务
public class Teacher {

    public static void main(String[] args) {
        //我不想做事，把学霸叫过来
        StudyBa talent = new StudyBa();
        //表面上是学霸在做事，实际上完成事情的是我
        talent.coding();
        talent.writing();
    }
}
