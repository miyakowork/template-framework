package me.wuwenbin.modules.validate.checker.integer;

import me.wuwenbin.modules.validate.checker.SystemChecker;
import me.wuwenbin.modules.validate.exception.ValidateException;

import java.util.Arrays;

/**
 * created by Wuwenbin on 2018/6/5 at 13:10
 *
 * @author wuwenbin
 */
public class IntegerEnumChecker extends SystemChecker<Integer, int[]> {

    /**
     * 期望值数据是否需要使用方法来注入提供，即不能使用注解中的ruleValue参数来定义的
     * 默认是不需要
     */
    private boolean dataSupplied = false;
    private int[] expected;

    @Override
    public boolean check(Integer actual, int[] expected) throws ValidateException {
        return Arrays.stream(expected).anyMatch(e -> actual == e);
    }

}
