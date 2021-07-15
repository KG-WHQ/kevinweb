package com.example.kevinweb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.kevinweb.mapper.SysPermissionMapper;
import com.example.kevinweb.entity.SysPermission;
import com.example.kevinweb.service.SysPermissionService;
import org.springframework.stereotype.Service;

/**
 * (SysPermission)表服务实现类
 *
 * @author makejava
 * @since 2021-05-17 16:37:19
 */
@Service("sysPermissionService")
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission> implements SysPermissionService {

}
