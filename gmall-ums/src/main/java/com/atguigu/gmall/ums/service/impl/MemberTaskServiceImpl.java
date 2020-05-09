package com.atguigu.gmall.ums.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.ums.dao.MemberTaskDao;
import com.atguigu.gmall.ums.entity.MemberTaskEntity;
import com.atguigu.gmall.ums.service.MemberTaskService;


@Service("memberTaskService")
public class MemberTaskServiceImpl extends ServiceImpl<MemberTaskDao, MemberTaskEntity> implements MemberTaskService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberTaskEntity> page = this.page(
                new Query<MemberTaskEntity>().getPage(params),
                new QueryWrapper<MemberTaskEntity>()
        );

        return new PageVo(page);
    }

}