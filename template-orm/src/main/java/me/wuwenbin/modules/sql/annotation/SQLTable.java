package me.wuwenbin.modules.sql.annotation;

import java.lang.annotation.*;

/**
 * 该注解定义在数据库表对应的相关JAVA类上
 * Created by wuwenbin on 2016/10/11.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface SQLTable {

    /**
     * 定义数据库中对应的表的名字
     * 如不定义此属性，默认数据库表名 {@code t_}开头，且为类名的驼峰转下划线的定义（eg:PublicUser --> t_public_user）
     *
     * @return 表名
     */
    String value() default "";

}
