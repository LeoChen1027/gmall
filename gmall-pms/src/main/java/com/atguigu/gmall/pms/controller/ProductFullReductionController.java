package com.atguigu.gmall.pms.controller;

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

import com.atguigu.gmall.pms.entity.ProductFullReductionEntity;
import com.atguigu.gmall.pms.service.ProductFullReductionService;




/**
 * 产品满减表(只针对同商品)
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 13:29:08
 */
@Api(tags = "产品满减表(只针对同商品) 管理")
@RestController
@RequestMapping("pms/productfullreduction")
public class ProductFullReductionController {
    @Autowired
    private ProductFullReductionService productFullReductionService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:productfullreduction:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = productFullReductionService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:productfullreduction:info')")
    public Resp<ProductFullReductionEntity> info(@PathVariable("id") Long id){
		ProductFullReductionEntity productFullReduction = productFullReductionService.getById(id);

        return Resp.ok(productFullReduction);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:productfullreduction:save')")
    public Resp<Object> save(@RequestBody ProductFullReductionEntity productFullReduction){
		productFullReductionService.save(productFullReduction);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:productfullreduction:update')")
    public Resp<Object> update(@RequestBody ProductFullReductionEntity productFullReduction){
		productFullReductionService.updateById(productFullReduction);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:productfullreduction:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		productFullReductionService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
