package me.wuwenbin.modules.validate.checker.integer;

import me.wuwenbin.modules.validate.checker.SystemChecker;
import me.wuwenbin.modules.validate.exception.ValidateException;

/**
 * 整数型 枚举值验证器
 * <p>
 * created by Wuwenbin on 2018/6/5 at 13:10
 *
 * @author wuwenbin
 */
public class IntegerChecker extends SystemChecker<Object, int[]> {

    @Override
    public boolean check(Object actual, int[] expected) throws ValidateException {
//        if (IntegerCheckerUtils.isInteger()) {
//            return Arrays.stream(expected).anyMatch(e -> actual == e);
//        }
        return false;
    }


}
