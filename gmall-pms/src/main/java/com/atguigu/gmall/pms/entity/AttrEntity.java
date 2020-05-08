package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ��Ʒ����
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-08 15:32:00
 */
@ApiModel
@Data
@TableName("pms_attr")
public class AttrEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ����id
	 */
	@TableId
	@ApiModelProperty(name = "attrId",value = "����id")
	private Long attrId;
	/**
	 * ������
	 */
	@ApiModelProperty(name = "attrName",value = "������")
	private String attrName;
	/**
	 * �Ƿ���Ҫ����[0-����Ҫ��1-��Ҫ]
	 */
	@ApiModelProperty(name = "searchType",value = "�Ƿ���Ҫ����[0-����Ҫ��1-��Ҫ]")
	private Integer searchType;
	/**
	 * ֵ����[0-Ϊ����ֵ��1-����ѡ����ֵ]
	 */
	@ApiModelProperty(name = "valueType",value = "ֵ����[0-Ϊ����ֵ��1-����ѡ����ֵ]")
	private Integer valueType;
	/**
	 * ����ͼ��
	 */
	@ApiModelProperty(name = "icon",value = "����ͼ��")
	private String icon;
	/**
	 * ��ѡֵ�б�[�ö��ŷָ�]
	 */
	@ApiModelProperty(name = "valueSelect",value = "��ѡֵ�б�[�ö��ŷָ�]")
	private String valueSelect;
	/**
	 * ��������[0-�������ԣ�1-�������ԣ�2-���������������ǻ�������]
	 */
	@ApiModelProperty(name = "attrType",value = "��������[0-�������ԣ�1-�������ԣ�2-���������������ǻ�������]")
	private Integer attrType;
	/**
	 * ����״̬[0 - ���ã�1 - ����]
	 */
	@ApiModelProperty(name = "enable",value = "����״̬[0 - ���ã�1 - ����]")
	private Long enable;
	/**
	 * �������
	 */
	@ApiModelProperty(name = "catelogId",value = "�������")
	private Long catelogId;
	/**
	 * ����չʾ���Ƿ�չʾ�ڽ����ϣ�0-�� 1-�ǡ�����sku����Ȼ���Ե���
	 */
	@ApiModelProperty(name = "showDesc",value = "����չʾ���Ƿ�չʾ�ڽ����ϣ�0-�� 1-�ǡ�����sku����Ȼ���Ե���")
	private Integer showDesc;

}
