package com.hly.designPatterns.abstractFactoryPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/11
 */
public class Worker {

    public static void main(String[] args){

        //开始生产
        EquipmentFactory equipmentFactory = new EquipmentCreateFactory();
        Equipment blackComputer = equipmentFactory.createBlackComputer();
        blackComputer.solveProblems();
        blackComputer.useEnergy();
        blackComputer.color();
    }
}
