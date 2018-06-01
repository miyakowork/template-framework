package me.wuwenbin.modules.sql.annotation;

import java.lang.annotation.*;

/**
 * 该注解定义在表对应的类上
 * 默认类不写该注解，则标明是指反射到本身类中的字段（同等于@MappedSuper(value=false)）
 * 写上该注解，根据value值判断是不是需要反射父类字段属性
 * created by Wuwenbin on 2017/10/27 at 10:51
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MappedSuper {

    /**
     * 默认反射父类的字段
     *
     * @return 是否需要反射父类的字段
     */
    boolean value() default true;
}
