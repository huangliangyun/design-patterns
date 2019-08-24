package com.hly.coreDesignPatterns.decoratorPattren.decoratorPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/24
 * @QQ :1136513099
 * @desc :装饰者模式
 */
public class Main {

    public static void main(String[] args){

        Battercake battercake;
        battercake = new BaseBattercake();
        //加一个鸡蛋
        battercake = new EggDecorator(battercake);
        //再加一个鸡蛋
        battercake = new EggDecorator(battercake);
        //加一根香肠
        battercake = new SausageDecorator(battercake);
        System.out.println(battercake.getMag()+",总价为："+battercake.getPrice());

    }

}
