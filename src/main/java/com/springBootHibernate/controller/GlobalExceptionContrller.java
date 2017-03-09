package com.springBootHibernate.controller;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fionalyn.ping.fu on 2/26/2017.
 */
@RestController
@ControllerAdvice
public class GlobalExceptionContrller {
//    private Logger logger = LoggerFactory.getLogger("GlobalExceptionHandler");

//    @ExceptionHandler(value = BaseException.class)
//    public Object baseErrorHandler(HttpServletRequest req, Exception e) throws Exception {
//        return new SessionKeepAliveResponse(ResultCode.EXCEPTION,"common failture", e.getMessage());
//    }
//
//    @ExceptionHandler(value = Exception.class)
//    public Object defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
//        return new SessionKeepAliveResponse(ResultCode.EXCEPTION,ResultCode.EXCEPTION.msg(), e.getMessage());
//    }

//    @ExceptionHandler(value=MethodArgumentNotValidException.class)
//    public Object MethodArgumentNotValidHandler(HttpServletRequest req,
//                                                MethodArgumentNotValidException exception) throws Exception
//    {
//        //按需重新封装需要返回的错误信息
//        List<> invalidArguments = new ArrayList<>();
//        //解析原错误信息，封装后返回，此处返回非法的字段名称，原始值，错误信息
//        for (FieldError error : exception.getBindingResult().getFieldErrors()) {
//            SessionKeepAliveResponse invalidArgument = new SessionKeepAliveResponse();
//            invalidArgument.setCode(error.getDefaultMessage());
//            invalidArgument.setMessage(error.getField());
//            invalidArgument.setData(error.getRejectedValue());
//            invalidArguments.add(invalidArgument);
//        }
//
//        ResultMsg resultMsg = new ResultMsg(ResultStatusCode.PARAMETER_ERROR.getErrcode(), ResultStatusCode.PARAMETER_ERROR.getErrmsg(), invalidArguments);
//        return resultMsg;
//    }

}
