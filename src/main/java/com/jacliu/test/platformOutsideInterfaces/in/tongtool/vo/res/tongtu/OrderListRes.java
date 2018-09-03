package com.jacliu.test.platformOutsideInterfaces.in.tongtool.vo.res.tongtu;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class OrderListRes {

	private String ttOrderNum;
	private String ttCompanyNo;

	public OrderListRes() {
		super();
	}

	public OrderListRes(String ttOrderNum, String ttCompanyNo) {
		super();
		this.ttOrderNum = ttOrderNum;
		this.ttCompanyNo = ttCompanyNo;
	}

	public String getTtOrderNum() {
		return ttOrderNum;
	}

	public void setTtOrderNum(String ttOrderNum) {
		this.ttOrderNum = ttOrderNum;
	}

	public String getTtCompanyNo() {
		return ttCompanyNo;
	}

	public void setTtCompanyNo(String ttCompanyNo) {
		this.ttCompanyNo = ttCompanyNo;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}
