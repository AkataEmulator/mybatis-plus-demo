package com.suns.wrapper.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.suns.wrapper.entity.User;
import com.suns.wrapper.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    private final IUserService iUserService;

    @Autowired
    public UserController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @PostMapping("/pagination")
    public IPage<User> findWithPagination(@RequestBody User user,
                                          @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                          @RequestParam(value = "pageSize", defaultValue = "1") int pageSize) {
        return iUserService.findWithPagination(user, pageNum, pageSize);
    }

    @PatchMapping("/user")
    public String updateUser(User user) {
        return iUserService.updateUser(user);
    }

    @PatchMapping("/users")
    public boolean batchUpdate(@RequestBody List<User> users) {
        return iUserService.updateBatchById(users);
    }
}
