package com.atguigu.gmall.ums.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 后台用户权限表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@ApiModel
@Data
@TableName("ums_permission")
public class PermissionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Long id;
	/**
	 * 父级权限id
	 */
	@ApiModelProperty(name = "pid",value = "父级权限id")
	private Long pid;
	/**
	 * 名称
	 */
	@ApiModelProperty(name = "name",value = "名称")
	private String name;
	/**
	 * 权限值
	 */
	@ApiModelProperty(name = "value",value = "权限值")
	private String value;
	/**
	 * 图标
	 */
	@ApiModelProperty(name = "icon",value = "图标")
	private String icon;
	/**
	 * 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
	 */
	@ApiModelProperty(name = "type",value = "权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）")
	private Integer type;
	/**
	 * 前端资源路径
	 */
	@ApiModelProperty(name = "uri",value = "前端资源路径")
	private String uri;
	/**
	 * 启用状态；0->禁用；1->启用
	 */
	@ApiModelProperty(name = "status",value = "启用状态；0->禁用；1->启用")
	private Integer status;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(name = "createTime",value = "创建时间")
	private Date createTime;
	/**
	 * 排序
	 */
	@ApiModelProperty(name = "sort",value = "排序")
	private Integer sort;

}
