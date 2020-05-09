package com.atguigu.gmall.ums.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员任务表
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-05-09 15:17:12
 */
@ApiModel
@Data
@TableName("ums_member_task")
public class MemberTaskEntity implements Serializable {
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
	@ApiModelProperty(name = "name",value = "")
	private String name;
	/**
	 * 赠送成长值
	 */
	@ApiModelProperty(name = "growth",value = "赠送成长值")
	private Integer growth;
	/**
	 * 赠送积分
	 */
	@ApiModelProperty(name = "intergration",value = "赠送积分")
	private Integer intergration;
	/**
	 * 任务类型：0->新手任务；1->日常任务
	 */
	@ApiModelProperty(name = "type",value = "任务类型：0->新手任务；1->日常任务")
	private Integer type;

}
