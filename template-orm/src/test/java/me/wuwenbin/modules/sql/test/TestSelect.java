package me.wuwenbin.modules.sql.test;

import me.wuwenbin.modules.sql.SQLGen;
import me.wuwenbin.modules.sql.factory.SQLBeanBuilder;
import me.wuwenbin.modules.sql.factory.SQLTextBuilder;
import me.wuwenbin.modules.sql.test.bean.TestUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static me.wuwenbin.modules.sql.constant.Router.*;
import static me.wuwenbin.modules.sql.support.Symbol.COLON;
import static me.wuwenbin.modules.sql.support.Symbol.QUESTION_MARK;

/**
 * created by Wuwenbin on 2018/6/1 at 13:51
 */
public class TestSelect {

    private SQLBeanBuilder sbb;
    private SQLTextBuilder stb;

    @Before
    public void setBuilder() {
        sbb = SQLGen.builder(TestUser.class);
        stb = SQLGen.builder();
    }

    /**
     * 查询所有字段
     */
    @Test
    public void selectAll() {
        String expected = "SELECT t_user.* FROM t_user";
        Assert.assertEquals(expected, sbb.selectAll());
        Assert.assertEquals(expected, stb.selectAll("t_user"));
    }

    /**
     * 查询部分字段
     */
    @Test
    public void selectPart() {
        //查询部分字段不带条件
        String expected1 = "SELECT t_user.username, t_user.last_login_date FROM t_user";
        Assert.assertEquals(expected1, sbb.selectPart(A));
        Assert.assertEquals(expected1, stb.selectPartByColumnsAnd("t_user", new String[]{"username", "last_login_date"}));

        //查询部分字段带主键条件，条件语句占位符为【?】
        String expected2 = "SELECT t_user.username, t_user.last_login_date, t_user.pyName FROM t_user WHERE t_user.id = ?";
        Assert.assertEquals(expected2, sbb.selectPartByPk(QUESTION_MARK, A, B));

        //查询部分字段带任意字段条件（依赖Bean查询），条件语句占位符为【:】
        String expected2_1 = "SELECT t_user.username, t_user.last_login_date, t_user.pyName FROM t_user WHERE 1=1 AND t_user.id = :id AND t_user.user_type = :userType";
        Assert.assertEquals(expected2_1, sbb.selectPartByRoutersAnd(COLON, new int[]{A, B}, C, D));

        //查询部分字段带任意字段条件（非Bean查询），条件语句占位符一定为【?】
        String expected3 = "SELECT t_user.username, t_user.last_login_date, t_user.pyName FROM t_user WHERE 1=1 AND t_user.id = ?";
        Assert.assertEquals(expected3, stb.selectPartByColumnsAnd("t_user", new String[]{"username", "last_login_date", "pyName"}, "id"));

        //查询所有字段带任意条件且有个字段为父类公共属性，条件语句占位符为【:】
        String expected4 = "SELECT t_user.* FROM t_user WHERE 1=1 AND t_user.user_type = ? AND t_user.enable = ?";
        Assert.assertEquals(expected4, sbb.selectAllByRoutersAnd(QUESTION_MARK, D, E));
    }
}
