package me.wuwenbin.modules.validate.checker;

import me.wuwenbin.modules.validate.constant.CheckerType;
import me.wuwenbin.modules.validate.exception.ValidateException;

/**
 * 验证器接口
 * created by Wuwenbin on 2018/6/5 at 13:02
 *
 * @author wuwenbin
 */
public interface Checker<Actual, Expected> {

    /**
     * 验证的犯法
     *
     * @param actual   实际值
     * @param expected 期待值
     * @return 实际值和期待值是否一致
     * @throws ValidateException 验证过程中发生异常
     */
    boolean check(Actual actual, Expected expected) throws ValidateException;

    /**
     * 验证器的类型
     *
     * @return 验证器类型
     */
    CheckerType checkerType();
}
