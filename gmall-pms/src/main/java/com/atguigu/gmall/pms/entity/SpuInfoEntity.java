package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu��Ϣ
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-08 15:32:00
 */
@ApiModel
@Data
@TableName("pms_spu_info")
public class SpuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ��Ʒid
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "��Ʒid")
	private Long id;
	/**
	 * ��Ʒ����
	 */
	@ApiModelProperty(name = "spuName",value = "��Ʒ����")
	private String spuName;
	/**
	 * ��Ʒ����
	 */
	@ApiModelProperty(name = "spuDescription",value = "��Ʒ����")
	private String spuDescription;
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
	 * �ϼ�״̬[0 - �¼ܣ�1 - �ϼ�]
	 */
	@ApiModelProperty(name = "publishStatus",value = "�ϼ�״̬[0 - �¼ܣ�1 - �ϼ�]")
	private Integer publishStatus;
	/**
	 * 
	 */
	@ApiModelProperty(name = "createTime",value = "")
	private Date createTime;
	/**
	 * 
	 */
	@ApiModelProperty(name = "updateTime",value = "")
	private Date updateTime;

}
