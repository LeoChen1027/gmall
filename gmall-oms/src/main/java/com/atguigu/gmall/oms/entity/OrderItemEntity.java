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
 * 订单中所包含的商品
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:02:51
 */
@ApiModel
@Data
@TableName("oms_order_item")
public class OrderItemEntity implements Serializable {
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
	 * 订单编号
	 */
	@ApiModelProperty(name = "orderSn",value = "订单编号")
	private String orderSn;
	/**
	 * 
	 */
	@ApiModelProperty(name = "productId",value = "")
	private Long productId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "productPic",value = "")
	private String productPic;
	/**
	 * 
	 */
	@ApiModelProperty(name = "productName",value = "")
	private String productName;
	/**
	 * 
	 */
	@ApiModelProperty(name = "productBrand",value = "")
	private String productBrand;
	/**
	 * 
	 */
	@ApiModelProperty(name = "productSn",value = "")
	private String productSn;
	/**
	 * 销售价格
	 */
	@ApiModelProperty(name = "productPrice",value = "销售价格")
	private BigDecimal productPrice;
	/**
	 * 购买数量
	 */
	@ApiModelProperty(name = "productQuantity",value = "购买数量")
	private Integer productQuantity;
	/**
	 * 商品sku编号
	 */
	@ApiModelProperty(name = "productSkuId",value = "商品sku编号")
	private Long productSkuId;
	/**
	 * 商品sku条码
	 */
	@ApiModelProperty(name = "productSkuCode",value = "商品sku条码")
	private String productSkuCode;
	/**
	 * 商品分类id
	 */
	@ApiModelProperty(name = "productCategoryId",value = "商品分类id")
	private Long productCategoryId;
	/**
	 * 商品的销售属性
	 */
	@ApiModelProperty(name = "sp1",value = "商品的销售属性")
	private String sp1;
	/**
	 * 
	 */
	@ApiModelProperty(name = "sp2",value = "")
	private String sp2;
	/**
	 * 
	 */
	@ApiModelProperty(name = "sp3",value = "")
	private String sp3;
	/**
	 * 商品促销名称
	 */
	@ApiModelProperty(name = "promotionName",value = "商品促销名称")
	private String promotionName;
	/**
	 * 商品促销分解金额
	 */
	@ApiModelProperty(name = "promotionAmount",value = "商品促销分解金额")
	private BigDecimal promotionAmount;
	/**
	 * 优惠券优惠分解金额
	 */
	@ApiModelProperty(name = "couponAmount",value = "优惠券优惠分解金额")
	private BigDecimal couponAmount;
	/**
	 * 积分优惠分解金额
	 */
	@ApiModelProperty(name = "integrationAmount",value = "积分优惠分解金额")
	private BigDecimal integrationAmount;
	/**
	 * 该商品经过优惠后的分解金额
	 */
	@ApiModelProperty(name = "realAmount",value = "该商品经过优惠后的分解金额")
	private BigDecimal realAmount;
	/**
	 * 
	 */
	@ApiModelProperty(name = "giftIntegration",value = "")
	private Integer giftIntegration;
	/**
	 * 
	 */
	@ApiModelProperty(name = "giftGrowth",value = "")
	private Integer giftGrowth;
	/**
	 * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
	 */
	@ApiModelProperty(name = "productAttr",value = "商品销售属性:[{key:颜色,value:颜色},{key:容量,value:4G}]")
	private String productAttr;

}
