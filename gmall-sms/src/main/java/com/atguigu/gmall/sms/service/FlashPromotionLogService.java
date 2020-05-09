package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.FlashPromotionLogEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 限时购通知记录
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 14:17:21
 */
public interface FlashPromotionLogService extends IService<FlashPromotionLogEntity> {

    PageVo queryPage(QueryCondition params);
}

