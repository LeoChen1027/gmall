package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberProductCategoryRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员与产品分类关系表（用户喜欢的分类）
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@Mapper
public interface MemberProductCategoryRelationDao extends BaseMapper<MemberProductCategoryRelationEntity> {
	
}
