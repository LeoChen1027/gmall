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
 * 用户标签表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@ApiModel
@Data
@TableName("ums_member_tag")
public class MemberTagEntity implements Serializable {
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
	@ApiModelProperty(name = "name",value = "")
	private String name;
	/**
	 * 自动打标签完成订单数量
	 */
	@ApiModelProperty(name = "finishOrderCount",value = "自动打标签完成订单数量")
	private Integer finishOrderCount;
	/**
	 * 自动打标签完成订单金额
	 */
	@ApiModelProperty(name = "finishOrderAmount",value = "自动打标签完成订单金额")
	private BigDecimal finishOrderAmount;

}
