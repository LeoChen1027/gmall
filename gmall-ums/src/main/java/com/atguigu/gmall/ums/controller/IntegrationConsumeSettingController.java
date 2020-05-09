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

import com.atguigu.gmall.ums.entity.IntegrationConsumeSettingEntity;
import com.atguigu.gmall.ums.service.IntegrationConsumeSettingService;




/**
 * 积分消费设置
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@Api(tags = "积分消费设置 管理")
@RestController
@RequestMapping("ums/integrationconsumesetting")
public class IntegrationConsumeSettingController {
    @Autowired
    private IntegrationConsumeSettingService integrationConsumeSettingService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('ums:integrationconsumesetting:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = integrationConsumeSettingService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('ums:integrationconsumesetting:info')")
    public Resp<IntegrationConsumeSettingEntity> info(@PathVariable("id") Long id){
		IntegrationConsumeSettingEntity integrationConsumeSetting = integrationConsumeSettingService.getById(id);

        return Resp.ok(integrationConsumeSetting);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('ums:integrationconsumesetting:save')")
    public Resp<Object> save(@RequestBody IntegrationConsumeSettingEntity integrationConsumeSetting){
		integrationConsumeSettingService.save(integrationConsumeSetting);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('ums:integrationconsumesetting:update')")
    public Resp<Object> update(@RequestBody IntegrationConsumeSettingEntity integrationConsumeSetting){
		integrationConsumeSettingService.updateById(integrationConsumeSetting);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('ums:integrationconsumesetting:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		integrationConsumeSettingService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
