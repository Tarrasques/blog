package com.tarrasques.blog.gateway.service;

import com.tarrasques.blog.commons.entity.UserInfo;

/**
 * (UserInfo)表服务接口
 *
 * @author makejava
 * @since 2023-02-28 15:33:57
 */
public interface UserInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserInfo queryById(String id);

    /**
     * 新增数据
     *
     * @param userInfo 实例对象
     * @return 实例对象
     */
    void insert(UserInfo userInfo);

    /**
     * 修改数据
     *
     * @param userInfo 实例对象
     * @return 实例对象
     */
    void update(UserInfo userInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    void deleteById(String id);

}
