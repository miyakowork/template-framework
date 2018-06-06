package me.wuwenbin.modules.validate.execution;

/**
 * 验证器的执行器功能接口
 * created by Wuwenbin on 2018/6/6 at 10:27
 */
public interface Actuator<Actual, Expected> {

    Actual getActual();

    Expected getExpected();

}
