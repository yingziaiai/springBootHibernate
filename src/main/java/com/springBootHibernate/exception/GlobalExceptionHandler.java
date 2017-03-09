package com.springBootHibernate.exception;

import com.springBootHibernate.Error.RestApiResult;
import com.springBootHibernate.Error.ResultCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by fionalyn.ping.fu on 2/26/2017.
 */
@RestController
@ControllerAdvice
public class GlobalExceptionHandler {
//    private Logger logger = LoggerFactory.getLogger("GlobalExceptionHandler");

    @ExceptionHandler(value = BaseException.class)
    @ResponseBody
    public Object baseErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        return new RestApiResult(ResultCode.EXCEPTION,"失败！", e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        return new RestApiResult(ResultCode.EXCEPTION,"失败！", e.getMessage());
    }
}
