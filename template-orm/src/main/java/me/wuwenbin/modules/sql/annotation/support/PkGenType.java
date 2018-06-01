package me.wuwenbin.modules.sql.annotation.support;

/**
 * 生成的SQL语句中会不会包含主键，使用此枚举变量定义在类的主键属性字段上标明即可
 * created by Wuwenbin on 2017/10/30 at 14:55
 *
 * @author Wuwenbin
 */
public enum PkGenType {


    /**
     * 数据库自增长
     */
    AUTO,

    /**
     * 非自增长，人为定义
     */
    DEFINITION
}
