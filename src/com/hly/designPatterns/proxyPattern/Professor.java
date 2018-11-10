package com.hly.designPatterns.proxyPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/10
 */
//定义一个教授,给这个学生布置任务
public class Professor {

    public static void main(String[] args){
        Student student = new Student();
        //学霸做这个学生的代理
        StudyBa studyBa = new StudyBa(student);
        studyBa.coding();
        studyBa.writing();

    }
}
