package me.wuwenbin.modules.sql;

/**
 * 编写SQL语句的工具糖
 * created by Wuwenbin on 2018/5/22 at 17:20
 */
public class SQL {

    private String sql;

    public SQL() {
    }

    public SQL(String sql) {
        this.sql = sql;
    }

    public static SQL builder() {
        return new SQL();
    }

    public static SQL builder(String... partSqls) {
        if (partSqls == null || partSqls.length == 0) {
            throw new RuntimeException("SQL初始化不能为空字符串开头");
        } else {
            for (String partSql : partSqls) {

            }
            return new SQL();
        }
    }

    public String build() {
        return this.sql;
    }

}
