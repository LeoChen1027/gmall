package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.MemberProductCategoryRelationEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员与产品分类关系表（用户喜欢的分类）
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
public interface MemberProductCategoryRelationService extends IService<MemberProductCategoryRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

