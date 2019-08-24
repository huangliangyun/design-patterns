package com.hly.coreDesignPatterns.observerPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/24
 * @QQ :1136513099
 * @desc :观察者客户端
 */
public class Main {

    public static void main(String[] args){
        User user = User.getInstance();
        Teacher t1 = new Teacher("hly");
        Teacher t2 = new Teacher("sirius");
        user.addObserver(t1);
        user.addObserver(t2);

        Question question = new Question();
        question.setUsername("mm");
        question.setContent("Java 怎么学");

        user.publicQuestion(question);
    }
}
