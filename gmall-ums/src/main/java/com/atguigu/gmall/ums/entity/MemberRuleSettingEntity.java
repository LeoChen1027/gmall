package com.atguigu.gmall.ums.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员积分成长规则表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@ApiModel
@Data
@TableName("ums_member_rule_setting")
public class MemberRuleSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Long id;
	/**
	 * 连续签到天数
	 */
	@ApiModelProperty(name = "continueSignDay",value = "连续签到天数")
	private Integer continueSignDay;
	/**
	 * 连续签到赠送数量
	 */
	@ApiModelProperty(name = "continueSignPoint",value = "连续签到赠送数量")
	private Integer continueSignPoint;
	/**
	 * 每消费多少元获取1个点
	 */
	@ApiModelProperty(name = "consumePerPoint",value = "每消费多少元获取1个点")
	private BigDecimal consumePerPoint;
	/**
	 * 最低获取点数的订单金额
	 */
	@ApiModelProperty(name = "lowOrderAmount",value = "最低获取点数的订单金额")
	private BigDecimal lowOrderAmount;
	/**
	 * 每笔订单最高获取点数
	 */
	@ApiModelProperty(name = "maxPointPerOrder",value = "每笔订单最高获取点数")
	private Integer maxPointPerOrder;
	/**
	 * 类型：0->积分规则；1->成长值规则
	 */
	@ApiModelProperty(name = "type",value = "类型：0->积分规则；1->成长值规则")
	private Integer type;

}
