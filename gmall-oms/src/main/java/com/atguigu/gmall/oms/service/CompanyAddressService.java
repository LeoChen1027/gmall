package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.oms.entity.CompanyAddressEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 公司收发货地址表
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:02:51
 */
public interface CompanyAddressService extends IService<CompanyAddressEntity> {

    PageVo queryPage(QueryCondition params);
}

