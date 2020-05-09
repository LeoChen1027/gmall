package com.atguigu.gmall.ums.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员收货地址表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@ApiModel
@Data
@TableName("ums_member_receive_address")
public class MemberReceiveAddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Long id;
	/**
	 * 
	 */
	@ApiModelProperty(name = "memberId",value = "")
	private Long memberId;
	/**
	 * 收货人名称
	 */
	@ApiModelProperty(name = "name",value = "收货人名称")
	private String name;
	/**
	 * 
	 */
	@ApiModelProperty(name = "phoneNumber",value = "")
	private String phoneNumber;
	/**
	 * 是否为默认
	 */
	@ApiModelProperty(name = "defaultStatus",value = "是否为默认")
	private Integer defaultStatus;
	/**
	 * 邮政编码
	 */
	@ApiModelProperty(name = "postCode",value = "邮政编码")
	private String postCode;
	/**
	 * 省份/直辖市
	 */
	@ApiModelProperty(name = "province",value = "省份/直辖市")
	private String province;
	/**
	 * 城市
	 */
	@ApiModelProperty(name = "city",value = "城市")
	private String city;
	/**
	 * 区
	 */
	@ApiModelProperty(name = "region",value = "区")
	private String region;
	/**
	 * 详细地址(街道)
	 */
	@ApiModelProperty(name = "detailAddress",value = "详细地址(街道)")
	private String detailAddress;

}
