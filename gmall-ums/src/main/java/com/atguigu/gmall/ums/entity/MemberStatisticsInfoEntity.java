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
 * 会员统计信息
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@ApiModel
@Data
@TableName("ums_member_statistics_info")
public class MemberStatisticsInfoEntity implements Serializable {
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
	 * 累计消费金额
	 */
	@ApiModelProperty(name = "consumeAmount",value = "累计消费金额")
	private BigDecimal consumeAmount;
	/**
	 * 订单数量
	 */
	@ApiModelProperty(name = "orderCount",value = "订单数量")
	private Integer orderCount;
	/**
	 * 优惠券数量
	 */
	@ApiModelProperty(name = "couponCount",value = "优惠券数量")
	private Integer couponCount;
	/**
	 * 评价数
	 */
	@ApiModelProperty(name = "commentCount",value = "评价数")
	private Integer commentCount;
	/**
	 * 退货数量
	 */
	@ApiModelProperty(name = "returnOrderCount",value = "退货数量")
	private Integer returnOrderCount;
	/**
	 * 登录次数
	 */
	@ApiModelProperty(name = "loginCount",value = "登录次数")
	private Integer loginCount;
	/**
	 * 关注数量
	 */
	@ApiModelProperty(name = "attendCount",value = "关注数量")
	private Integer attendCount;
	/**
	 * 粉丝数量
	 */
	@ApiModelProperty(name = "fansCount",value = "粉丝数量")
	private Integer fansCount;
	/**
	 * 
	 */
	@ApiModelProperty(name = "collectProductCount",value = "")
	private Integer collectProductCount;
	/**
	 * 
	 */
	@ApiModelProperty(name = "collectSubjectCount",value = "")
	private Integer collectSubjectCount;
	/**
	 * 
	 */
	@ApiModelProperty(name = "collectTopicCount",value = "")
	private Integer collectTopicCount;
	/**
	 * 
	 */
	@ApiModelProperty(name = "collectCommentCount",value = "")
	private Integer collectCommentCount;
	/**
	 * 
	 */
	@ApiModelProperty(name = "inviteFriendCount",value = "")
	private Integer inviteFriendCount;
	/**
	 * 最后一次下订单时间
	 */
	@ApiModelProperty(name = "recentOrderTime",value = "最后一次下订单时间")
	private Date recentOrderTime;

}
