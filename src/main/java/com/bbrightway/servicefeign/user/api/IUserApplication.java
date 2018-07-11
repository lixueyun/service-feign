package com.bbrightway.servicefeign.user.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "user-service")
public interface IUserApplication {

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    String getUserList();
}
