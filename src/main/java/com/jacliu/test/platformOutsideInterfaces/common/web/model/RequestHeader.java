package com.jacliu.test.platformOutsideInterfaces.common.web.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("请求头信息")
public class RequestHeader {

	@ApiModelProperty(hidden = true, value = "App识别代码", example = "omsWebAppid")
	private String appid; // String App识别代码
	@ApiModelProperty(hidden = true, value = "设备号", example = "tester")
	private String device_id; // String //设备号
	@ApiModelProperty(hidden = true, value = "请求命令", example = "1.4")
	private String command;// String //请求命令(远程方法名称) Login(登录)
	@ApiModelProperty(hidden = true, value = "请求命令的版本", example = "1.4")
	private String version; // String //请求命令的版本，决定Body实体的成员 1.0
	@ApiModelProperty(hidden = true, value = "登录令牌", example = "")
	private String token; // String //登录令牌(类似于SessionID)
	@ApiModelProperty(hidden = true, value = "数字签名", example = "caa798c38ce655b7")
	private String sign; // String //数字签名MD5_16(appid+body+command+device_id+ encrypt_type +token+vesion
							// appkey)
	@ApiModelProperty(hidden = true, value = "加密方式", example = "10")
	private int encrypt_type; // int //请求的参数实体加密方式 0

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getDevice_id() {
		return device_id;
	}

	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public int getEncrypt_type() {
		return encrypt_type;
	}

	public void setEncrypt_type(int encrypt_type) {
		this.encrypt_type = encrypt_type;
	}

	@Override
	public String toString() {
		return "RequestHeader [appid=" + appid + ", device_id=" + device_id + ", command=" + command + ", version="
				+ version + ", token=" + token + ", sign=" + sign + ", encrypt_type=" + encrypt_type + "]";
	}

}
