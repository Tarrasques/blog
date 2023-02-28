package com.tarrasques.blog.commons.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (UserInfo)实体类
 *
 * @author makejava
 * @since 2023-02-28 15:32:37
 */
@Data
@ToString
@EqualsAndHashCode
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -43410321953184155L;

    private String id;
    /**
     * 账号
     */
    private String account;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户头像地址
     */
    private String avatarUrl;
    /**
     * 权限
     */
    private String roleCode;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 登录时间
     */
    private Date loginTime;


}

