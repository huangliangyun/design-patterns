package com.hly.designPatterns.bridgePattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/27
 */
public class Education  extends InvestPortfolio{



    @Override
    public void SecurityTypes() {
        System.err.println("教育基金组合(jjj+lll)");
    }

    @Override
    public void sell() {
        System.err.println("基金买卖");
    }
}
