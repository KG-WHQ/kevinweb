package com.example.kevinweb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.kevinweb.mapper.SysUserRoleMapper;
import com.example.kevinweb.entity.SysUserRole;
import com.example.kevinweb.service.SysUserRoleService;
import org.springframework.stereotype.Service;

/**
 * (SysUserRole)表服务实现类
 *
 * @author makejava
 * @since 2021-05-17 16:37:22
 */
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {

}
