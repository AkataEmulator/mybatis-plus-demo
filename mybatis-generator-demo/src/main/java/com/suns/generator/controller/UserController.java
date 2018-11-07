package com.suns.generator.controller;

import com.suns.generator.domain.User;
import com.suns.generator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 见贤不思齐
 * @time 2018/11/7.
 * @desc
 */
@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    /**
     * 查询用户信息
     *
     * @param user 用户参数
     * @return 用户信息列表
     */
    @PostMapping(value = "/user")
    public List<User> findUser(User user) {
        return userService.findUser(user);
    }
}
