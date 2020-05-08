package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu����ֵ
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-08 15:32:00
 */
@ApiModel
@Data
@TableName("pms_product_attr_value")
public class ProductAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private Long id;
	/**
	 * ��Ʒid
	 */
	@ApiModelProperty(name = "spuId",value = "��Ʒid")
	private Long spuId;
	/**
	 * ����id
	 */
	@ApiModelProperty(name = "attrId",value = "����id")
	private Long attrId;
	/**
	 * ������
	 */
	@ApiModelProperty(name = "attrName",value = "������")
	private String attrName;
	/**
	 * ����ֵ
	 */
	@ApiModelProperty(name = "attrValue",value = "����ֵ")
	private String attrValue;
	/**
	 * ˳��
	 */
	@ApiModelProperty(name = "attrSort",value = "˳��")
	private Integer attrSort;
	/**
	 * ����չʾ���Ƿ�չʾ�ڽ����ϣ�0-�� 1-�ǡ�
	 */
	@ApiModelProperty(name = "quickShow",value = "����չʾ���Ƿ�չʾ�ڽ����ϣ�0-�� 1-�ǡ�")
	private Integer quickShow;

}
