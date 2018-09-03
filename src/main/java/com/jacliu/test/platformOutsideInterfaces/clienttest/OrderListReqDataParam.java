package com.jacliu.test.platformOutsideInterfaces.clienttest;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * OrderListReqParam
 * 
 */
public class OrderListReqDataParam {
	/**
	 * 承运商代号 长度: 20
	 */
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