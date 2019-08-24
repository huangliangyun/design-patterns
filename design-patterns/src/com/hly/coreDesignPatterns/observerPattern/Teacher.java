package com.hly.coreDesignPatterns.observerPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/24
 * @QQ :1136513099
 * @desc :观察者
 */
public class Teacher implements Observer {

    private String name;

    public String getName() {
        return name;
    }

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        User user = (User) o;
        Question question = (Question) arg;
        System.out.println("=============================================");
        System.out.println(name + "老师，您好！\n" + "您收到来自" + user.getName() + "的提问，希望您能回答，内容如下:\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUsername());
    }
}
