package com.hly.designPatterns.abstractFactoryPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/11
 */
public enum EquipmentEnum {

    BlackComputer("com.hly.designPatterns.abstractFactoryPattern.BlackComputer"),
    WhiteKeyBoard("com.hly.designPatterns.abstractFactoryPattern.WhiteKeyBoard"),
    WhiteComputer("com.hly.designPatterns.abstractFactoryPattern.WhiteComputer");


    private String values ="";

    EquipmentEnum(String values) {
        this.values = values;
    }

    //获得枚举类型中一个元素的值
    public String getValue(){
        return this.values;
    }
}
