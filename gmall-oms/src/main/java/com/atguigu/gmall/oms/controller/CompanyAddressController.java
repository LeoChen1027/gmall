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

import com.atguigu.gmall.oms.entity.CompanyAddressEntity;
import com.atguigu.gmall.oms.service.CompanyAddressService;




/**
 * 公司收发货地址表
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:02:51
 */
@Api(tags = "公司收发货地址表 管理")
@RestController
@RequestMapping("oms/companyaddress")
public class CompanyAddressController {
    @Autowired
    private CompanyAddressService companyAddressService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('oms:companyaddress:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = companyAddressService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('oms:companyaddress:info')")
    public Resp<CompanyAddressEntity> info(@PathVariable("id") Long id){
		CompanyAddressEntity companyAddress = companyAddressService.getById(id);

        return Resp.ok(companyAddress);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('oms:companyaddress:save')")
    public Resp<Object> save(@RequestBody CompanyAddressEntity companyAddress){
		companyAddressService.save(companyAddress);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('oms:companyaddress:update')")
    public Resp<Object> update(@RequestBody CompanyAddressEntity companyAddress){
		companyAddressService.updateById(companyAddress);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('oms:companyaddress:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		companyAddressService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
