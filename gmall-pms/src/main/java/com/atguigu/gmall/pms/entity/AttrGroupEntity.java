package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ���Է���
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-08 15:32:00
 */
@ApiModel
@Data
@TableName("pms_attr_group")
public class AttrGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ����id
	 */
	@TableId
	@ApiModelProperty(name = "attrGroupId",value = "����id")
	private Long attrGroupId;
	/**
	 * ����
	 */
	@ApiModelProperty(name = "attrGroupName",value = "����")
	private String attrGroupName;
	/**
	 * ����
	 */
	@ApiModelProperty(name = "sort",value = "����")
	private Integer sort;
	/**
	 * ����
	 */
	@ApiModelProperty(name = "descript",value = "����")
	private String descript;
	/**
	 * ��ͼ��
	 */
	@ApiModelProperty(name = "icon",value = "��ͼ��")
	private String icon;
	/**
	 * �������id
	 */
	@ApiModelProperty(name = "catelogId",value = "�������id")
	private Long catelogId;

}
