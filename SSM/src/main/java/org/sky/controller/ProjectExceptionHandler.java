package org.sky.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionHandler {

    @ExceptionHandler(Exception.class)
    public void solveException(Exception e) {
        System.out.println(1);
        e.printStackTrace();
    }


}
