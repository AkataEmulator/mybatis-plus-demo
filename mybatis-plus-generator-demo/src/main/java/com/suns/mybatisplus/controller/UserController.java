package com.suns.mybatisplus.controller;


import com.suns.mybatisplus.entity.User;
import com.suns.mybatisplus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author suns
 * @since 2018-11-07
 */
@RestController
@RequestMapping("/userInfo")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/one")
    public User findOne(@RequestParam(value = "id") Long id) {
        return iUserService.getById(id);
    }

}
