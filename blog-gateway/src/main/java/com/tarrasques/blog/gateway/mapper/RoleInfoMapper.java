package com.tarrasques.blog.gateway.mapper;


import com.tarrasques.blog.commons.entity.RoleInfo;

/**
 * (RoleInfo)表数据库访问层
 *
 * @author makejava
 * @since 2023-02-28 15:56:19
 */
public interface RoleInfoMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RoleInfo queryById(String id);

    /**
     * 新增数据
     *
     * @param roleInfo 实例对象
     * @return 影响行数
     */
    int insert(RoleInfo roleInfo);

    /**
     * 修改数据
     *
     * @param roleInfo 实例对象
     * @return 影响行数
     */
    int update(RoleInfo roleInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}
