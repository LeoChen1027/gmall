package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberMemberTagRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户和标签关系表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@Mapper
public interface MemberMemberTagRelationDao extends BaseMapper<MemberMemberTagRelationEntity> {
	
}
