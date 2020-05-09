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
 * 会员等级表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@ApiModel
@Data
@TableName("ums_member_level")
public class MemberLevelEntity implements Serializable {
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
	 * 
	 */
	@ApiModelProperty(name = "growthPoint",value = "")
	private Integer growthPoint;
	/**
	 * 是否为默认等级：0->不是；1->是
	 */
	@ApiModelProperty(name = "defaultStatus",value = "是否为默认等级：0->不是；1->是")
	private Integer defaultStatus;
	/**
	 * 免运费标准
	 */
	@ApiModelProperty(name = "freeFreightPoint",value = "免运费标准")
	private BigDecimal freeFreightPoint;
	/**
	 * 每次评价获取的成长值
	 */
	@ApiModelProperty(name = "commentGrowthPoint",value = "每次评价获取的成长值")
	private Integer commentGrowthPoint;
	/**
	 * 是否有免邮特权
	 */
	@ApiModelProperty(name = "priviledgeFreeFreight",value = "是否有免邮特权")
	private Integer priviledgeFreeFreight;
	/**
	 * 是否有签到特权
	 */
	@ApiModelProperty(name = "priviledgeSignIn",value = "是否有签到特权")
	private Integer priviledgeSignIn;
	/**
	 * 是否有评论获奖励特权
	 */
	@ApiModelProperty(name = "priviledgeComment",value = "是否有评论获奖励特权")
	private Integer priviledgeComment;
	/**
	 * 是否有专享活动特权
	 */
	@ApiModelProperty(name = "priviledgePromotion",value = "是否有专享活动特权")
	private Integer priviledgePromotion;
	/**
	 * 是否有会员价格特权
	 */
	@ApiModelProperty(name = "priviledgeMemberPrice",value = "是否有会员价格特权")
	private Integer priviledgeMemberPrice;
	/**
	 * 是否有生日特权
	 */
	@ApiModelProperty(name = "priviledgeBirthday",value = "是否有生日特权")
	private Integer priviledgeBirthday;
	/**
	 * 
	 */
	@ApiModelProperty(name = "note",value = "")
	private String note;

}
