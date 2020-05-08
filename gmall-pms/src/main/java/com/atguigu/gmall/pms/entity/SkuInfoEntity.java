package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku��Ϣ
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-08 15:32:00
 */
@ApiModel
@Data
@TableName("pms_sku_info")
public class SkuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * skuId
	 */
	@TableId
	@ApiModelProperty(name = "skuId",value = "skuId")
	private Long skuId;
	/**
	 * spuId
	 */
	@ApiModelProperty(name = "spuId",value = "spuId")
	private Long spuId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "skuCode",value = "")
	private String skuCode;
	/**
	 * sku����
	 */
	@ApiModelProperty(name = "skuName",value = "sku����")
	private String skuName;
	/**
	 * sku��������
	 */
	@ApiModelProperty(name = "skuDesc",value = "sku��������")
	private String skuDesc;
	/**
	 * �������id
	 */
	@ApiModelProperty(name = "catalogId",value = "�������id")
	private Long catalogId;
	/**
	 * Ʒ��id
	 */
	@ApiModelProperty(name = "brandId",value = "Ʒ��id")
	private Long brandId;
	/**
	 * Ĭ��ͼƬ
	 */
	@ApiModelProperty(name = "skuDefaultImg",value = "Ĭ��ͼƬ")
	private String skuDefaultImg;
	/**
	 * ����
	 */
	@ApiModelProperty(name = "skuTitle",value = "����")
	private String skuTitle;
	/**
	 * ������
	 */
	@ApiModelProperty(name = "skuSubtitle",value = "������")
	private String skuSubtitle;
	/**
	 * �۸�
	 */
	@ApiModelProperty(name = "price",value = "�۸�")
	private BigDecimal price;
	/**
	 * ����
	 */
	@ApiModelProperty(name = "weight",value = "����")
	private BigDecimal weight;
	/**
	 * ����
	 */
	@ApiModelProperty(name = "saleCount",value = "����")
	private Long saleCount;

}
