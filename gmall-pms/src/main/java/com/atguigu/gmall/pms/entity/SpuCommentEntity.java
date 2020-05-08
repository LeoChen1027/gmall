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
@TableName("pms_spu_comment")
public class SpuCommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private Long id;
	/**
	 * sku_id
	 */
	@ApiModelProperty(name = "skuId",value = "sku_id")
	private Long skuId;
	/**
	 * spu_id
	 */
	@ApiModelProperty(name = "spuId",value = "spu_id")
	private Long spuId;
	/**
	 * ��Ʒ����
	 */
	@ApiModelProperty(name = "spuName",value = "��Ʒ����")
	private String spuName;
	/**
	 * ��Ա�ǳ�
	 */
	@ApiModelProperty(name = "memberNickName",value = "��Ա�ǳ�")
	private String memberNickName;
	/**
	 * �Ǽ�
	 */
	@ApiModelProperty(name = "star",value = "�Ǽ�")
	private Integer star;
	/**
	 * ��Աip
	 */
	@ApiModelProperty(name = "memberIp",value = "��Աip")
	private String memberIp;
	/**
	 * ����ʱ��
	 */
	@ApiModelProperty(name = "createTime",value = "����ʱ��")
	private Date createTime;
	/**
	 * ��ʾ״̬[0-����ʾ��1-��ʾ]
	 */
	@ApiModelProperty(name = "showStatus",value = "��ʾ״̬[0-����ʾ��1-��ʾ]")
	private Integer showStatus;
	/**
	 * ����ʱ�������
	 */
	@ApiModelProperty(name = "spuAttributes",value = "����ʱ�������")
	private String spuAttributes;
	/**
	 * ������
	 */
	@ApiModelProperty(name = "likesCount",value = "������")
	private Integer likesCount;
	/**
	 * �ظ���
	 */
	@ApiModelProperty(name = "replyCount",value = "�ظ���")
	private Integer replyCount;
	/**
	 * ����ͼƬ/��Ƶ[json���ݣ�[{type:�ļ�����,url:��Դ·��}]]
	 */
	@ApiModelProperty(name = "resources",value = "����ͼƬ/��Ƶ[json���ݣ�[{type:�ļ�����,url:��Դ·��}]]")
	private String resources;
	/**
	 * ����
	 */
	@ApiModelProperty(name = "content",value = "����")
	private String content;
	/**
	 * �û�ͷ��
	 */
	@ApiModelProperty(name = "memberIcon",value = "�û�ͷ��")
	private String memberIcon;
	/**
	 * ��������[0 - ����Ʒ��ֱ�����ۣ�1 - �����۵Ļظ�]
	 */
	@ApiModelProperty(name = "commentType",value = "��������[0 - ����Ʒ��ֱ�����ۣ�1 - �����۵Ļظ�]")
	private Integer commentType;

}
