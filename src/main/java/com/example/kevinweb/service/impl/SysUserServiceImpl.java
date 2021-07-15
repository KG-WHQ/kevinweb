package com.example.kevinweb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.kevinweb.mapper.SysUserMapper;
import com.example.kevinweb.entity.SysUser;
import com.example.kevinweb.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * (SysUser)表服务实现类
 *
 * @author makejava
 * @since 2021-05-17 16:37:22
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public SysUser findByUsername(String username) {
        SysUser sysUser = new SysUser();

        return sysUser;
    }
}
