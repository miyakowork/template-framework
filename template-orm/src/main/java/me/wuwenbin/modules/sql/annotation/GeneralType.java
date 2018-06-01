package me.wuwenbin.modules.sql.annotation;

import me.wuwenbin.modules.sql.annotation.support.PkGenType;

import java.lang.annotation.*;

/**
 * 该注解定义在数据库表对应类的主键对应类的属性字段上
 * created by Wuwenbin on 2017/10/30 at 15:00
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface GeneralType {

    /**
     * 默认主键为数据库的自增长
     *
     * @return 主键字段的自增还是非自增
     */
    PkGenType value() default PkGenType.AUTO;
}
