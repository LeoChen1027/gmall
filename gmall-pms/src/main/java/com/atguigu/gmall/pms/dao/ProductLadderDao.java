package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.ProductLadderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 产品阶梯价格表(只针对同商品)
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 13:29:08
 */
@Mapper
public interface ProductLadderDao extends BaseMapper<ProductLadderEntity> {
	
}
