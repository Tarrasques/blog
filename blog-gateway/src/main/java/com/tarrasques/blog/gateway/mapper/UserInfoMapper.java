package com.tarrasques.blog.gateway.mapper;


import com.tarrasques.blog.commons.entity.UserInfo;

/**
 * (UserInfo)表数据库访问层
 *
 * @author makejava
 * @since 2023-02-28 16:01:13
 */
public interface UserInfoMapper {

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
     * @return 影响行数
     */
    int insert(UserInfo userInfo);

    /**
     * 修改数据
     *
     * @param userInfo 实例对象
     * @return 影响行数
     */
    int update(UserInfo userInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}
