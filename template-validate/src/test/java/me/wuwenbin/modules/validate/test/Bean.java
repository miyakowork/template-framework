package me.wuwenbin.modules.validate.test;

import me.wuwenbin.modules.validate.annotation.RuleBean;
import me.wuwenbin.modules.validate.annotation.RuleItem;
import me.wuwenbin.modules.validate.constant.RuleType;

/**
 * created by Wuwenbin on 2018/6/5 at 12:48
 */
@RuleBean("s")
public class Bean {

    @RuleItem(ruleType = RuleType.IntEnum, ruleValue = "1,2,3", errorMsg = "noId填写不规范，请重新填写！")
//    @RuleItem(ruleType = RuleType.IntEnum, ruleValue = "5,6", errorMsg = "a")
    private String noId;

    public String getNoId() {
        return noId;
    }

    public void setNoId(String noId) {
        this.noId = noId;
    }


}
