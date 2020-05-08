package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ����&���Է������
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-08 15:32:00
 */
@ApiModel
@Data
@TableName("pms_attr_attrgroup_relation")
public class AttrAttrgroupRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private Long id;
	/**
	 * ����id
	 */
	@ApiModelProperty(name = "attrId",value = "����id")
	private Long attrId;
	/**
	 * ���Է���id
	 */
	@ApiModelProperty(name = "attrGroupId",value = "���Է���id")
	private Long attrGroupId;
	/**
	 * ������������
	 */
	@ApiModelProperty(name = "attrSort",value = "������������")
	private Integer attrSort;

}
