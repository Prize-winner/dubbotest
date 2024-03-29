package cn.itcast.dubboxdemo.controller;

import cn.itcast.dubbodemo.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 宁三水
 * @version 1.0
 * @descript cn.itcast.dubboxdemo.controller
 * @date 2019/6/12
 */

@Controller
@RequestMapping("/user")

public class UserController {

    @Reference
    private UserService userService;


    @RequestMapping("/showName")
    @ResponseBody
    public String showName(){
        return userService.getName();
    }

}
