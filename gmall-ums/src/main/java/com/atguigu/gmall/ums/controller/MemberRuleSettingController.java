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

import com.atguigu.gmall.ums.entity.MemberRuleSettingEntity;
import com.atguigu.gmall.ums.service.MemberRuleSettingService;




/**
 * 会员积分成长规则表
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@Api(tags = "会员积分成长规则表 管理")
@RestController
@RequestMapping("ums/memberrulesetting")
public class MemberRuleSettingController {
    @Autowired
    private MemberRuleSettingService memberRuleSettingService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('ums:memberrulesetting:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = memberRuleSettingService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('ums:memberrulesetting:info')")
    public Resp<MemberRuleSettingEntity> info(@PathVariable("id") Long id){
		MemberRuleSettingEntity memberRuleSetting = memberRuleSettingService.getById(id);

        return Resp.ok(memberRuleSetting);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('ums:memberrulesetting:save')")
    public Resp<Object> save(@RequestBody MemberRuleSettingEntity memberRuleSetting){
		memberRuleSettingService.save(memberRuleSetting);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('ums:memberrulesetting:update')")
    public Resp<Object> update(@RequestBody MemberRuleSettingEntity memberRuleSetting){
		memberRuleSettingService.updateById(memberRuleSetting);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('ums:memberrulesetting:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		memberRuleSettingService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
