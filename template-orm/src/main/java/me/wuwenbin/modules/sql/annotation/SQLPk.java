package me.wuwenbin.modules.sql.annotation;

import me.wuwenbin.modules.sql.annotation.support.Condition;

import java.lang.annotation.*;

/**
 * @see SQLColumn
 * created by Wuwenbin on 2017/10/30 at 15:30
 */
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SQLColumn(pk = true)
public @interface SQLPk {

    /**
     * 该属性在数据库中表中对应的列名
     * 不定义该属性，则表明数据库中列名与属性字段相同或数据库中列名为下划线定义该属性则为对应的驼峰定义
     *
     * @return {@link String}
     */
    String value() default "";

    /**
     * 组装sql时的router条件标识，默认为int最小值
     *
     * @return 条件标识
     */
    int[] routers() default Integer.MIN_VALUE;

    /**
     * 默认的条件为 等于
     *
     * @return 约束条件
     */
    Condition condition() default Condition.EQ;

    /**
     * 此列是否需要被select至结果，默认是肯定的
     *
     * @return 是否能被 select
     */
    boolean select() default true;

    /**
     * 允许插入这一列
     *
     * @return 是否能被 insert
     */
    boolean insert() default true;

    /**
     * 允许更新这一列
     *
     * @return 是否能被 update
     */
    boolean update() default true;

}
