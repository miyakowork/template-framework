package me.wuwenbin.modules.validate;

import me.wuwenbin.modules.validate.annotation.RuleBean;
import me.wuwenbin.modules.validate.annotation.RuleItem;
import me.wuwenbin.modules.validate.checker.integer.IntegerEnumChecker;
import me.wuwenbin.modules.validate.constant.ValidationStrategy;
import me.wuwenbin.modules.validate.exception.RuleBeanNotFoundException;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * 入口类方法
 * created by Wuwenbin on 2018/6/6 at 10:34
 */
public class TemplateValidator {

    /**
     * 验证方法
     *
     * @param validateBean 需要验证的实体
     * @param groupId      验证实体的验证组唯一编号
     * @param strategy     验证策略
     * @return 验证器的验证结果
     */
    public static void validate(Object validateBean, String groupId, ValidationStrategy strategy) {
        if (!validateBean.getClass().isAnnotationPresent(RuleBean.class)) {
            throw new RuleBeanNotFoundException("Bean : [" + validateBean.getClass().getCanonicalName() + "]上未找到 [RuleBean] 注解");
        } else {
            Field[] fields = validateBean.getClass().getDeclaredFields();
            Arrays.stream(fields).forEach(
                    field -> {
                        RuleItem[] ruleItems = field.getAnnotationsByType(RuleItem.class);
                        Arrays.stream(ruleItems)
                                .filter(ruleItem -> Arrays.stream(ruleItem.groupId()).anyMatch(gId -> gId.equals(groupId)))
                                .forEach(ruleItem -> {
                                    IntegerEnumChecker checker = ruleItem.ruleType().getChecker();
                                    field.setAccessible(true);
                                    Object actual = null;
                                    try {
                                        actual = field.get(validateBean);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                    }
                                    String[] strings = ruleItem.ruleValue().split(",");
                                    int[] expected = Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();
                                    boolean s = checker.check(actual, expected);
                                    System.out.println(!s ? ruleItem.errorMsg() : "验证通过！");
                                });
                    }
            );

        }
    }
}
