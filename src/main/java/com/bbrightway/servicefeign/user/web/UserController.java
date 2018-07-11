package com.bbrightway.servicefeign.user.web;

import com.bbrightway.servicefeign.user.api.IUserApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName  UserController
 * @Description  TODO
 * @Date  2018/7/11 14:19
 * @author  lixueyun
 * @version  V1.0
 */
@RestController
public class UserController {

    @Autowired
    private IUserApplication userApplication;

    @RequestMapping(value = "/users")
    public String getUserList(){
        return userApplication.getUserList();
    }
}
