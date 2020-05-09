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

import com.atguigu.gmall.ums.entity.RolePermissionRelationEntity;
import com.atguigu.gmall.ums.service.RolePermissionRelationService;




/**
 * 后台用户角色和权限关系表
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@Api(tags = "后台用户角色和权限关系表 管理")
@RestController
@RequestMapping("ums/rolepermissionrelation")
public class RolePermissionRelationController {
    @Autowired
    private RolePermissionRelationService rolePermissionRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('ums:rolepermissionrelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = rolePermissionRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('ums:rolepermissionrelation:info')")
    public Resp<RolePermissionRelationEntity> info(@PathVariable("id") Long id){
		RolePermissionRelationEntity rolePermissionRelation = rolePermissionRelationService.getById(id);

        return Resp.ok(rolePermissionRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('ums:rolepermissionrelation:save')")
    public Resp<Object> save(@RequestBody RolePermissionRelationEntity rolePermissionRelation){
		rolePermissionRelationService.save(rolePermissionRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('ums:rolepermissionrelation:update')")
    public Resp<Object> update(@RequestBody RolePermissionRelationEntity rolePermissionRelation){
		rolePermissionRelationService.updateById(rolePermissionRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('ums:rolepermissionrelation:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		rolePermissionRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
