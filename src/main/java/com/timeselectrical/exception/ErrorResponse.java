package com.timeselectrical.exception;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-28 16:20
 * @Version 1.0
 **/
public class ErrorResponse {
    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public ErrorResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ErrorResponse setMessage(String message) {
        this.message = message;
        return this;
    }
}
