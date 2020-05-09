package com.atguigu.gmall.oms.controller;

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

import com.atguigu.gmall.oms.entity.CartItemEntity;
import com.atguigu.gmall.oms.service.CartItemService;




/**
 * 购物车表
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:02:51
 */
@Api(tags = "购物车表 管理")
@RestController
@RequestMapping("oms/cartitem")
public class CartItemController {
    @Autowired
    private CartItemService cartItemService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('oms:cartitem:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = cartItemService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('oms:cartitem:info')")
    public Resp<CartItemEntity> info(@PathVariable("id") Long id){
		CartItemEntity cartItem = cartItemService.getById(id);

        return Resp.ok(cartItem);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('oms:cartitem:save')")
    public Resp<Object> save(@RequestBody CartItemEntity cartItem){
		cartItemService.save(cartItem);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('oms:cartitem:update')")
    public Resp<Object> update(@RequestBody CartItemEntity cartItem){
		cartItemService.updateById(cartItem);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('oms:cartitem:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		cartItemService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
