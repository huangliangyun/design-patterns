package com.hly.designPatterns.factoryMethodPattern;

import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/11
 */

//工厂类，生产设备
public class Factory {


    //生产设备
    public static Equipment createEquipment(Class c) {
        Equipment equipment = null;

        try {
            //生产一个设备出来
            equipment = (Equipment) Class.forName(c.getName()).newInstance();

        } catch (InstantiationException e) {
            System.out.println("生产过程出现问题");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return equipment;
    }

}
