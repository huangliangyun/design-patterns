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
public abstract class StudyTamplate {

    protected final void study() {

        if (needtakeLessons())
            takeLessons();
        this.readBooks();
        this.takeNotes();
        this.doHomes();

    }

    //听课
    abstract void takeLessons();

    //钩子方法
    protected boolean needtakeLessons() {
        return false;
    }

    final void readBooks() {
        System.out.println("看书");
    }

    final void takeNotes() {
        System.out.println("做笔记");
    }

    final void doHomes() {
        System.out.println("做作业");
    }


}
