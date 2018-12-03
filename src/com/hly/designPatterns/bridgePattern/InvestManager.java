package com.hly.designPatterns.bridgePattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/27
 */

//基金经理就是一座桥梁，连接了基金公司和投资组合
public class InvestManager extends InvestCompany {
    public InvestManager(InvestPortfolio investPortfolio) {
        super(investPortfolio);
    }

    public void makeMoney(){
       super.makeMoney();
       System.err.println("获取财富");
    }

}
