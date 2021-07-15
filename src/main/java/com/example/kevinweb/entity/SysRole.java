package com.example.kevinweb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * (SysRole)表实体类
 *
 * @author makejava
 * @since 2021-05-17 16:37:21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_role")
public class SysRole extends Model<SysRole> {

    private String id;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 角色类型
     */
    private String type;

}
