package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.ProductFullReductionEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 产品满减表(只针对同商品)
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 13:29:08
 */
public interface ProductFullReductionService extends IService<ProductFullReductionEntity> {

    PageVo queryPage(QueryCondition params);
}

