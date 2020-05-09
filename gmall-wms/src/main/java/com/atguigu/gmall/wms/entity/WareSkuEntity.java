package com.atguigu.gmall.wms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:47:16
 */
@ApiModel
@Data
@TableName("wms_ware_sku")
public class WareSkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "编号")
	private Long id;
	/**
	 * skuid
	 */
	@ApiModelProperty(name = "skuId",value = "skuid")
	private Long skuId;
	/**
	 * 仓库id
	 */
	@ApiModelProperty(name = "warehouseId",value = "仓库id")
	private Long warehouseId;
	/**
	 * 库存数
	 */
	@ApiModelProperty(name = "stock",value = "库存数")
	private Integer stock;
	/**
	 * 存货名称
	 */
	@ApiModelProperty(name = "stockName",value = "存货名称")
	private String stockName;
	/**
	 * 
	 */
	@ApiModelProperty(name = "stockLocked",value = "")
	private Integer stockLocked;

}
