package com.hly.designPatterns.abstractFactoryPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/11
 */
public interface EquipmentFactory {

    public Equipment createBlackComputer();
    public Equipment createWhiteComputer();
    public Equipment createWhiteKeyBoard();

}
