package com.suns.generator.service.impl;

import com.suns.generator.domain.User;
import com.suns.generator.mapper.UserMapper;
import com.suns.generator.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 见贤不思齐
 * @time 2018/11/7.
 * @desc
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 查询用户信息
     *
     * @param user 用户参数
     * @return 用户信息列表
     */
    @Override
    public List<User> findUser(User user) {
        return userMapper.select(user);
    }
}
