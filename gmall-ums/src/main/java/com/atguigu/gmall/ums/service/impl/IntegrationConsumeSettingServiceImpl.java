package com.atguigu.gmall.ums.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.ums.dao.IntegrationConsumeSettingDao;
import com.atguigu.gmall.ums.entity.IntegrationConsumeSettingEntity;
import com.atguigu.gmall.ums.service.IntegrationConsumeSettingService;


@Service("integrationConsumeSettingService")
public class IntegrationConsumeSettingServiceImpl extends ServiceImpl<IntegrationConsumeSettingDao, IntegrationConsumeSettingEntity> implements IntegrationConsumeSettingService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<IntegrationConsumeSettingEntity> page = this.page(
                new Query<IntegrationConsumeSettingEntity>().getPage(params),
                new QueryWrapper<IntegrationConsumeSettingEntity>()
        );

        return new PageVo(page);
    }

}