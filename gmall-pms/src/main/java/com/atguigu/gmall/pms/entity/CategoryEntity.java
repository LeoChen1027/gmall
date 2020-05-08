package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ��Ʒ��������
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-08 15:32:00
 */
@ApiModel
@Data
@TableName("pms_category")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ����id
	 */
	@TableId
	@ApiModelProperty(name = "catId",value = "����id")
	private Long catId;
	/**
	 * ��������
	 */
	@ApiModelProperty(name = "name",value = "��������")
	private String name;
	/**
	 * ������id
	 */
	@ApiModelProperty(name = "parentCid",value = "������id")
	private Long parentCid;
	/**
	 * �㼶
	 */
	@ApiModelProperty(name = "catLevel",value = "�㼶")
	private Integer catLevel;
	/**
	 * �Ƿ���ʾ[0-����ʾ��1��ʾ]
	 */
	@ApiModelProperty(name = "showStatus",value = "�Ƿ���ʾ[0-����ʾ��1��ʾ]")
	private Integer showStatus;
	/**
	 * ����
	 */
	@ApiModelProperty(name = "sort",value = "����")
	private Integer sort;
	/**
	 * ͼ���ַ
	 */
	@ApiModelProperty(name = "icon",value = "ͼ���ַ")
	private String icon;
	/**
	 * ������λ
	 */
	@ApiModelProperty(name = "productUnit",value = "������λ")
	private String productUnit;
	/**
	 * ��Ʒ����
	 */
	@ApiModelProperty(name = "productCount",value = "��Ʒ����")
	private Integer productCount;

}
