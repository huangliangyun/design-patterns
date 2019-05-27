package com.hly.designPatterns.factoryMethodPattern;

import java.lang.annotation.ElementType;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/11
 */

//工人类，生产工具
public class Worker {

    public static void main(String[] args) {
        System.out.println("生产笔记本：");
        Equipment computer = Factory.createEquipment(Computer.class);
        computer.solveProblems();
        computer.useEnergy();

        System.out.println("生产键盘：");
        Equipment keyBoard = Factory.createEquipment(KeyBoard.class);
        keyBoard.solveProblems();
        keyBoard.useEnergy();

    }
}
