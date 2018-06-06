package me.wuwenbin.modules.validate.constant;

import me.wuwenbin.modules.validate.checker.SystemChecker;
import me.wuwenbin.modules.validate.checker.integer.IntegerEnumChecker;
import me.wuwenbin.modules.validate.exception.GenerateCheckerException;

/**
 * 验证类型是什么，每种验证类型对应一个验证器Checker
 * eg: IntEnum-->IntegerEnumChecker
 * created by Wuwenbin on 2018/6/5 at 12:59
 *
 * @author wuwenbin
 */
public enum RuleType {

    /**
     * 各种验证类型及其对应的验证器
     */
    IntEnum(IntegerEnumChecker.class);

    private Class<? extends SystemChecker> checker;

    RuleType(Class<? extends SystemChecker> checker) {
        this.checker = checker;
    }

    public <T extends SystemChecker> T getChecker() {
        System.out.println(this.checker.getCanonicalName());
        try {
            //noinspection unchecked
            return (T) Class.forName(this.checker.getCanonicalName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            throw new GenerateCheckerException("生成 Checker：[" + this.checker.getCanonicalName() + "] 时出错");
        }
    }
}
