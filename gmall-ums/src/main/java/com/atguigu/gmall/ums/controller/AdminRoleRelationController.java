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

import com.atguigu.gmall.ums.entity.AdminRoleRelationEntity;
import com.atguigu.gmall.ums.service.AdminRoleRelationService;




/**
 * 后台用户和角色关系表
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@Api(tags = "后台用户和角色关系表 管理")
@RestController
@RequestMapping("ums/adminrolerelation")
public class AdminRoleRelationController {
    @Autowired
    private AdminRoleRelationService adminRoleRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('ums:adminrolerelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = adminRoleRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('ums:adminrolerelation:info')")
    public Resp<AdminRoleRelationEntity> info(@PathVariable("id") Long id){
		AdminRoleRelationEntity adminRoleRelation = adminRoleRelationService.getById(id);

        return Resp.ok(adminRoleRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('ums:adminrolerelation:save')")
    public Resp<Object> save(@RequestBody AdminRoleRelationEntity adminRoleRelation){
		adminRoleRelationService.save(adminRoleRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('ums:adminrolerelation:update')")
    public Resp<Object> update(@RequestBody AdminRoleRelationEntity adminRoleRelation){
		adminRoleRelationService.updateById(adminRoleRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('ums:adminrolerelation:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		adminRoleRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
