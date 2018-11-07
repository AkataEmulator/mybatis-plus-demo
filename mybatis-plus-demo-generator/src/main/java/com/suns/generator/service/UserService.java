package com.suns.generator.service;

import com.suns.generator.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 见贤不思齐
 * @time 2018/11/7.
 * @desc
 */
public interface UserService {
    /**
     * 查询用户信息
     *
     * @param user 用户参数
     * @return 用户信息列表
     */
    List<User> findUser(User user);
}
