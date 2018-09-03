package com.jacliu.test.platformOutsideInterfaces.in.tongtool.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "s_user")
public class SUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户账号
     */
    @Column(name = "user_no")
    private String userNo;

    /**
     * 用户名称
     */
    private String nickname;

    /**
     * 用户密码
     */
    private String password;

    /**
     * （0.普通账号，1.员工账号）
     */
    @Column(name = "account_type")
    private Integer accountType;

    /**
     * 注册手机号
     */
    private String mobile;

    private String email;

    /**
     * 用户状态 1启用  2禁用
     */
    private Byte status;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 所属站点代号
     */
    private String stano;

    /**
     * 上次登录时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

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
     * 获取用户账号
     *
     * @return user_no - 用户账号
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * 设置用户账号
     *
     * @param userNo 用户账号
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    /**
     * 获取用户名称
     *
     * @return nickname - 用户名称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置用户名称
     *
     * @param nickname 用户名称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取（0.普通账号，1.员工账号）
     *
     * @return account_type - （0.普通账号，1.员工账号）
     */
    public Integer getAccountType() {
        return accountType;
    }

    /**
     * 设置（0.普通账号，1.员工账号）
     *
     * @param accountType （0.普通账号，1.员工账号）
     */
    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    /**
     * 获取注册手机号
     *
     * @return mobile - 注册手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置注册手机号
     *
     * @param mobile 注册手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取用户状态 1启用  2禁用
     *
     * @return status - 用户状态 1启用  2禁用
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置用户状态 1启用  2禁用
     *
     * @param status 用户状态 1启用  2禁用
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取修改时间
     *
     * @return gmt_modified - 修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置修改时间
     *
     * @param gmtModified 修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 获取创建时间
     *
     * @return gmt_create - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取所属站点代号
     *
     * @return stano - 所属站点代号
     */
    public String getStano() {
        return stano;
    }

    /**
     * 设置所属站点代号
     *
     * @param stano 所属站点代号
     */
    public void setStano(String stano) {
        this.stano = stano;
    }

    /**
     * 获取上次登录时间
     *
     * @return last_login_time - 上次登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置上次登录时间
     *
     * @param lastLoginTime 上次登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}