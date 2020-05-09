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
@TableName("wms_ware_info")
public class WareInfoEntity implements Serializable {
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
	@ApiModelProperty(name = "name",value = "")
	private String name;
	/**
	 * 
	 */
	@ApiModelProperty(name = "address",value = "")
	private String address;
	/**
	 * 
	 */
	@ApiModelProperty(name = "areacode",value = "")
	private String areacode;

}
