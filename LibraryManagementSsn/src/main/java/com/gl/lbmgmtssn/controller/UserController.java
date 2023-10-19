package com.gl.lbmgmtssn.controller;

import com.gl.lbmgmtssn.entity.User;
import com.gl.lbmgmtssn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/save")
    public void saveUserDetails(@RequestBody User user){
        userService.save(user);
    }
}
