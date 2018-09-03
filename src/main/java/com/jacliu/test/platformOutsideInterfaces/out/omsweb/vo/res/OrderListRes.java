package com.jacliu.test.platformOutsideInterfaces.out.omsweb.vo.res;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class OrderListRes {

	private String orderNum;
	private String companyNo;

	public OrderListRes() {
		super();
	}

	public OrderListRes(String orderNum, String companyNo) {
		super();
		this.orderNum = orderNum;
		this.companyNo = companyNo;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}
