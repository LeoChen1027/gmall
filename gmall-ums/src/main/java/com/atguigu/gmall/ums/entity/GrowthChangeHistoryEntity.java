package com.atguigu.gmall.ums.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 成长值变化历史记录表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@ApiModel
@Data
@TableName("ums_growth_change_history")
public class GrowthChangeHistoryEntity implements Serializable {
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
	 * 
	 */
	@ApiModelProperty(name = "createTime",value = "")
	private Date createTime;
	/**
	 * 改变类型：0->增加；1->减少
	 */
	@ApiModelProperty(name = "changeType",value = "改变类型：0->增加；1->减少")
	private Integer changeType;
	/**
	 * 积分改变数量
	 */
	@ApiModelProperty(name = "changeCount",value = "积分改变数量")
	private Integer changeCount;
	/**
	 * 操作人员
	 */
	@ApiModelProperty(name = "operateMan",value = "操作人员")
	private String operateMan;
	/**
	 * 操作备注
	 */
	@ApiModelProperty(name = "operateNote",value = "操作备注")
	private String operateNote;
	/**
	 * 积分来源：0->购物；1->管理员修改
	 */
	@ApiModelProperty(name = "sourceType",value = "积分来源：0->购物；1->管理员修改")
	private Integer sourceType;

}
