package com.hly.designPatterns.templateMethodPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/26
 */
public class Client {

    public static void main(String[] args) {
        TelPhoneModel huawei = new Huawei();
        huawei.use();
        //如果实现类是TelPhoneModel，将不能用Xiaomi有而TelPhoneModel没有的方法
        Xiaomi xiaomi = new Xiaomi();
        xiaomi.setOverWall(true);
        xiaomi.use();
        System.err.println("小米能翻墙吗："+xiaomi.overWall());
    }
}
