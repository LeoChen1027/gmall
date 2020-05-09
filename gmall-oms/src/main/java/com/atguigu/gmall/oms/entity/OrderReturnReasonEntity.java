package com.atguigu.gmall.oms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 退货原因表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:02:51
 */
@ApiModel
@Data
@TableName("oms_order_return_reason")
public class OrderReturnReasonEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Long id;
	/**
	 * 退货类型
	 */
	@ApiModelProperty(name = "name",value = "退货类型")
	private String name;
	/**
	 * 
	 */
	@ApiModelProperty(name = "sort",value = "")
	private Integer sort;
	/**
	 * 状态：0->不启用；1->启用
	 */
	@ApiModelProperty(name = "status",value = "状态：0->不启用；1->启用")
	private Integer status;
	/**
	 * 添加时间
	 */
	@ApiModelProperty(name = "createTime",value = "添加时间")
	private Date createTime;

}
