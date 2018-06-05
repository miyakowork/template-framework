package me.wuwenbin.modules.validate.exception;

/**
 * 生成验证器出现错误
 * created by Wuwenbin on 2018/6/5 at 14:32
 */
public class GenerateCheckerException extends RuntimeException {
    public GenerateCheckerException() {
        super();
    }

    public GenerateCheckerException(String message) {
        super(message);
    }
}
