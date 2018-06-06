package me.wuwenbin.modules.validate.constant;

/**
 * 验证策略
 * <p>
 * created by Wuwenbin on 2018/6/6 at 10:41
 */
public enum ValidationStrategy {

    /**
     * 全部验证通过才算能通过
     */
    ALL_SUCCESS,

    /**
     * 只要有一个验证通过即可
     */
    ANY_SUCCESS,


}
