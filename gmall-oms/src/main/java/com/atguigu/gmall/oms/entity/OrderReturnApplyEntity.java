package com.atguigu.gmall.oms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 订单退货申请
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:02:51
 */
@ApiModel
@Data
@TableName("oms_order_return_apply")
public class OrderReturnApplyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Long id;
	/**
	 * 订单id
	 */
	@ApiModelProperty(name = "orderId",value = "订单id")
	private Long orderId;
	/**
	 * 收货地址表id
	 */
	@ApiModelProperty(name = "companyAddressId",value = "收货地址表id")
	private Long companyAddressId;
	/**
	 * 退货商品id
	 */
	@ApiModelProperty(name = "productId",value = "退货商品id")
	private Long productId;
	/**
	 * 订单编号
	 */
	@ApiModelProperty(name = "orderSn",value = "订单编号")
	private String orderSn;
	/**
	 * 申请时间
	 */
	@ApiModelProperty(name = "createTime",value = "申请时间")
	private Date createTime;
	/**
	 * 会员用户名
	 */
	@ApiModelProperty(name = "memberUsername",value = "会员用户名")
	private String memberUsername;
	/**
	 * 退款金额
	 */
	@ApiModelProperty(name = "returnAmount",value = "退款金额")
	private BigDecimal returnAmount;
	/**
	 * 退货人姓名
	 */
	@ApiModelProperty(name = "returnName",value = "退货人姓名")
	private String returnName;
	/**
	 * 退货人电话
	 */
	@ApiModelProperty(name = "returnPhone",value = "退货人电话")
	private String returnPhone;
	/**
	 * 申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝
	 */
	@ApiModelProperty(name = "status",value = "申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝")
	private Integer status;
	/**
	 * 处理时间
	 */
	@ApiModelProperty(name = "handleTime",value = "处理时间")
	private Date handleTime;
	/**
	 * 商品图片
	 */
	@ApiModelProperty(name = "productPic",value = "商品图片")
	private String productPic;
	/**
	 * 商品名称
	 */
	@ApiModelProperty(name = "productName",value = "商品名称")
	private String productName;
	/**
	 * 商品品牌
	 */
	@ApiModelProperty(name = "productBrand",value = "商品品牌")
	private String productBrand;
	/**
	 * 商品销售属性：颜色：红色；尺码：xl;
	 */
	@ApiModelProperty(name = "productAttr",value = "商品销售属性：颜色：红色；尺码：xl;")
	private String productAttr;
	/**
	 * 退货数量
	 */
	@ApiModelProperty(name = "productCount",value = "退货数量")
	private Integer productCount;
	/**
	 * 商品单价
	 */
	@ApiModelProperty(name = "productPrice",value = "商品单价")
	private BigDecimal productPrice;
	/**
	 * 商品实际支付单价
	 */
	@ApiModelProperty(name = "productRealPrice",value = "商品实际支付单价")
	private BigDecimal productRealPrice;
	/**
	 * 原因
	 */
	@ApiModelProperty(name = "reason",value = "原因")
	private String reason;
	/**
	 * 描述
	 */
	@ApiModelProperty(name = "description",value = "描述")
	private String description;
	/**
	 * 凭证图片，以逗号隔开
	 */
	@ApiModelProperty(name = "proofPics",value = "凭证图片，以逗号隔开")
	private String proofPics;
	/**
	 * 处理备注
	 */
	@ApiModelProperty(name = "handleNote",value = "处理备注")
	private String handleNote;
	/**
	 * 处理人员
	 */
	@ApiModelProperty(name = "handleMan",value = "处理人员")
	private String handleMan;
	/**
	 * 收货人
	 */
	@ApiModelProperty(name = "receiveMan",value = "收货人")
	private String receiveMan;
	/**
	 * 收货时间
	 */
	@ApiModelProperty(name = "receiveTime",value = "收货时间")
	private Date receiveTime;
	/**
	 * 收货备注
	 */
	@ApiModelProperty(name = "receiveNote",value = "收货备注")
	private String receiveNote;

}
