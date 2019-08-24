package com.hly.coreDesignPatterns.adapterPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/24
 * @QQ :1136513099
 * @desc :
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        //变压器
        int adapterOutput = adapterInput/44;
        System.out.println("使用PowerAdapter输入AC："+adapterInput+"V，"+"输出DC:"+adapterOutput+"V");
        return adapterOutput;
    }
}
