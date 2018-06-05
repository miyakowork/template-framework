package me.wuwenbin.modules.validate.checker;

import me.wuwenbin.modules.validate.constant.CheckerType;
import me.wuwenbin.modules.validate.exception.ValidateException;

/**
 * 系统默认提供的验证器父抽象类
 * created by Wuwenbin on 2018/6/5 at 13:09
 *
 * @author wuwenbin
 */
public abstract class SystemChecker<Actual, Expected> implements Checker<Actual, Expected> {

    @Override
    public boolean check(Actual actual, Expected expected) throws ValidateException {
        return false;
    }

    @Override
    public CheckerType checkerType() {
        return CheckerType.SYSTEM;
    }
}
