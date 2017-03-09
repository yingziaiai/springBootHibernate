package com.springBootHibernate.controller;

//import com.springBootHibernate.Error.ErrorParamException;
//import com.springBootHibernate.Error.NotFoundException;
import com.springBootHibernate.Error.RestApiResult;
import com.springBootHibernate.Error.ResultCode;
import com.springBootHibernate.domain.SessionDomain;
import com.springBootHibernate.domain.User;
import com.springBootHibernate.domain.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * Created by fionalyn.ping.fu on 2/24/2017.
 */
@RestController
public class ErroTestController implements ErrorController {
    @Autowired
    UserDao userDao;

    private static final String ERROR_PATH = "/error";

    @RequestMapping(value=ERROR_PATH)
    public String handleError(){
        return "pages/404";
    }

//    @RequestMapping(value = "/testException/{id}", method = RequestMethod.GET)
//    public User getUser(@PathVariable("id") long id, Model model) {
//
//        User testExpUser = userDao.findById(id);
//        if (testExpUser == null) throw new NotFoundException();
//        if (Long.valueOf(id) == null) throw new ErrorParamException();
//        return testExpUser;
//    }


    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }



    @RequestMapping("{email}/{name}/create")
    public RestApiResult create(@PathVariable String email, @PathVariable String name) {
        User user = null;
        try {
            user = new User(email, name);
            userDao.save(user);
        }
        catch (Exception ex) {
//            return "Error creating the user: " + ex.toString();
            return new RestApiResult(ResultCode.EXCEPTION,"失败！", ex);
        }
//        return "User succesfully created! (id = " + user.getId() + ")";

        return new RestApiResult(ResultCode.SUCCESS,"成功！", null);
    }
}
