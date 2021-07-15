package com.example.kevinweb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * (SysPermissionInit)表实体类
 *
 * @author makejava
 * @since 2021-05-17 16:37:21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_permission_init")
public class SysPermissionInit extends Model<SysPermissionInit> {

    private String id;
    /**
     * 链接地址
     */
    private String url;
    /**
     * 需要具备的权限
     */
    private String permissionInit;
    /**
     * 排序
     */
    private Integer sort;

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
