package com.itgone.ad.advice;

import com.itgone.ad.exception.AdException;
import com.itgone.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: earlman
 * @Description:
 * @Date:Create：in 2019-10-10 22:55
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(AdException.class)
    public CommonResponse<Void> handle1(HttpServletRequest req, AdException ex) {
        ex.printStackTrace();
        return CommonResponse.failure(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public CommonResponse<Void> handle2(HttpServletRequest req, Exception ex) {
        ex.printStackTrace();
        return CommonResponse.failure(ex.getMessage());
    }

}
