package com.chengyu.core.domain.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class OrderAddForm {

	@ApiModelProperty(value = "备注")
	private String remark;

	@ApiModelProperty(value = "优惠券ID")
	private Integer couponId;
	
	@ApiModelProperty(value = "[skuId:商品skuId,num:购买数量]", required = true)
	@NotNull(message = "请选择购买商品")
	private String goodsDetail;

	@ApiModelProperty(value = "购物车ID集合,用户清空购物车")
	private String carIds;
}
