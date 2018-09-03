package com.jacliu.test.platformOutsideInterfaces.in.aprche.vo.req;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "orderListReq")
public class OrderListReq {

	/**
	 * 承运商代号 长度: 20
	 */
	@ApiModelProperty(value = "公司代号")
	private String companyNo;

	@ApiModelProperty(value = "订单代号")
	private String orderNo;

	/**
	 * @return the companyNo
	 */
	public String getCompanyNo() {
		return this.companyNo;
	}

	/**
	 * @param companyNo
	 *            the companyNo to set
	 */
	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderNo() {
		return orderNo;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}
