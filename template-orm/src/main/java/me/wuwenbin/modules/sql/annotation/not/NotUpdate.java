package me.wuwenbin.modules.sql.annotation.not;

import java.lang.annotation.*;

/**
 * 标明改属性字段是不要更新的
 * *生成的SQL中不会包含此字段
 * created by Wuwenbin on 2017/10/6 at 10:06
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface NotUpdate {
}
