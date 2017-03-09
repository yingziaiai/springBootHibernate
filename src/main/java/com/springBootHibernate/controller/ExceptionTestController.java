package com.springBootHibernate.controller;

import com.springBootHibernate.exception.BaseException;
import com.springBootHibernate.exception.MyException1;
import com.springBootHibernate.exception.MyException2;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by fionalyn.ping.fu on 2/26/2017.
 */
@RestController
public class ExceptionTestController {

    @RequestMapping("/testex1")
    public Object throwBaseException() throws BaseException {
        throw new BaseException("test exception1");
    }

    @RequestMapping("/testex2")
    public Object throwMyException1() throws Exception {
        throw new MyException1("test MyException2.");
    }

    @RequestMapping("/testex3")
    public Object throwMyException2() throws Exception {
        throw new MyException2("test MyException3.");
    }

    @RequestMapping("/testex4")
    public Object throwIOException() throws Exception {
        throw new IOException("test IOException4.");
    }

    @RequestMapping("/testex5")
    public Object throwNullPointerException() throws Exception {
        throw new NullPointerException("Test NullPointerException.");
    }

    @ExceptionHandler(NullPointerException.class)
    public String controllerExceptionHandler(HttpServletRequest req, Exception e) {
         return e.getMessage();
    }
}
