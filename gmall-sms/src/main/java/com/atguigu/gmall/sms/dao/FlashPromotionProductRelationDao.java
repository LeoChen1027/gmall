package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.FlashPromotionProductRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品限时购与商品关系表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 14:17:21
 */
@Mapper
public interface FlashPromotionProductRelationDao extends BaseMapper<FlashPromotionProductRelationEntity> {
	
}
