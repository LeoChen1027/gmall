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

import com.atguigu.gmall.ums.entity.RoleEntity;
import com.atguigu.gmall.ums.service.RoleService;




/**
 * 后台用户角色表
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@Api(tags = "后台用户角色表 管理")
@RestController
@RequestMapping("ums/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('ums:role:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = roleService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('ums:role:info')")
    public Resp<RoleEntity> info(@PathVariable("id") Long id){
		RoleEntity role = roleService.getById(id);

        return Resp.ok(role);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('ums:role:save')")
    public Resp<Object> save(@RequestBody RoleEntity role){
		roleService.save(role);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('ums:role:update')")
    public Resp<Object> update(@RequestBody RoleEntity role){
		roleService.updateById(role);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('ums:role:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		roleService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
