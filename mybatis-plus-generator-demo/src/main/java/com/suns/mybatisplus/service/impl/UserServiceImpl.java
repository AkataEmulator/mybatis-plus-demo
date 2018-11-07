package com.suns.mybatisplus.service.impl;

import com.suns.mybatisplus.entity.User;
import com.suns.mybatisplus.mapper.UserMapper;
import com.suns.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author suns
 * @since 2018-11-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
