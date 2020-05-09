package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.HomeBrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页推荐品牌表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 14:17:21
 */
@Mapper
public interface HomeBrandDao extends BaseMapper<HomeBrandEntity> {
	
}
