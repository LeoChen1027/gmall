package com.atguigu.gmall.ums.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.ums.dao.AdminDao;
import com.atguigu.gmall.ums.entity.AdminEntity;
import com.atguigu.gmall.ums.service.AdminService;


@Service("adminService")
public class AdminServiceImpl extends ServiceImpl<AdminDao, AdminEntity> implements AdminService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AdminEntity> page = this.page(
                new Query<AdminEntity>().getPage(params),
                new QueryWrapper<AdminEntity>()
        );

        return new PageVo(page);
    }

}