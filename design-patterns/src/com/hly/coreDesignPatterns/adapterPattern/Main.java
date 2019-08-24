package com.hly.coreDesignPatterns.adapterPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/24
 * @QQ :1136513099
 * @desc :适配器模式
 */
public class Main {

    public static void main(String[] args){

        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5V();
    }
}
