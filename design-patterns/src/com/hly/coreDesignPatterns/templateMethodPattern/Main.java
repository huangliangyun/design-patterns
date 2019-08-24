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
public class Main {

    public static void main(String[] args){
        System.out.println("================学习Java================");
        StudyJava studyJava = new StudyJava();
        studyJava.study();

        System.out.println("================学习大数据================");
        StudyBigData studyBigData = new StudyBigData(true);
        studyBigData.study();

    }
}
