package com.example.kevinweb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.kevinweb.entity.SysUser;

/**
 * (SysUser)表服务接口
 *
 * @author makejava
 * @since 2021-05-17 16:37:22
 */
public interface SysUserService extends IService<SysUser> {

    public SysUser findByUsername(String username);

}
