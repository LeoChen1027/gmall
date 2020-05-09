package com.atguigu.gmall.sms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 首页推荐品牌表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 14:17:21
 */
@ApiModel
@Data
@TableName("sms_home_brand")
public class HomeBrandEntity implements Serializable {
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
	@ApiModelProperty(name = "brandId",value = "")
	private Long brandId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "brandName",value = "")
	private String brandName;
	/**
	 * 
	 */
	@ApiModelProperty(name = "recommendStatus",value = "")
	private Integer recommendStatus;
	/**
	 * 
	 */
	@ApiModelProperty(name = "sort",value = "")
	private Integer sort;

}
