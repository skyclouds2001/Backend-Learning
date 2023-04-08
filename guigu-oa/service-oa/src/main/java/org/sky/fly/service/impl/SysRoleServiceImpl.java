package org.sky.fly.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.sky.fly.mapper.SysRoleMapper;
import org.sky.fly.model.system.SysRole;
import org.sky.fly.service.SysRoleService;
import org.springframework.stereotype.Service;

@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
}
