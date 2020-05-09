package com.atguigu.gmall.wms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 库存工作单表 库存工作单表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:47:16
 */
@ApiModel
@Data
@TableName("wms_ware_order_task")
public class WareOrderTaskEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "编号")
	private Long id;
	/**
	 * 订单编号
	 */
	@ApiModelProperty(name = "orderId",value = "订单编号")
	private Long orderId;
	/**
	 * 收货人
	 */
	@ApiModelProperty(name = "consignee",value = "收货人")
	private String consignee;
	/**
	 * 收货人电话
	 */
	@ApiModelProperty(name = "consigneeTel",value = "收货人电话")
	private String consigneeTel;
	/**
	 * 送货地址
	 */
	@ApiModelProperty(name = "deliveryAddress",value = "送货地址")
	private String deliveryAddress;
	/**
	 * 订单备注
	 */
	@ApiModelProperty(name = "orderComment",value = "订单备注")
	private String orderComment;
	/**
	 * 付款方式 1:在线付款 2:货到付款
	 */
	@ApiModelProperty(name = "paymentWay",value = "付款方式 1:在线付款 2:货到付款")
	private String paymentWay;
	/**
	 * 
	 */
	@ApiModelProperty(name = "taskStatus",value = "")
	private String taskStatus;
	/**
	 * 订单描述
	 */
	@ApiModelProperty(name = "orderBody",value = "订单描述")
	private String orderBody;
	/**
	 * 物流单号
	 */
	@ApiModelProperty(name = "trackingNo",value = "物流单号")
	private String trackingNo;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(name = "createTime",value = "创建时间")
	private Date createTime;
	/**
	 * 仓库编号
	 */
	@ApiModelProperty(name = "wareId",value = "仓库编号")
	private Long wareId;
	/**
	 * 工作单备注
	 */
	@ApiModelProperty(name = "taskComment",value = "工作单备注")
	private String taskComment;

}
