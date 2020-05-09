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

import com.atguigu.gmall.ums.entity.AdminEntity;
import com.atguigu.gmall.ums.service.AdminService;




/**
 * 后台用户表
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@Api(tags = "后台用户表 管理")
@RestController
@RequestMapping("ums/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('ums:admin:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = adminService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('ums:admin:info')")
    public Resp<AdminEntity> info(@PathVariable("id") Long id){
		AdminEntity admin = adminService.getById(id);

        return Resp.ok(admin);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('ums:admin:save')")
    public Resp<Object> save(@RequestBody AdminEntity admin){
		adminService.save(admin);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('ums:admin:update')")
    public Resp<Object> update(@RequestBody AdminEntity admin){
		adminService.updateById(admin);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('ums:admin:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		adminService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
