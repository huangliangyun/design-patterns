package com.hly.coreDesignPatterns.decoratorPattren.unDecoratorPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/24
 * @QQ :1136513099
 * @desc :装非饰者模式
 */
public class Main {

    public static void main(String[] args){

        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg()+",总价格："+battercake.getPrice());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg()+",总价格："+battercakeWithEgg.getPrice());

        BattercakeWithEggAndSausage battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getMsg()+",总价格："+battercakeWithEggAndSausage.getPrice());



    }
}
