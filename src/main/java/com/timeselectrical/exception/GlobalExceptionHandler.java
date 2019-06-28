package com.timeselectrical.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description 全局异常捕获类
 * @Author longjianyong
 * @Date 2019-06-28 16:11
 * @Version 1.0
 **/

@RestControllerAdvice
public class GlobalExceptionHandler {

    private static Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    private static final String SYS_EXCEPTION_CODE = "000000";

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> processException(Exception exception, HttpServletRequest request, HttpServletResponse response){
        LOGGER.error("请求失败", exception);
        LOGGER.info("========上面是失败的信息========");
        ErrorResponse responseData = new ErrorResponse();
        ResponseEntity<ErrorResponse> responseEntity;
        String message = exception.getMessage();
        LOGGER.info("message::::::" + message);
        if (exception instanceof NoPermissionException) {
            responseData.setCode(message);
            responseData.setMessage(message);
            responseEntity = new ResponseEntity<>(responseData, HttpStatus.BAD_REQUEST);
        } else {
            responseData.setCode(SYS_EXCEPTION_CODE);
            if (!StringUtils.isEmpty(message)) {
                responseData.setMessage(message);
            } else {
                responseData.setMessage(exception.toString());
            }
            responseEntity = new ResponseEntity<>(responseData, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }
}
