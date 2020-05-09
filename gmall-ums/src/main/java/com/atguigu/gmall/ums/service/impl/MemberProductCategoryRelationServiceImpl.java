package com.atguigu.gmall.ums.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.ums.dao.MemberProductCategoryRelationDao;
import com.atguigu.gmall.ums.entity.MemberProductCategoryRelationEntity;
import com.atguigu.gmall.ums.service.MemberProductCategoryRelationService;


@Service("memberProductCategoryRelationService")
public class MemberProductCategoryRelationServiceImpl extends ServiceImpl<MemberProductCategoryRelationDao, MemberProductCategoryRelationEntity> implements MemberProductCategoryRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberProductCategoryRelationEntity> page = this.page(
                new Query<MemberProductCategoryRelationEntity>().getPage(params),
                new QueryWrapper<MemberProductCategoryRelationEntity>()
        );

        return new PageVo(page);
    }

}