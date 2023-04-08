package org.sky.fly.controller;

import org.sky.fly.model.system.SysRole;
import org.sky.fly.result.Result;
import org.sky.fly.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/system/sysRole")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;

    @GetMapping("/")
    public Result<List<SysRole>> getRoleList() {
        List<SysRole> roleList = sysRoleService.list();
        return Result.ok(roleList);
    }
}
