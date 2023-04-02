package com.tarrasques.blog.commons.domain.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * (UserInfo)实体类
 *
 * @author makejava
 * @since 2023-02-28 15:32:37
 */
@Data
@ToString
@EqualsAndHashCode
public class UserInfoVO implements Serializable {
    private static final long serialVersionUID = -43410321953184155L;

    /**
     * ID
     */
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
    /**
     *  权限路径
     */
    private List<String> rolePath;
}

