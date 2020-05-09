package com.atguigu.gmall.ums.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员登录记录
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@ApiModel
@Data
@TableName("ums_member_login_log")
public class MemberLoginLogEntity implements Serializable {
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
	@ApiModelProperty(name = "memberId",value = "")
	private Long memberId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "createTime",value = "")
	private Date createTime;
	/**
	 * 
	 */
	@ApiModelProperty(name = "ip",value = "")
	private String ip;
	/**
	 * 
	 */
	@ApiModelProperty(name = "city",value = "")
	private String city;
	/**
	 * 登录类型：0->PC；1->android;2->ios;3->小程序
	 */
	@ApiModelProperty(name = "loginType",value = "登录类型：0->PC；1->android;2->ios;3->小程序")
	private Integer loginType;
	/**
	 * 
	 */
	@ApiModelProperty(name = "province",value = "")
	private String province;

}
