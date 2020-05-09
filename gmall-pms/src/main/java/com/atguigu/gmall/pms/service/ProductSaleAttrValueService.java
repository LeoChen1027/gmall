package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.ProductSaleAttrValueEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * spu销售属性值
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 13:29:07
 */
public interface ProductSaleAttrValueService extends IService<ProductSaleAttrValueEntity> {

    PageVo queryPage(QueryCondition params);
}

