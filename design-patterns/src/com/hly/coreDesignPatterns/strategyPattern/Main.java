package com.hly.coreDesignPatterns.strategyPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/24
 * @QQ :1136513099
 * @desc :策略模式
 */
public class Main {

    public static void main(String[] args){

        Order order = new Order("1","123123",400);

        //System.out.println(order.pay(PayStrategy.WECHAT_PAY));
        System.out.println(order.pay(PayStrategy.ALI_PAY));



    }





}
