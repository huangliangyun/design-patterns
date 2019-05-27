package com.hly.designPatterns.multitionPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/10
 */
public class Employee {

    public static void main(String[] args){

        //8个员工所属的老板随机是
        for(int i=0;i<8;i++){
            Boss boss =Boss.getInstance();
            System.out.print("员工"+i+":  ");
            boss.getBossName();
        }
    }
}
