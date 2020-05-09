package com.atguigu.gmall.oms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 公司收发货地址表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:02:51
 */
@ApiModel
@Data
@TableName("oms_company_address")
public class CompanyAddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Long id;
	/**
	 * 地址名称
	 */
	@ApiModelProperty(name = "addressName",value = "地址名称")
	private String addressName;
	/**
	 * 默认发货地址：0->否；1->是
	 */
	@ApiModelProperty(name = "sendStatus",value = "默认发货地址：0->否；1->是")
	private Integer sendStatus;
	/**
	 * 是否默认收货地址：0->否；1->是
	 */
	@ApiModelProperty(name = "receiveStatus",value = "是否默认收货地址：0->否；1->是")
	private Integer receiveStatus;
	/**
	 * 收发货人姓名
	 */
	@ApiModelProperty(name = "name",value = "收发货人姓名")
	private String name;
	/**
	 * 收货人电话
	 */
	@ApiModelProperty(name = "phone",value = "收货人电话")
	private String phone;
	/**
	 * 省/直辖市
	 */
	@ApiModelProperty(name = "province",value = "省/直辖市")
	private String province;
	/**
	 * 市
	 */
	@ApiModelProperty(name = "city",value = "市")
	private String city;
	/**
	 * 区
	 */
	@ApiModelProperty(name = "region",value = "区")
	private String region;
	/**
	 * 详细地址
	 */
	@ApiModelProperty(name = "detailAddress",value = "详细地址")
	private String detailAddress;

}
