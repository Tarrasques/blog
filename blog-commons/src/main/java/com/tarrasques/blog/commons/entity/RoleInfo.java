package com.tarrasques.blog.commons.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * (RoleInfo)实体类
 *
 * @author makejava
 * @since 2023-02-28 15:55:21
 */
@Data
@ToString
@EqualsAndHashCode
public class RoleInfo implements Serializable {
    private static final long serialVersionUID = 477901053148890518L;

    private String id;
    /**
     * 权限代码
     */
    private String roleCode;
    /**
     * 权限名称
     */
    private String roleName;


}

