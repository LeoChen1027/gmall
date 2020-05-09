package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.ProductImageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品图片表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 13:29:08
 */
@Mapper
public interface ProductImageDao extends BaseMapper<ProductImageEntity> {
	
}
