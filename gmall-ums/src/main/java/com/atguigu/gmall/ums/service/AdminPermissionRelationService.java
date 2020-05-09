package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.AdminPermissionRelationEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
public interface AdminPermissionRelationService extends IService<AdminPermissionRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

