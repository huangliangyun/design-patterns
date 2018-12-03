package com.hly.designPatterns.bridgePattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/27
 */
public class YangLao extends InvestPortfolio {


    @Override
    public void SecurityTypes() {
        System.err.println("养老基金组合(ccc+vvv)");
    }

    @Override
    public void sell() {
        System.err.println("基金买卖");

    }
}
