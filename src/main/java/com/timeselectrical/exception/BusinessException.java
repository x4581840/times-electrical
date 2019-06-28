package com.timeselectrical.exception;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-28 16:15
 * @Version 1.0
 **/
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 2L;

    public BusinessException(String msg) {
        super(msg);
    }

}
