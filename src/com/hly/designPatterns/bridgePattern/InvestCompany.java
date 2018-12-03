package com.hly.designPatterns.bridgePattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/27
 */

//我开了一家投资公司
public abstract class InvestCompany {
    //投资组合
    private InvestPortfolio investPortfolio;

    public InvestCompany(InvestPortfolio investPortfolio) {
        this.investPortfolio = investPortfolio;
    }

    public void makeMoney(){
       this.investPortfolio.SecurityTypes();
       this.investPortfolio.sell();
    }

}
