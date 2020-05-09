package com.atguigu.gmall.ums.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.ums.dao.MemberRuleSettingDao;
import com.atguigu.gmall.ums.entity.MemberRuleSettingEntity;
import com.atguigu.gmall.ums.service.MemberRuleSettingService;


@Service("memberRuleSettingService")
public class MemberRuleSettingServiceImpl extends ServiceImpl<MemberRuleSettingDao, MemberRuleSettingEntity> implements MemberRuleSettingService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberRuleSettingEntity> page = this.page(
                new Query<MemberRuleSettingEntity>().getPage(params),
                new QueryWrapper<MemberRuleSettingEntity>()
        );

        return new PageVo(page);
    }

}