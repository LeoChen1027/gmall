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

import com.atguigu.gmall.ums.entity.MemberTaskEntity;
import com.atguigu.gmall.ums.service.MemberTaskService;




/**
 * 会员任务表
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@Api(tags = "会员任务表 管理")
@RestController
@RequestMapping("ums/membertask")
public class MemberTaskController {
    @Autowired
    private MemberTaskService memberTaskService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('ums:membertask:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = memberTaskService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('ums:membertask:info')")
    public Resp<MemberTaskEntity> info(@PathVariable("id") Long id){
		MemberTaskEntity memberTask = memberTaskService.getById(id);

        return Resp.ok(memberTask);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('ums:membertask:save')")
    public Resp<Object> save(@RequestBody MemberTaskEntity memberTask){
		memberTaskService.save(memberTask);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('ums:membertask:update')")
    public Resp<Object> update(@RequestBody MemberTaskEntity memberTask){
		memberTaskService.updateById(memberTask);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('ums:membertask:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		memberTaskService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
