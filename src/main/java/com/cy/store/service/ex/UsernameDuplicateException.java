package com.cy.store.service.ex;

/**
 * @description:
 * @author: SSG
 * @time: 2022/7/6  17:17
 */
/** 用户名重复的异常 */
public class UsernameDuplicateException extends ServiceException{
    public UsernameDuplicateException() {
        super();
    }

    public UsernameDuplicateException(String message) {
        super(message);
    }

    public UsernameDuplicateException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameDuplicateException(Throwable cause) {
        super(cause);
    }

    protected UsernameDuplicateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
