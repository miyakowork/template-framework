package me.wuwenbin.modules.sql.test.bean;

import lombok.Getter;
import lombok.Setter;
import me.wuwenbin.modules.sql.annotation.SQLColumn;

import java.time.LocalDateTime;

import static me.wuwenbin.modules.sql.constant.Router.E;

/**
 * created by Wuwenbin on 2018/6/1 at 13:47
 */
@Getter
@Setter
public class TestSuper {

    @SQLColumn(routers = E)
    private Boolean enable;
    private LocalDateTime createTime;
}
