package com.hly.designPatterns.facadePattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/12
 */

//定义一个买基金的过程
public interface FundProcess {

    //下载app
    public void downloadApp();

    //查找基金
    public void findFund(String fund);

    //看盘，找到合适时间，低买高卖
    public void readTape();

    //买基金
    public void buyFund();

    //投个资还得花费那么多功夫，投资人可是很忙的！
}
