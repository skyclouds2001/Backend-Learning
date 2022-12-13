package org.sky.controller;

import org.sky.exception.BusinessException;
import org.sky.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionHandler {

    @ExceptionHandler(Exception.class)
    public RequestResult solveException(Exception e) {
        return new RequestResult(RequestCode.FAILURE, e.getMessage(), false, null);
    }

    @ExceptionHandler(SystemException.class)
    public RequestResult solveSystemException(SystemException e) {
        return new RequestResult(e.getCode(), e.getMessage(), false, null);
    }

    @ExceptionHandler(BusinessException.class)
    public RequestResult solveBusinessException(BusinessException e) {
        return new RequestResult(e.getCode(), e.getMessage(), false, null);
    }


}
