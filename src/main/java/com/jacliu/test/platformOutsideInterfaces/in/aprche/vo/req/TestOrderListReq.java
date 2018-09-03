package com.jacliu.test.platformOutsideInterfaces.in.aprche.vo.req;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "testOrderListReq")
public class TestOrderListReq {

	/**
	 * 承运商代号 长度: 20
	 */
	@ApiModelProperty(value = "公司代号")
	private String companyNo;

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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}
