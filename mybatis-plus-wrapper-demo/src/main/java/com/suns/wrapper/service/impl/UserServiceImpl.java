package com.suns.wrapper.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suns.wrapper.entity.User;
import com.suns.wrapper.mapper.UserMapper;
import com.suns.wrapper.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author suns
 * @since 2018-11-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    /**
     * 查询用户信息（含分页）
     *
     * @param user     查询条件
     * @param pageNum  页码
     * @param pageSize 每页数量
     * @return 含分页的用户信息
     */
    @Override
    public IPage<User> findWithPagination(User user, int pageNum, int pageSize) {
        //设置分页信息
        Page<User> userPage = new Page<>(pageNum, pageSize);
        //设置过滤条件
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        if (StringUtils.isNoneBlank(user.getName())) {
            wrapper.likeRight("name", user.getName());
        }
        return this.page(userPage, wrapper);
    }

    /**
     * 修改用户信息
     *
     * @param user 修改后的用户信息
     * @return 修改成功的信息
     */
    @Override
    public String updateUser(User user) {
        //构造修改条件
        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.eq("id", user.getId());
        boolean flag = this.update(User.builder()
                        .name(user.getName())
                        .age(user.getAge())
                        .email(user.getEmail())
                        .build(),
                wrapper);
        return flag ? "修改成功" : "修改失败";
    }

}
