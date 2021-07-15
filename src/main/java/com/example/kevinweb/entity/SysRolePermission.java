package com.example.kevinweb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * (SysRolePermission)表实体类
 *
 * @author makejava
 * @since 2021-05-17 16:37:22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_role_permission")
public class SysRolePermission extends Model<SysRolePermission> {

    private String id;
    /**
     * 角色ID
     */
    private String rid;
    /**
     * 权限ID
     */
    private String pid;

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
