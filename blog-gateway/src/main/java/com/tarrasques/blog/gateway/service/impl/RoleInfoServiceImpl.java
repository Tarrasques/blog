package com.tarrasques.blog.gateway.service.impl;

import com.tarrasques.blog.commons.entity.RoleInfo;
import com.tarrasques.blog.gateway.mapper.RoleInfoMapper;
import com.tarrasques.blog.gateway.service.RoleInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (RoleInfo)表服务实现类
 *
 * @author makejava
 * @since 2023-02-28 15:56:19
 */
@Service
public class RoleInfoServiceImpl implements RoleInfoService {

    @Resource
    private RoleInfoMapper roleInfoMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RoleInfo queryById(String id) {
        return this.roleInfoMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param roleInfo 实例对象
     * @return 实例对象
     */
    @Override
    public RoleInfo insert(RoleInfo roleInfo) {
        this.roleInfoMapper.insert(roleInfo);
        return roleInfo;
    }

    /**
     * 修改数据
     *
     * @param roleInfo 实例对象
     * @return 实例对象
     */
    @Override
    public RoleInfo update(RoleInfo roleInfo) {
        this.roleInfoMapper.update(roleInfo);
        return this.queryById(roleInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.roleInfoMapper.deleteById(id) > 0;
    }
}
