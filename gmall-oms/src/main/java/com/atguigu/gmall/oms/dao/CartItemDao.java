package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.CartItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 购物车表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:02:51
 */
@Mapper
public interface CartItemDao extends BaseMapper<CartItemEntity> {
	
}
