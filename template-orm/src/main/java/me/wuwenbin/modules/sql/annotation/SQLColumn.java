package me.wuwenbin.modules.sql.annotation;

import me.wuwenbin.modules.sql.annotation.support.Condition;

import java.lang.annotation.*;

/**
 * 该注解定义在类中对应的属性字段上
 * <p>
 * created by Wuwenbin on 2017/10/30 at 15:30
 */
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface SQLColumn {

    /**
     * 默认该字段不为主键
     *
     * @return 返回该属性字段是否为主键
     */
    boolean pk() default false;

    /**
     * 该属性在数据库中表中对应的列名
     * 不定义该属性，则表明数据库中列名与属性字段相同或数据库中列名为下划线定义该属性则为对应的驼峰定义
     *
     * @return 列名
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
