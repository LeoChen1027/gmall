package com.atguigu.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.oms.dao.CompanyAddressDao;
import com.atguigu.gmall.oms.entity.CompanyAddressEntity;
import com.atguigu.gmall.oms.service.CompanyAddressService;


@Service("companyAddressService")
public class CompanyAddressServiceImpl extends ServiceImpl<CompanyAddressDao, CompanyAddressEntity> implements CompanyAddressService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CompanyAddressEntity> page = this.page(
                new Query<CompanyAddressEntity>().getPage(params),
                new QueryWrapper<CompanyAddressEntity>()
        );

        return new PageVo(page);
    }

}