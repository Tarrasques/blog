package com.tarrasques.blog.gateway.service.impl;

import com.tarrasques.blog.commons.entity.UserInfo;
import com.tarrasques.blog.gateway.mapper.UserInfoMapper;
import com.tarrasques.blog.gateway.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (UserInfo)表服务实现类
 *
 * @author makejava
 * @since 2023-02-28 15:33:57
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoMapper userInfoMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserInfo queryById(String id) {
        return this.userInfoMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param userInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UserInfo insert(UserInfo userInfo) {
        this.userInfoMapper.insert(userInfo);
        return userInfo;
    }

    /**
     * 修改数据
     *
     * @param userInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UserInfo update(UserInfo userInfo) {
        this.userInfoMapper.update(userInfo);
        return this.queryById(userInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.userInfoMapper.deleteById(id) > 0;
    }
}
