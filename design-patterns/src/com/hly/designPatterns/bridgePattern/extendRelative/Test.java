package com.hly.designPatterns.bridgePattern.extendRelative;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/27
 */
public class Test {

    public static void main(String[] args){
       Son son = new Son();
       son.doSomeThings();
       //子类继承父类，调用父类方法，不需要重写
       son.eatSomeThings();

       GrandSon grandSon = new GrandSon();
       grandSon.doSomeThings();

    }
}
