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
 * 购物车表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:02:51
 */
@ApiModel
@Data
@TableName("oms_cart_item")
public class CartItemEntity implements Serializable {
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
	@ApiModelProperty(name = "productId",value = "")
	private Long productId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "productSkuId",value = "")
	private Long productSkuId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "memberId",value = "")
	private Long memberId;
	/**
	 * 购买数量
	 */
	@ApiModelProperty(name = "quantity",value = "购买数量")
	private Integer quantity;
	/**
	 * 添加到购物车的价格
	 */
	@ApiModelProperty(name = "price",value = "添加到购物车的价格")
	private BigDecimal price;
	/**
	 * 销售属性1
	 */
	@ApiModelProperty(name = "sp1",value = "销售属性1")
	private String sp1;
	/**
	 * 销售属性2
	 */
	@ApiModelProperty(name = "sp2",value = "销售属性2")
	private String sp2;
	/**
	 * 销售属性3
	 */
	@ApiModelProperty(name = "sp3",value = "销售属性3")
	private String sp3;
	/**
	 * 商品主图
	 */
	@ApiModelProperty(name = "productPic",value = "商品主图")
	private String productPic;
	/**
	 * 商品名称
	 */
	@ApiModelProperty(name = "productName",value = "商品名称")
	private String productName;
	/**
	 * 商品副标题（卖点）
	 */
	@ApiModelProperty(name = "productSubTitle",value = "商品副标题（卖点）")
	private String productSubTitle;
	/**
	 * 商品sku条码
	 */
	@ApiModelProperty(name = "productSkuCode",value = "商品sku条码")
	private String productSkuCode;
	/**
	 * 会员昵称
	 */
	@ApiModelProperty(name = "memberNickname",value = "会员昵称")
	private String memberNickname;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(name = "createDate",value = "创建时间")
	private Date createDate;
	/**
	 * 修改时间
	 */
	@ApiModelProperty(name = "modifyDate",value = "修改时间")
	private Date modifyDate;
	/**
	 * 是否删除
	 */
	@ApiModelProperty(name = "deleteStatus",value = "是否删除")
	private Integer deleteStatus;
	/**
	 * 商品分类
	 */
	@ApiModelProperty(name = "productCategoryId",value = "商品分类")
	private Long productCategoryId;
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
	 * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
	 */
	@ApiModelProperty(name = "productAttr",value = "商品销售属性:[{key:颜色,value:颜色},{key:容量,value:4G}]")
	private String productAttr;

}
