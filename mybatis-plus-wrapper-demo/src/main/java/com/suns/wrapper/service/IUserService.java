package com.suns.wrapper.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suns.wrapper.entity.User;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author suns
 * @since 2018-11-07
 */
public interface IUserService extends IService<User> {

    /**
     * 查询用户信息（含分页）
     *
     * @param user     查询条件
     * @param pageNum  页码
     * @param pageSize 每页数量
     * @return 含分页的用户信息
     */
    IPage<User> findWithPagination(User user, int pageNum, int pageSize);

    /**
     * 修改用户信息
     *
     * @param user 修改后的用户信息
     * @return 修改成功的信息
     */
    String updateUser(User user);
}
