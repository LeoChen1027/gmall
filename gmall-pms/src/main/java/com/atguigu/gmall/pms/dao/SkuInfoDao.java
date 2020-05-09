package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.SkuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 库存单元表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 13:29:07
 */
@Mapper
public interface SkuInfoDao extends BaseMapper<SkuInfoEntity> {
	
}
