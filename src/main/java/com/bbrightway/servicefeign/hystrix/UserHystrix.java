package com.bbrightway.servicefeign.hystrix;

import com.bbrightway.servicefeign.user.api.IUserApplication;
import org.springframework.stereotype.Component;

/**
 * @ClassName  UserHystrix
 * @Description  TODO
 * @Date  2018/7/11 16:43
 * @author  lixueyun
 * @version  V1.0
 */
@Component
public class UserHystrix implements IUserApplication {

    @Override
    public String getUserList() {
        return "error page！";
    }
}
