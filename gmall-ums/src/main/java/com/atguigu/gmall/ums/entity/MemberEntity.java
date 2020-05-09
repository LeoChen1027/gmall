package com.atguigu.gmall.ums.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@ApiModel
@Data
@TableName("ums_member")
public class MemberEntity implements Serializable {
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
	@ApiModelProperty(name = "memberLevelId",value = "")
	private Long memberLevelId;
	/**
	 * 用户名
	 */
	@ApiModelProperty(name = "username",value = "用户名")
	private String username;
	/**
	 * 密码
	 */
	@ApiModelProperty(name = "password",value = "密码")
	private String password;
	/**
	 * 昵称
	 */
	@ApiModelProperty(name = "nickname",value = "昵称")
	private String nickname;
	/**
	 * 手机号码
	 */
	@ApiModelProperty(name = "phone",value = "手机号码")
	private String phone;
	/**
	 * 帐号启用状态:0->禁用；1->启用
	 */
	@ApiModelProperty(name = "status",value = "帐号启用状态:0->禁用；1->启用")
	private Integer status;
	/**
	 * 注册时间
	 */
	@ApiModelProperty(name = "createTime",value = "注册时间")
	private Date createTime;
	/**
	 * 头像
	 */
	@ApiModelProperty(name = "icon",value = "头像")
	private String icon;
	/**
	 * 性别：0->未知；1->男；2->女
	 */
	@ApiModelProperty(name = "gender",value = "性别：0->未知；1->男；2->女")
	private Integer gender;
	/**
	 * 生日
	 */
	@ApiModelProperty(name = "birthday",value = "生日")
	private Date birthday;
	/**
	 * 所做城市
	 */
	@ApiModelProperty(name = "city",value = "所做城市")
	private String city;
	/**
	 * 职业
	 */
	@ApiModelProperty(name = "job",value = "职业")
	private String job;
	/**
	 * 个性签名
	 */
	@ApiModelProperty(name = "personalizedSignature",value = "个性签名")
	private String personalizedSignature;
	/**
	 * 用户来源
	 */
	@ApiModelProperty(name = "sourceType",value = "用户来源")
	private Integer sourceType;
	/**
	 * 积分
	 */
	@ApiModelProperty(name = "integration",value = "积分")
	private Integer integration;
	/**
	 * 成长值
	 */
	@ApiModelProperty(name = "growth",value = "成长值")
	private Integer growth;
	/**
	 * 剩余抽奖次数
	 */
	@ApiModelProperty(name = "luckeyCount",value = "剩余抽奖次数")
	private Integer luckeyCount;
	/**
	 * 历史积分数量
	 */
	@ApiModelProperty(name = "historyIntegration",value = "历史积分数量")
	private Integer historyIntegration;

}
