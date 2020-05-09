package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.AdminEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 后台用户表
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
public interface AdminService extends IService<AdminEntity> {

    PageVo queryPage(QueryCondition params);
}

