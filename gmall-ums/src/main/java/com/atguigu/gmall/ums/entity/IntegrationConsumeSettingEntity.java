package com.atguigu.gmall.ums.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 积分消费设置
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@ApiModel
@Data
@TableName("ums_integration_consume_setting")
public class IntegrationConsumeSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Long id;
	/**
	 * 每一元需要抵扣的积分数量
	 */
	@ApiModelProperty(name = "deductionPerAmount",value = "每一元需要抵扣的积分数量")
	private Integer deductionPerAmount;
	/**
	 * 每笔订单最高抵用百分比
	 */
	@ApiModelProperty(name = "maxPercentPerOrder",value = "每笔订单最高抵用百分比")
	private Integer maxPercentPerOrder;
	/**
	 * 每次使用积分最小单位100
	 */
	@ApiModelProperty(name = "useUnit",value = "每次使用积分最小单位100")
	private Integer useUnit;
	/**
	 * 是否可以和优惠券同用；0->不可以；1->可以
	 */
	@ApiModelProperty(name = "couponStatus",value = "是否可以和优惠券同用；0->不可以；1->可以")
	private Integer couponStatus;

}
