package com.bj186.crm.controller;

import com.bj186.crm.exception.CustomException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//这个注解表示所有的异常都会被它捕获到
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler
    @ResponseBody
    public CustomException check(CustomException e) {
        System.out.println("异常被拦截了!");
        return e;
    }
}
