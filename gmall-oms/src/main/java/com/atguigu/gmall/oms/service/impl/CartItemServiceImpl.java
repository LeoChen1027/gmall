package com.atguigu.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.oms.dao.CartItemDao;
import com.atguigu.gmall.oms.entity.CartItemEntity;
import com.atguigu.gmall.oms.service.CartItemService;


@Service("cartItemService")
public class CartItemServiceImpl extends ServiceImpl<CartItemDao, CartItemEntity> implements CartItemService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CartItemEntity> page = this.page(
                new Query<CartItemEntity>().getPage(params),
                new QueryWrapper<CartItemEntity>()
        );

        return new PageVo(page);
    }

}