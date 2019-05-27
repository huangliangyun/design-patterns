package com.hly.designPatterns.bridgePattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/27
 */
public class Client {

    public static void main(String[] args){

        System.err.println("养老基金：");
        InvestManager investManager = new InvestManager(new YangLao());
        investManager.makeMoney();
        System.err.println();
        System.err.println("教育基金：");
        InvestManager investManager1 = new InvestManager(new Education());
        investManager1.makeMoney();







    }
}
