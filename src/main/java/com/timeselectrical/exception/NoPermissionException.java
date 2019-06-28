package com.timeselectrical.exception;

/**
 * @Description 自定义异常类
 * @Author longjianyong
 * @Date 2019-06-28 16:14
 * @Version 1.0
 **/

public class NoPermissionException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NoPermissionException(String msg) {
        super(msg);
    }
}
