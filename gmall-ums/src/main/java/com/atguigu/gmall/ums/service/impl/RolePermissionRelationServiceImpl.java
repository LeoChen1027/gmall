package com.atguigu.gmall.ums.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.ums.dao.RolePermissionRelationDao;
import com.atguigu.gmall.ums.entity.RolePermissionRelationEntity;
import com.atguigu.gmall.ums.service.RolePermissionRelationService;


@Service("rolePermissionRelationService")
public class RolePermissionRelationServiceImpl extends ServiceImpl<RolePermissionRelationDao, RolePermissionRelationEntity> implements RolePermissionRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<RolePermissionRelationEntity> page = this.page(
                new Query<RolePermissionRelationEntity>().getPage(params),
                new QueryWrapper<RolePermissionRelationEntity>()
        );

        return new PageVo(page);
    }

}