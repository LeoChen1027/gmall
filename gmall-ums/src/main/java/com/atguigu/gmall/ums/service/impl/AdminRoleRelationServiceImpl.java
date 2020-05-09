package com.atguigu.gmall.ums.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.ums.dao.AdminRoleRelationDao;
import com.atguigu.gmall.ums.entity.AdminRoleRelationEntity;
import com.atguigu.gmall.ums.service.AdminRoleRelationService;


@Service("adminRoleRelationService")
public class AdminRoleRelationServiceImpl extends ServiceImpl<AdminRoleRelationDao, AdminRoleRelationEntity> implements AdminRoleRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AdminRoleRelationEntity> page = this.page(
                new Query<AdminRoleRelationEntity>().getPage(params),
                new QueryWrapper<AdminRoleRelationEntity>()
        );

        return new PageVo(page);
    }

}