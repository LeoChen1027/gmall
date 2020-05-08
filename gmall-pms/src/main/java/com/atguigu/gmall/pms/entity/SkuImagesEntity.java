package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * skuͼƬ
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-08 15:32:00
 */
@ApiModel
@Data
@TableName("pms_sku_images")
public class SkuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private Long id;
	/**
	 * sku_id
	 */
	@ApiModelProperty(name = "skuId",value = "sku_id")
	private Long skuId;
	/**
	 * ͼƬ��ַ
	 */
	@ApiModelProperty(name = "imgUrl",value = "ͼƬ��ַ")
	private String imgUrl;
	/**
	 * ����
	 */
	@ApiModelProperty(name = "imgSort",value = "����")
	private Integer imgSort;
	/**
	 * Ĭ��ͼ[0 - ����Ĭ��ͼ��1 - ��Ĭ��ͼ]
	 */
	@ApiModelProperty(name = "defaultImg",value = "Ĭ��ͼ[0 - ����Ĭ��ͼ��1 - ��Ĭ��ͼ]")
	private Integer defaultImg;

}
