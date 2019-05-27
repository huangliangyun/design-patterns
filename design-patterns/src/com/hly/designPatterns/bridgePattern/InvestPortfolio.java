package com.hly.designPatterns.bridgePattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/27
 */

//投资组合,自由组合各种投资产品
public abstract class InvestPortfolio  {

    //证券类型
    public abstract void SecurityTypes();
    //证券买卖
    public abstract void sell();

}
