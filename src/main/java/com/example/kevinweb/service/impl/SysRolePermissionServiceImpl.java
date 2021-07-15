package com.example.kevinweb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.kevinweb.mapper.SysRolePermissionMapper;
import com.example.kevinweb.entity.SysRolePermission;
import com.example.kevinweb.service.SysRolePermissionService;
import org.springframework.stereotype.Service;

/**
 * (SysRolePermission)表服务实现类
 *
 * @author makejava
 * @since 2021-05-17 16:37:22
 */
@Service("sysRolePermissionService")
public class SysRolePermissionServiceImpl extends ServiceImpl<SysRolePermissionMapper, SysRolePermission> implements SysRolePermissionService {

}
