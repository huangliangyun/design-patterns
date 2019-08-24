package com.hly.coreDesignPatterns.templateMethodPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/24
 * @QQ :1136513099
 * @desc :
 */
public class StudyBigData extends StudyTamplate{

    private boolean needTakeLessons = false;

    public StudyBigData(boolean needTakeLessons) {
        this.needTakeLessons = needTakeLessons;
    }

    @Override
    void takeLessons() {
        System.out.println("听大数据课程");
    }

    @Override
    protected boolean needtakeLessons() {
        return this.needTakeLessons;
    }
}
