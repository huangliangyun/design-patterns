package com.hly.designPatterns.facadePattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/12
 */

//具体实现类
public class FundProcessImpl implements FundProcess {
    @Override
    public void downloadApp() {
        System.out.println("下载的App");
    }

    @Override
    public void findFund(String fund) {
        System.out.println("准备买的基金是:"+fund);

    }

    @Override
    public void readTape() {
        System.out.println("找个具体的时间");
    }

    @Override
    public void buyFund() {
        System.out.println("买下基金");
    }
}
