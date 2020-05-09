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

import com.atguigu.gmall.ums.entity.MemberProductCategoryRelationEntity;
import com.atguigu.gmall.ums.service.MemberProductCategoryRelationService;




/**
 * 会员与产品分类关系表（用户喜欢的分类）
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@Api(tags = "会员与产品分类关系表（用户喜欢的分类） 管理")
@RestController
@RequestMapping("ums/memberproductcategoryrelation")
public class MemberProductCategoryRelationController {
    @Autowired
    private MemberProductCategoryRelationService memberProductCategoryRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('ums:memberproductcategoryrelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = memberProductCategoryRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('ums:memberproductcategoryrelation:info')")
    public Resp<MemberProductCategoryRelationEntity> info(@PathVariable("id") Long id){
		MemberProductCategoryRelationEntity memberProductCategoryRelation = memberProductCategoryRelationService.getById(id);

        return Resp.ok(memberProductCategoryRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('ums:memberproductcategoryrelation:save')")
    public Resp<Object> save(@RequestBody MemberProductCategoryRelationEntity memberProductCategoryRelation){
		memberProductCategoryRelationService.save(memberProductCategoryRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('ums:memberproductcategoryrelation:update')")
    public Resp<Object> update(@RequestBody MemberProductCategoryRelationEntity memberProductCategoryRelation){
		memberProductCategoryRelationService.updateById(memberProductCategoryRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('ums:memberproductcategoryrelation:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		memberProductCategoryRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
