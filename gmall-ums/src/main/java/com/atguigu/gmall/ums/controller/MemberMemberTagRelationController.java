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

import com.atguigu.gmall.ums.entity.MemberMemberTagRelationEntity;
import com.atguigu.gmall.ums.service.MemberMemberTagRelationService;




/**
 * 用户和标签关系表
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@Api(tags = "用户和标签关系表 管理")
@RestController
@RequestMapping("ums/membermembertagrelation")
public class MemberMemberTagRelationController {
    @Autowired
    private MemberMemberTagRelationService memberMemberTagRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('ums:membermembertagrelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = memberMemberTagRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('ums:membermembertagrelation:info')")
    public Resp<MemberMemberTagRelationEntity> info(@PathVariable("id") Long id){
		MemberMemberTagRelationEntity memberMemberTagRelation = memberMemberTagRelationService.getById(id);

        return Resp.ok(memberMemberTagRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('ums:membermembertagrelation:save')")
    public Resp<Object> save(@RequestBody MemberMemberTagRelationEntity memberMemberTagRelation){
		memberMemberTagRelationService.save(memberMemberTagRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('ums:membermembertagrelation:update')")
    public Resp<Object> update(@RequestBody MemberMemberTagRelationEntity memberMemberTagRelation){
		memberMemberTagRelationService.updateById(memberMemberTagRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('ums:membermembertagrelation:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		memberMemberTagRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
