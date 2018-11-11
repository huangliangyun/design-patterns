package com.hly.designPatterns.abstractFactoryPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/11
 */

//抽象类，根据枚举生产设备
public abstract class AbstractEquimentFactory implements EquipmentFactory {

    protected Equipment createEquiment(EquipmentEnum equipmentEnum) {
        Equipment equipment = null;
        //如果不是一个具体的枚举类型，则不处理
        if (!equipmentEnum.getValue().equals("")) {

            try {
                //生产实例
                equipment = (Equipment) Class.forName(equipmentEnum.getValue()).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return equipment;
    }


}
