package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.CouponProductRelationEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 优惠券和产品的关系表
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 14:17:21
 */
public interface CouponProductRelationService extends IService<CouponProductRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

