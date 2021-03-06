package com.site.blog.config;

import com.site.blog.dto.Result;
import com.site.blog.util.ResultGenerator;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: FruitSales
 * @description: 全局异常统一处理类
 * @author: 南街
 * @create: 2019-01-17 10:24
 **/

@ControllerAdvice
public class ApplicationControllerExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handlerError(HttpServletRequest req, Exception e) {
        return ResultGenerator.genFailResult("出现异常错误,请及时查看后台日志！");
    }

}
