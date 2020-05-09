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
@TableName("wms_ware_order_task_detail")
public class WareOrderTaskDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "编号")
	private Long id;
	/**
	 * sku_id
	 */
	@ApiModelProperty(name = "skuId",value = "sku_id")
	private Long skuId;
	/**
	 * sku名称
	 */
	@ApiModelProperty(name = "skuName",value = "sku名称")
	private String skuName;
	/**
	 * 购买个数
	 */
	@ApiModelProperty(name = "skuNums",value = "购买个数")
	private Integer skuNums;
	/**
	 * 工作单编号
	 */
	@ApiModelProperty(name = "taskId",value = "工作单编号")
	private Long taskId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "skuNum",value = "")
	private Integer skuNum;

}
