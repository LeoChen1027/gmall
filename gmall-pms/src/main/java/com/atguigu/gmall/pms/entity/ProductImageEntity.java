package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品图片表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 13:29:08
 */
@ApiModel
@Data
@TableName("pms_product_image")
public class ProductImageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "编号")
	private Long id;
	/**
	 * 商品id
	 */
	@ApiModelProperty(name = "productId",value = "商品id")
	private Long productId;
	/**
	 * 图片名称
	 */
	@ApiModelProperty(name = "imgName",value = "图片名称")
	private String imgName;
	/**
	 * 图片路径
	 */
	@ApiModelProperty(name = "imgUrl",value = "图片路径")
	private String imgUrl;

}
