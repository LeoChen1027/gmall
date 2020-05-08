package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spuͼƬ
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-08 15:32:00
 */
@ApiModel
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private Long id;
	/**
	 * spu_id
	 */
	@ApiModelProperty(name = "spuId",value = "spu_id")
	private Long spuId;
	/**
	 * ͼƬ��
	 */
	@ApiModelProperty(name = "imgName",value = "ͼƬ��")
	private String imgName;
	/**
	 * ͼƬ��ַ
	 */
	@ApiModelProperty(name = "imgUrl",value = "ͼƬ��ַ")
	private String imgUrl;
	/**
	 * ˳��
	 */
	@ApiModelProperty(name = "imgSort",value = "˳��")
	private Integer imgSort;
	/**
	 * �Ƿ�Ĭ��ͼ
	 */
	@ApiModelProperty(name = "defaultImg",value = "�Ƿ�Ĭ��ͼ")
	private Integer defaultImg;

}
