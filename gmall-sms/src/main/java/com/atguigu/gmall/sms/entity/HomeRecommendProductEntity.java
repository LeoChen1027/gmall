package com.atguigu.gmall.sms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 人气推荐商品表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 14:17:21
 */
@ApiModel
@Data
@TableName("sms_home_recommend_product")
public class HomeRecommendProductEntity implements Serializable {
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
	@ApiModelProperty(name = "productName",value = "")
	private String productName;
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
