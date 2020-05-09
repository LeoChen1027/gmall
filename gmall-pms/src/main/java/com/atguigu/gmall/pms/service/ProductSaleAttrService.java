package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.ProductSaleAttrEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 13:29:07
 */
public interface ProductSaleAttrService extends IService<ProductSaleAttrEntity> {

    PageVo queryPage(QueryCondition params);
}

