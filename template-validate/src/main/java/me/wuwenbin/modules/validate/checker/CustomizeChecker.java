package me.wuwenbin.modules.validate.checker;

import me.wuwenbin.modules.validate.constant.CheckerType;

/**
 * 开发者定义的验证器抽象父类，只需继承此类即可
 * created by Wuwenbin on 2018/6/5 at 14:16
 *
 * @author wuwenbin
 */
public abstract class CustomizeChecker<Actual, Expected> implements Checker<Actual, Expected> {

    @Override
    public CheckerType checkerType() {
        return CheckerType.CUSTOMIZE;
    }
}
