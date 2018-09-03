package com.jacliu.test.platformOutsideInterfaces.common.web.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "s_oms_config")
public class SOmsConfig {

	public SOmsConfig() {
		super();
	}

	public SOmsConfig(String omsAppid) {
		super();
		this.omsAppid = omsAppid;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**
	 * oms系统对接appkey
	 */
	@Column(name = "oms_appkey")
	private String omsAppkey;

	/**
	 * oms系统对接url
	 */
	@Column(name = "oms_url")
	private String omsUrl;

	/**
	 * oms系统对接apiVer
	 */
	@Column(name = "oms_api_ver")
	private String omsApiVer;

	/**
	 * oms系统对接appid
	 */
	@Column(name = "oms_appid")
	private String omsAppid;

	/**
	 * oms系统对接secret
	 */
	@Column(name = "oms_secret")
	private String omsSecret;

	/**
	 * oms系统对接token
	 */
	@Column(name = "oms_token")
	private String omsToken;

	/**
	 * 是否删除,0未删除 1删除
	 */
	@Column(name = "is_del")
	private Boolean isDel;

	/**
	 * 预留：第三方ip白名单【用于控制哪些ip域名可以访问oms系统】
	 */
	@Column(name = "thrid_hosts")
	private String thridHosts;

	/**
	 * 预留：对接方式【0:普通；1：增值服务】
	 */
	@Column(name = "interface_type")
	private Integer interfaceType;

	private String remark;

	/**
	 * 创建者
	 */
	@Column(name = "create_user")
	private String createUser;

	/**
	 * 修改者
	 */
	@Column(name = "update_user")
	private String updateUser;

	/**
	 * 创建时间(默认系统时间)
	 */
	@Column(name = "gmt_modified")
	private Date gmtModified;

	/**
	 * 修改时间
	 */
	@Column(name = "gmt_create")
	private Date gmtCreate;

	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取oms系统对接appkey
	 *
	 * @return oms_appkey - oms系统对接appkey
	 */
	public String getOmsAppkey() {
		return omsAppkey;
	}

	/**
	 * 设置oms系统对接appkey
	 *
	 * @param omsAppkey
	 *            oms系统对接appkey
	 */
	public void setOmsAppkey(String omsAppkey) {
		this.omsAppkey = omsAppkey;
	}

	/**
	 * 获取oms系统对接url
	 *
	 * @return oms_url - oms系统对接url
	 */
	public String getOmsUrl() {
		return omsUrl;
	}

	/**
	 * 设置oms系统对接url
	 *
	 * @param omsUrl
	 *            oms系统对接url
	 */
	public void setOmsUrl(String omsUrl) {
		this.omsUrl = omsUrl;
	}

	/**
	 * 获取oms系统对接apiVer
	 *
	 * @return oms_api_ver - oms系统对接apiVer
	 */
	public String getOmsApiVer() {
		return omsApiVer;
	}

	/**
	 * 设置oms系统对接apiVer
	 *
	 * @param omsApiVer
	 *            oms系统对接apiVer
	 */
	public void setOmsApiVer(String omsApiVer) {
		this.omsApiVer = omsApiVer;
	}

	/**
	 * 获取oms系统对接appid
	 *
	 * @return oms_appid - oms系统对接appid
	 */
	public String getOmsAppid() {
		return omsAppid;
	}

	/**
	 * 设置oms系统对接appid
	 *
	 * @param omsAppid
	 *            oms系统对接appid
	 */
	public void setOmsAppid(String omsAppid) {
		this.omsAppid = omsAppid;
	}

	/**
	 * 获取oms系统对接secret
	 *
	 * @return oms_secret - oms系统对接secret
	 */
	public String getOmsSecret() {
		return omsSecret;
	}

	/**
	 * 设置oms系统对接secret
	 *
	 * @param omsSecret
	 *            oms系统对接secret
	 */
	public void setOmsSecret(String omsSecret) {
		this.omsSecret = omsSecret;
	}

	/**
	 * 获取oms系统对接token
	 *
	 * @return oms_token - oms系统对接token
	 */
	public String getOmsToken() {
		return omsToken;
	}

	/**
	 * 设置oms系统对接token
	 *
	 * @param omsToken
	 *            oms系统对接token
	 */
	public void setOmsToken(String omsToken) {
		this.omsToken = omsToken;
	}

	/**
	 * 获取是否删除,0未删除 1删除
	 *
	 * @return is_del - 是否删除,0未删除 1删除
	 */
	public Boolean getIsDel() {
		return isDel;
	}

	/**
	 * 设置是否删除,0未删除 1删除
	 *
	 * @param isDel
	 *            是否删除,0未删除 1删除
	 */
	public void setIsDel(Boolean isDel) {
		this.isDel = isDel;
	}

	/**
	 * 获取预留：第三方ip白名单【用于控制哪些ip域名可以访问oms系统】
	 *
	 * @return thrid_hosts - 预留：第三方ip白名单【用于控制哪些ip域名可以访问oms系统】
	 */
	public String getThridHosts() {
		return thridHosts;
	}

	/**
	 * 设置预留：第三方ip白名单【用于控制哪些ip域名可以访问oms系统】
	 *
	 * @param thridHosts
	 *            预留：第三方ip白名单【用于控制哪些ip域名可以访问oms系统】
	 */
	public void setThridHosts(String thridHosts) {
		this.thridHosts = thridHosts;
	}

	/**
	 * 获取预留：对接方式【0:普通；1：增值服务】
	 *
	 * @return interface_type - 预留：对接方式【0:普通；1：增值服务】
	 */
	public Integer getInterfaceType() {
		return interfaceType;
	}

	/**
	 * 设置预留：对接方式【0:普通；1：增值服务】
	 *
	 * @param interfaceType
	 *            预留：对接方式【0:普通；1：增值服务】
	 */
	public void setInterfaceType(Integer interfaceType) {
		this.interfaceType = interfaceType;
	}

	/**
	 * @return remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 获取创建者
	 *
	 * @return create_user - 创建者
	 */
	public String getCreateUser() {
		return createUser;
	}

	/**
	 * 设置创建者
	 *
	 * @param createUser
	 *            创建者
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	/**
	 * 获取修改者
	 *
	 * @return update_user - 修改者
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * 设置修改者
	 *
	 * @param updateUser
	 *            修改者
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * 获取创建时间(默认系统时间)
	 *
	 * @return gmt_modified - 创建时间(默认系统时间)
	 */
	public Date getGmtModified() {
		return gmtModified;
	}

	/**
	 * 设置创建时间(默认系统时间)
	 *
	 * @param gmtModified
	 *            创建时间(默认系统时间)
	 */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	/**
	 * 获取修改时间
	 *
	 * @return gmt_create - 修改时间
	 */
	public Date getGmtCreate() {
		return gmtCreate;
	}

	/**
	 * 设置修改时间
	 *
	 * @param gmtCreate
	 *            修改时间
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
}