package me.wuwenbin.modules.validate.support;

/**
 * 验证返回结果类型对象
 * created by Wuwenbin on 2018/6/6 at 10:35
 */
public class TemplateResult {

    private boolean success;
    private String simpleMessage;
    private String detailMessage;


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getSimpleMessage() {
        return simpleMessage;
    }

    public void setSimpleMessage(String simpleMessage) {
        this.simpleMessage = simpleMessage;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public void setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
    }
}
