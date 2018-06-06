package me.wuwenbin.modules.validate.test;

import me.wuwenbin.modules.validate.annotation.RuleItem;
import me.wuwenbin.modules.validate.checker.integer.IntegerEnumChecker;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * created by Wuwenbin on 2018/6/5 at 14:28
 */
public class TestBean {

    private Bean bean;

    @Before
    public void before() {
        bean = new Bean();
        bean.setNoId("5");
    }

    @Test
    public void test() throws IllegalAccessException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            RuleItem ruleItem = field.getAnnotation(RuleItem.class);
            IntegerEnumChecker checker = ruleItem.ruleType().getChecker();
            field.setAccessible(true);
            Object actual = field.get(bean);
            String[] strings = ruleItem.ruleValue().split(",");
            int[] expected = Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();
            boolean s = checker.check(actual, expected);
            System.out.println(!s ? ruleItem.errorMsg() : "验证通过！");
        }
    }
}
