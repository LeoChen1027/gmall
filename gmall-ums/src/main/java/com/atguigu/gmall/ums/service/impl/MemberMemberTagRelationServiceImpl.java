package com.atguigu.gmall.ums.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.ums.dao.MemberMemberTagRelationDao;
import com.atguigu.gmall.ums.entity.MemberMemberTagRelationEntity;
import com.atguigu.gmall.ums.service.MemberMemberTagRelationService;


@Service("memberMemberTagRelationService")
public class MemberMemberTagRelationServiceImpl extends ServiceImpl<MemberMemberTagRelationDao, MemberMemberTagRelationEntity> implements MemberMemberTagRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberMemberTagRelationEntity> page = this.page(
                new Query<MemberMemberTagRelationEntity>().getPage(params),
                new QueryWrapper<MemberMemberTagRelationEntity>()
        );

        return new PageVo(page);
    }

}