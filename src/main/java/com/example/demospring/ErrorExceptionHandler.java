package com.example.demospring;


import com.example.demospring.utils.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * web 和ajax 页面捕获异常
 */
@ControllerAdvice
public class ErrorExceptionHandler {

    @ExceptionHandler(value = Exception.class)
//    @ResponseBody
    public Object errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception {
        e.printStackTrace();
        if (isAjax(request)) {
            return new Result().errorExcetion(e.getLocalizedMessage());
        } else {
            ModelAndView mav = new ModelAndView();
            mav.addObject("exception", e);
            mav.addObject("url", request.getRequestURL());
            mav.setViewName("thymeleaf/errorss");//错误页面
            return mav;
        }

    }

    private boolean isAjax(HttpServletRequest request) {
        return (request.getHeader("X-Requested-With") != null && "XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString()));
    }
}
