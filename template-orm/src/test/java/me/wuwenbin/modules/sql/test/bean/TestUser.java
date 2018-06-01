package me.wuwenbin.modules.sql.test.bean;

import lombok.Getter;
import lombok.Setter;
import me.wuwenbin.modules.sql.annotation.MappedSuper;
import me.wuwenbin.modules.sql.annotation.SQLColumn;
import me.wuwenbin.modules.sql.annotation.SQLPk;
import me.wuwenbin.modules.sql.annotation.SQLTable;

import java.time.LocalDateTime;

import static me.wuwenbin.modules.sql.constant.Router.*;

/**
 * 假如有这么一个表
 * CREATE TABLE `t_system_user_info` (
 * `id` int(11) NOT NULL AUTO_INCREMENT,
 * `username` varchar(50) NOT NULL,
 * `user_type` varchar(2) DEFAULT NULL,
 * `password` varchar(50) NOT NULL,
 * `last_login_date` datetime DEFAULT NULL,
 * `pyName` varchar(50) DEFAULT '',
 * `enable` tinyint(1) DEFAULT  1,
 * `create_time`  datetime,
 * PRIMARY KEY (`id`)
 * )
 * 那么我在Java中应该有这么一个类对应着
 * created by Wuwenbin on 2018/6/1 at 11:56
 */
@Getter
@Setter
@SQLTable("t_user")
@MappedSuper
public class TestUser extends TestSuper {

    @SQLPk(routers = C)
    private Long id;
    @SQLColumn(routers = A)
    private String username;
    @SQLColumn(routers = D)
    private String userType;
    private String password;
    @SQLColumn(routers = A)
    private LocalDateTime lastLoginDate;
    /**
     * 此处如果不标明pyName，那么生成SQL的时候字段就会是py_name,但是数据库是ptName
     */
    @SQLColumn(value = "pyName", routers = B)
    private String pyName;
}
