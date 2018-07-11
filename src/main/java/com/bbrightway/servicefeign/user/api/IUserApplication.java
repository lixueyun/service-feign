package com.bbrightway.servicefeign.user.api;

import com.bbrightway.servicefeign.hystrix.UserHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "user-service", fallback = UserHystrix.class)
public interface IUserApplication {
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    String getUserList();
}
