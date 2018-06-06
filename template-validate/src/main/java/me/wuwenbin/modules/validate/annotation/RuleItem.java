package me.wuwenbin.modules.validate.annotation;


import me.wuwenbin.modules.validate.constant.RuleType;

import java.lang.annotation.*;

/**
 * 在类上定义此注解，表明为验证器的Bean
 * created by Wuwenbin on 2018/6/5 at 12:49
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(RuleItems.class)
public @interface RuleItem {

    /**
     * 指明是哪个规则验证组
     *
     * @return 验证组的唯一id
     */
    String[] groupId() default {};

    /**
     * 是否必须填写此字段，默认是必须填写
     *
     * @return 是否需要填写此字段
     */
    boolean required() default true;

    /**
     * 验证器类
     *
     * @return 验证器种类
     */
    RuleType ruleType();

    /**
     * 当验证器的属性期待值不能使用下面的{@link #ruleValue()}来定义的时候
     * 我们可以使用此字段来开启使用其他方式（如：方法传递、方法返回值）注入期待值，配置此属性为{@code true}
     *
     * @return 期待值是否需要额外定义
     */
    boolean ruleValueSupplied() default false;


    /**
     * 验证器需要的参考值
     * eg：我一个整数型区间验证器，那么我需要一个参考值（约定值）来约束是在什么区间之内，这个值就是参考值，如：[2,3)，表示2<=x<3
     *
     * @return 验证器的参考值
     */
    String ruleValue();

    /**
     * 错误信息
     *
     * @return 错误信息
     */
    String errorMsg() default "";
}
