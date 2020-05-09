package com.atguigu.gmall.ums.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 后台用户表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@ApiModel
@Data
@TableName("ums_admin")
public class AdminEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Long id;
	/**
	 * 
	 */
	@ApiModelProperty(name = "username",value = "")
	private String username;
	/**
	 * 
	 */
	@ApiModelProperty(name = "password",value = "")
	private String password;
	/**
	 * 头像
	 */
	@ApiModelProperty(name = "icon",value = "头像")
	private String icon;
	/**
	 * 邮箱
	 */
	@ApiModelProperty(name = "email",value = "邮箱")
	private String email;
	/**
	 * 昵称
	 */
	@ApiModelProperty(name = "nickName",value = "昵称")
	private String nickName;
	/**
	 * 备注信息
	 */
	@ApiModelProperty(name = "note",value = "备注信息")
	private String note;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(name = "createTime",value = "创建时间")
	private Date createTime;
	/**
	 * 最后登录时间
	 */
	@ApiModelProperty(name = "loginTime",value = "最后登录时间")
	private Date loginTime;
	/**
	 * 帐号启用状态：0->禁用；1->启用
	 */
	@ApiModelProperty(name = "status",value = "帐号启用状态：0->禁用；1->启用")
	private Integer status;

}
