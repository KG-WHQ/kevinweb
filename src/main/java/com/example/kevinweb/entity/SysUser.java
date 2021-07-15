package com.example.kevinweb.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * (SysUser)表实体类
 *
 * @author makejava
 * @since 2021-05-17 16:37:22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    private String id;
    /**
    *用户昵称
    */
    private String nickname;
    /**
    *邮箱|登录帐号
    */
    private String email;
    /**
    *密码
    */
    private String pswd;
    /**
    *创建时间
    */
    private Date createTime;
    /**
    *最后登录时间
    */
    private Date lastLoginTime;
    /**
    *1:有效，0:禁止登录
    */
    private String status;

    private String createNameId;

    private Date lastUpdateTime;

    private String lastUpdateNameId;

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
