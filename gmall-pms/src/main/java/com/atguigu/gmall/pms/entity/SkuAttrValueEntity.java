package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku平台属性值关联表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 13:29:07
 */
@ApiModel
@Data
@TableName("pms_sku_attr_value")
public class SkuAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "编号")
	private Long id;
	/**
	 * 属性id（冗余)
	 */
	@ApiModelProperty(name = "attrId",value = "属性id（冗余)")
	private Long attrId;
	/**
	 * 属性值id
	 */
	@ApiModelProperty(name = "valueId",value = "属性值id")
	private Long valueId;
	/**
	 * skuid
	 */
	@ApiModelProperty(name = "skuId",value = "skuid")
	private Long skuId;

}
