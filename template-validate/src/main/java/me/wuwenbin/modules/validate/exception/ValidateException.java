package me.wuwenbin.modules.validate.exception;

/**
 * created by Wuwenbin on 2018/6/5 at 13:05
 */
public class ValidateException extends RuntimeException {
    public ValidateException() {
        super();
    }

    public ValidateException(String message) {
        super(message);
    }
}
