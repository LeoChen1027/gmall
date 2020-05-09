package com.atguigu.gmall.ums.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.ums.dao.AdminPermissionRelationDao;
import com.atguigu.gmall.ums.entity.AdminPermissionRelationEntity;
import com.atguigu.gmall.ums.service.AdminPermissionRelationService;


@Service("adminPermissionRelationService")
public class AdminPermissionRelationServiceImpl extends ServiceImpl<AdminPermissionRelationDao, AdminPermissionRelationEntity> implements AdminPermissionRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AdminPermissionRelationEntity> page = this.page(
                new Query<AdminPermissionRelationEntity>().getPage(params),
                new QueryWrapper<AdminPermissionRelationEntity>()
        );

        return new PageVo(page);
    }

}