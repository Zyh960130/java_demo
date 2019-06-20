package com.zhangyuhang.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //    @Resource
//    UserService userService;
    @RequestMapping("/login")
    public String Test() {
//        User user = new User();
//        user.setUsername("zhangyuhang");
//        List<User> userList = userService.findByUsername(user);
//        return "userList";
        return "0";
    }

}
