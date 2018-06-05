package me.wuwenbin.modules.validate.annotation;

import java.lang.annotation.*;

/**
 * 在类上定义此注解，表明为验证器的Bean
 * created by Wuwenbin on 2018/6/5 at 12:49
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RuleBean {

    /**
     * 概括的错误信息，不体现bean中哪个错误
     *
     * @return 错误信息
     */
    String value() default "";
}
