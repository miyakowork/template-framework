package me.wuwenbin.modules.validate.checker.integer;

import me.wuwenbin.modules.validate.checker.SystemChecker;
import me.wuwenbin.modules.validate.exception.ValidateException;
import me.wuwenbin.modules.validate.support.Interval;

/**
 * 整数型区间范围验证器
 * 可使用数学中的闭区间和开区间的写法
 * created by Wuwenbin on 2018/6/5 at 13:10
 *
 * @author wuwenbin
 */
public class IntegerIntervalChecker extends SystemChecker<Object, Interval<Integer>> {

    @Override
    public boolean check(Object actual, Interval<Integer> expected) throws ValidateException {

        return false;
    }


}
