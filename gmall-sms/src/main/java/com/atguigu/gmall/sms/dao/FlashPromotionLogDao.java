package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.FlashPromotionLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 限时购通知记录
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 14:17:21
 */
@Mapper
public interface FlashPromotionLogDao extends BaseMapper<FlashPromotionLogEntity> {
	
}
