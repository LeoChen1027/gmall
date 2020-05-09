package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.AdminPermissionRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@Mapper
public interface AdminPermissionRelationDao extends BaseMapper<AdminPermissionRelationEntity> {
	
}
