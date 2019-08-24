package com.hly.coreDesignPatterns.observerPattern;

import java.util.Observable;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/24
 * @QQ :1136513099
 * @desc :被观察者
 */
public class User extends Observable {

    private String name = "提问圈";
    private static User user = null;

    public static User getInstance(){
        if(null==user){
            user = new User();
        }
        return user;
    }

    public String getName() {
        return name;
    }

    public void publicQuestion(Question question){
        System.out.println(question.getUsername()+"在"+this.name+"上提交了一个问题");
        setChanged();
        notifyObservers(question);
    }






}
