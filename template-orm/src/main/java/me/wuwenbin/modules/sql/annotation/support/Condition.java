package me.wuwenbin.modules.sql.annotation.support;

/**
 * SQL语句的条件部分的约束
 * created by Wuwenbin on 2017/10/4 at 18:39
 *
 * @author wuwen
 */
public enum Condition {
    /**
     * 各种约束条件
     */
    EQ("="),
    LT("<"),
    GT(">"),
    LTE("<="),
    GTE(">="),
    NE("<>"),
    LIKE("LIKE"),
    NOT_LIKE("NOT LIKE");

    private String cnd;

    Condition(String cnd) {
        this.cnd = cnd;
    }

    public String getCnd() {
        return this.cnd;
    }

}
