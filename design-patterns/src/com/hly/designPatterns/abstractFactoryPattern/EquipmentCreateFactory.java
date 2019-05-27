package com.hly.designPatterns.abstractFactoryPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/11
 */
public class EquipmentCreateFactory extends AbstractEquimentFactory {

    @Override
    public Equipment createBlackComputer() {
        return super.createEquiment(EquipmentEnum.BlackComputer);
    }

    @Override
    public Equipment createWhiteComputer() {
        return super.createEquiment(EquipmentEnum.WhiteComputer);
    }

    @Override
    public Equipment createWhiteKeyBoard() {
        return super.createEquiment(EquipmentEnum.WhiteKeyBoard);
    }
}
