package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Ʒ��
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-08 15:32:00
 */
@ApiModel
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Ʒ��id
	 */
	@TableId
	@ApiModelProperty(name = "brandId",value = "Ʒ��id")
	private Long brandId;
	/**
	 * Ʒ����
	 */
	@ApiModelProperty(name = "name",value = "Ʒ����")
	private String name;
	/**
	 * Ʒ��logo��ַ
	 */
	@ApiModelProperty(name = "logo",value = "Ʒ��logo��ַ")
	private String logo;
	/**
	 * ����
	 */
	@ApiModelProperty(name = "descript",value = "����")
	private String descript;
	/**
	 * ��ʾ״̬[0-����ʾ��1-��ʾ]
	 */
	@ApiModelProperty(name = "showStatus",value = "��ʾ״̬[0-����ʾ��1-��ʾ]")
	private Integer showStatus;
	/**
	 * ��������ĸ
	 */
	@ApiModelProperty(name = "firstLetter",value = "��������ĸ")
	private String firstLetter;
	/**
	 * ����
	 */
	@ApiModelProperty(name = "sort",value = "����")
	private Integer sort;

}
