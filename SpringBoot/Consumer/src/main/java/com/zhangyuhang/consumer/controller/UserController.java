package com.zhangyuhang.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhangyuhang.InterfaceAndEntry.Entry.User;
import com.zhangyuhang.InterfaceAndEntry.Interface.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @创建人me
 * @创建时间 2019/3/7
 * @描述
 */
@RestController
public class UserController {

    @Reference
    private IUserService userService;

    @RequestMapping("/login")
    public String findbyusername() {
        User user = new User();
        user.setUsername("zhangyuhang");
        List<User> userList = userService.findByUsername();
        return "0";
    }
}
