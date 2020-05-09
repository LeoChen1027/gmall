package com.atguigu.gmall.ums.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.atguigu.gmall.ums.entity.PermissionEntity;
import com.atguigu.gmall.ums.service.PermissionService;




/**
 * 后台用户权限表
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@Api(tags = "后台用户权限表 管理")
@RestController
@RequestMapping("ums/permission")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('ums:permission:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = permissionService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('ums:permission:info')")
    public Resp<PermissionEntity> info(@PathVariable("id") Long id){
		PermissionEntity permission = permissionService.getById(id);

        return Resp.ok(permission);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('ums:permission:save')")
    public Resp<Object> save(@RequestBody PermissionEntity permission){
		permissionService.save(permission);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('ums:permission:update')")
    public Resp<Object> update(@RequestBody PermissionEntity permission){
		permissionService.updateById(permission);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('ums:permission:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		permissionService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
