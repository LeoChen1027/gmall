package com.atguigu.gmall.ums.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.ums.dao.AdminLoginLogDao;
import com.atguigu.gmall.ums.entity.AdminLoginLogEntity;
import com.atguigu.gmall.ums.service.AdminLoginLogService;


@Service("adminLoginLogService")
public class AdminLoginLogServiceImpl extends ServiceImpl<AdminLoginLogDao, AdminLoginLogEntity> implements AdminLoginLogService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AdminLoginLogEntity> page = this.page(
                new Query<AdminLoginLogEntity>().getPage(params),
                new QueryWrapper<AdminLoginLogEntity>()
        );

        return new PageVo(page);
    }

}