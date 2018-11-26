package com.hly.designPatterns.facadePattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/12
 */

//有人要开始买基金了
public class Investor {

    //需要知道四个步骤和顺序，不然就无法投资了，不符合我们的理想，接下来定义门面模式
    public static void main(String[] args){
        FundProcess fundProcess = new FundProcessImpl();
        fundProcess.downloadApp();
        fundProcess.findFund("易方达");
        fundProcess.readTape();
        fundProcess.buyFund();

        //门面模式，一步到位
        FundAgency fundAgency = new FundAgency();
        fundAgency.buyFund("易方达");
    }
}
