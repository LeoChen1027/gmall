package com.atguigu.gmall.ums.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 后台用户角色表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@ApiModel
@Data
@TableName("ums_role")
public class RoleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Long id;
	/**
	 * 名称
	 */
	@ApiModelProperty(name = "name",value = "名称")
	private String name;
	/**
	 * 描述
	 */
	@ApiModelProperty(name = "description",value = "描述")
	private String description;
	/**
	 * 后台用户数量
	 */
	@ApiModelProperty(name = "adminCount",value = "后台用户数量")
	private Integer adminCount;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(name = "createTime",value = "创建时间")
	private Date createTime;
	/**
	 * 启用状态：0->禁用；1->启用
	 */
	@ApiModelProperty(name = "status",value = "启用状态：0->禁用；1->启用")
	private Integer status;
	/**
	 * 
	 */
	@ApiModelProperty(name = "sort",value = "")
	private Integer sort;

}
