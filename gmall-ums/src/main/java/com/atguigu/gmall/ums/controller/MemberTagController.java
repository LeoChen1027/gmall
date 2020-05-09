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

import com.atguigu.gmall.ums.entity.MemberTagEntity;
import com.atguigu.gmall.ums.service.MemberTagService;




/**
 * 用户标签表
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@Api(tags = "用户标签表 管理")
@RestController
@RequestMapping("ums/membertag")
public class MemberTagController {
    @Autowired
    private MemberTagService memberTagService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('ums:membertag:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = memberTagService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('ums:membertag:info')")
    public Resp<MemberTagEntity> info(@PathVariable("id") Long id){
		MemberTagEntity memberTag = memberTagService.getById(id);

        return Resp.ok(memberTag);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('ums:membertag:save')")
    public Resp<Object> save(@RequestBody MemberTagEntity memberTag){
		memberTagService.save(memberTag);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('ums:membertag:update')")
    public Resp<Object> update(@RequestBody MemberTagEntity memberTag){
		memberTagService.updateById(memberTag);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('ums:membertag:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		memberTagService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
