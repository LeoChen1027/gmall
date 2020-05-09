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

import com.atguigu.gmall.ums.entity.AdminPermissionRelationEntity;
import com.atguigu.gmall.ums.service.AdminPermissionRelationService;




/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@Api(tags = "后台用户和权限关系表(除角色中定义的权限以外的加减权限) 管理")
@RestController
@RequestMapping("ums/adminpermissionrelation")
public class AdminPermissionRelationController {
    @Autowired
    private AdminPermissionRelationService adminPermissionRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('ums:adminpermissionrelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = adminPermissionRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('ums:adminpermissionrelation:info')")
    public Resp<AdminPermissionRelationEntity> info(@PathVariable("id") Long id){
		AdminPermissionRelationEntity adminPermissionRelation = adminPermissionRelationService.getById(id);

        return Resp.ok(adminPermissionRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('ums:adminpermissionrelation:save')")
    public Resp<Object> save(@RequestBody AdminPermissionRelationEntity adminPermissionRelation){
		adminPermissionRelationService.save(adminPermissionRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('ums:adminpermissionrelation:update')")
    public Resp<Object> update(@RequestBody AdminPermissionRelationEntity adminPermissionRelation){
		adminPermissionRelationService.updateById(adminPermissionRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('ums:adminpermissionrelation:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		adminPermissionRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
