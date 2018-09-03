package com.jacliu.test.platformOutsideInterfaces.in.tongtool.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "s_user")
public class SUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * �û��˺�
     */
    @Column(name = "user_no")
    private String userNo;

    /**
     * �û�����
     */
    private String nickname;

    /**
     * �û�����
     */
    private String password;

    /**
     * ��0.��ͨ�˺ţ�1.Ա���˺ţ�
     */
    @Column(name = "account_type")
    private Integer accountType;

    /**
     * ע���ֻ���
     */
    private String mobile;

    private String email;

    /**
     * �û�״̬ 1����  2����
     */
    private Byte status;

    /**
     * �޸�ʱ��
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * ����ʱ��
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * ����վ�����
     */
    private String stano;

    /**
     * �ϴε�¼ʱ��
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
     * ��ȡ�û��˺�
     *
     * @return user_no - �û��˺�
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * �����û��˺�
     *
     * @param userNo �û��˺�
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    /**
     * ��ȡ�û�����
     *
     * @return nickname - �û�����
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * �����û�����
     *
     * @param nickname �û�����
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * ��ȡ�û�����
     *
     * @return password - �û�����
     */
    public String getPassword() {
        return password;
    }

    /**
     * �����û�����
     *
     * @param password �û�����
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ��ȡ��0.��ͨ�˺ţ�1.Ա���˺ţ�
     *
     * @return account_type - ��0.��ͨ�˺ţ�1.Ա���˺ţ�
     */
    public Integer getAccountType() {
        return accountType;
    }

    /**
     * ���ã�0.��ͨ�˺ţ�1.Ա���˺ţ�
     *
     * @param accountType ��0.��ͨ�˺ţ�1.Ա���˺ţ�
     */
    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    /**
     * ��ȡע���ֻ���
     *
     * @return mobile - ע���ֻ���
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * ����ע���ֻ���
     *
     * @param mobile ע���ֻ���
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
     * ��ȡ�û�״̬ 1����  2����
     *
     * @return status - �û�״̬ 1����  2����
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * �����û�״̬ 1����  2����
     *
     * @param status �û�״̬ 1����  2����
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * ��ȡ�޸�ʱ��
     *
     * @return gmt_modified - �޸�ʱ��
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * �����޸�ʱ��
     *
     * @param gmtModified �޸�ʱ��
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return gmt_create - ����ʱ��
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * ���ô���ʱ��
     *
     * @param gmtCreate ����ʱ��
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * ��ȡ����վ�����
     *
     * @return stano - ����վ�����
     */
    public String getStano() {
        return stano;
    }

    /**
     * ��������վ�����
     *
     * @param stano ����վ�����
     */
    public void setStano(String stano) {
        this.stano = stano;
    }

    /**
     * ��ȡ�ϴε�¼ʱ��
     *
     * @return last_login_time - �ϴε�¼ʱ��
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * �����ϴε�¼ʱ��
     *
     * @param lastLoginTime �ϴε�¼ʱ��
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}