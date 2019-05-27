package com.hly.designPatterns.facadePattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/12
 */

//找个基金代理来帮忙投资吧
public class FundAgency {

    FundProcess fundProcess = new FundProcessImpl();
    /*直接对这个过程进行了封装*/
    public void buyFund(String fund){

        //这里还能添加别的实现类，对用户隐藏了过程
        fundProcess.downloadApp();
        fundProcess.findFund(fund);
        fundProcess.readTape();
        fundProcess.buyFund();
    }
}
