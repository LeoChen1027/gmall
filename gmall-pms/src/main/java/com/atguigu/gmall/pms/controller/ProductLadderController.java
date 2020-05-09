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

import com.atguigu.gmall.pms.entity.ProductLadderEntity;
import com.atguigu.gmall.pms.service.ProductLadderService;




/**
 * 产品阶梯价格表(只针对同商品)
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 13:29:08
 */
@Api(tags = "产品阶梯价格表(只针对同商品) 管理")
@RestController
@RequestMapping("pms/productladder")
public class ProductLadderController {
    @Autowired
    private ProductLadderService productLadderService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:productladder:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = productLadderService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:productladder:info')")
    public Resp<ProductLadderEntity> info(@PathVariable("id") Long id){
		ProductLadderEntity productLadder = productLadderService.getById(id);

        return Resp.ok(productLadder);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:productladder:save')")
    public Resp<Object> save(@RequestBody ProductLadderEntity productLadder){
		productLadderService.save(productLadder);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:productladder:update')")
    public Resp<Object> update(@RequestBody ProductLadderEntity productLadder){
		productLadderService.updateById(productLadder);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:productladder:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		productLadderService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
