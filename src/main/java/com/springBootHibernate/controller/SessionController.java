package com.springBootHibernate.controller;

import com.springBootHibernate.Error.RestApiResult;
import com.springBootHibernate.domain.SessionDomain;
import com.springBootHibernate.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fionalyn.ping.fu on 2/24/2017.
 */
@RestController
public class SessionController {
    //produces="application/json;charset=utf-8"
//    produces="text/html;charset=utf-8"
    @RequestMapping(value = "mlc/memberID/SSOSession", produces="application/json;charset=utf-8")
    public String jsonRequest(@RequestBody SessionDomain sessionDomain){
        return "通过JSON解析得到的token:" + sessionDomain.getToken();
    }



    @RequestMapping(value = "mlc/{memberID}/SSOSession/JSON")
    public SessionDomain jsonReturned(@RequestBody SessionDomain sessionDomain, @PathVariable String memberID){
        return sessionDomain;
    }


}
