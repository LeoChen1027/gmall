package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.SkuAttrValueEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * sku平台属性值关联表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 13:29:07
 */
@Mapper
public interface SkuAttrValueDao extends BaseMapper<SkuAttrValueEntity> {
	
}
