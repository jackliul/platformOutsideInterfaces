package com.jacliu.test.platformOutsideInterfaces.clienttest;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

/**
 * ClienteleDataItem
 * 
 * @author 蒋彬
 * @version FetchClienteleData_1.0
 * @date 2018年06月02日 增量更新客户资料(PDR-C52121-C52122) 由接口代码生成工具V131072 生成
 */
public class OrderListDataResult {
	/**
	 * 承运商代号 长度: 20
	 */
	@ApiModelProperty(value = "公司代号")
	@NotNull
	private String companyNo;
	/**
	 * 客户代号 长度: 40
	 */
	@ApiModelProperty(value = "客户代号")
	@NotNull
	private String clientNo;
	/**
	 * 客户名称 长度: 40
	 */
	@ApiModelProperty(value = "客户名称")
	@NotNull
	private String clientName;

	public OrderListDataResult() {
		super();
	}

	public OrderListDataResult(@NotNull String companyNo, @NotNull String clientNo, @NotNull String clientName) {
		super();
		this.companyNo = companyNo;
		this.clientNo = clientNo;
		this.clientName = clientName;
	}

	public String getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}

	public String getClientNo() {
		return clientNo;
	}

	public void setClientNo(String clientNo) {
		this.clientNo = clientNo;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

}