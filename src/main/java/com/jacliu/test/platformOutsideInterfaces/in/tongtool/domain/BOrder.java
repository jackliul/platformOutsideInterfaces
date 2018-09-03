package com.jacliu.test.platformOutsideInterfaces.in.tongtool.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_order")
public class BOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 订单号码
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 承运商公司ID
     */
    @Column(name = "carrier_company_id")
    private Integer carrierCompanyId;

    /**
     * 货主公司ID
     */
    @Column(name = "shipper_company_id")
    private Integer shipperCompanyId;

    /**
     * 承运商公司名称
     */
    @Column(name = "carrier_company_name")
    private String carrierCompanyName;

    /**
     * 货主公司名称
     */
    @Column(name = "shipper_company_name")
    private String shipperCompanyName;

    /**
     * 运单单号
     */
    @Column(name = "waybill_no")
    private String waybillNo;

    /**
     * 转单单号
     */
    @Column(name = "trans_no")
    private String transNo;

    /**
     * 客户单号
     */
    @Column(name = "ref_no")
    private String refNo;

    /**
     * 运输分类
     */
    @Column(name = "trans_sort")
    private String transSort;

    /**
     * 运输方式
     */
    @Column(name = "trans_type")
    private String transType;

    /**
     * 承运商站点代号
     */
    private String stano;

    /**
     * 承运商站点名称
     */
    private String station;

    /**
     * 承运商站点英文名
     */
    @Column(name = "station_en")
    private String stationEn;

    /**
     * 件数
     */
    private Integer pcs;

    private BigDecimal weight;

    /**
     * 实际重量
     */
    @Column(name = "actual_weight")
    private BigDecimal actualWeight;

    /**
     * 体积重/材积重
     */
    @Column(name = "vol_weight")
    private BigDecimal volWeight;

    /**
     * 计费重/收费重(max(actual_weight, vol_weight))
     */
    @Column(name = "bill_weight")
    private BigDecimal billWeight;

    /**
     * 货物类型
     */
    @Column(name = "goods_type")
    private String goodsType;

    /**
     * 是否购买保险 1否，2是
     */
    @Column(name = "is_insurance")
    private Byte isInsurance;

    /**
     * 保价金额
     */
    @Column(name = "declare_value")
    private String declareValue;

    /**
     * 代垫款
     */
    private BigDecimal advance;

    /**
     * 付款方式
     */
    @Column(name = "pay_type")
    private String payType;

    /**
     * 货物品名
     */
    @Column(name = "cargo_name")
    private String cargoName;

    /**
     * 包装类型
     */
    @Column(name = "package_type")
    private String packageType;

    /**
     * 代垫款币别
     */
    @Column(name = "currency_type")
    private String currencyType;

    /**
     * 英文品名
     */
    @Column(name = "cargo_name_en")
    private String cargoNameEn;

    /**
     * 申报价值
     */
    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    /**
     * 税金支付
     */
    private String payment;

    /**
     * 1是  2 否
     */
    @Column(name = "is_problem")
    private Byte isProblem;

    /**
     * 完成时间
     */
    @Column(name = "finish_time")
    private Date finishTime;

    /**
     * 订单状态  1.待补录2.待审核3.待修正4.待交寄5.待出货6.运输中7.已签收8.已完成9.已取消  
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 订单申报类型1(出口)2(进口)
     */
    @Column(name = "declare_type")
    private Byte declareType;

    /**
     * 寄件人姓名
     */
    @Column(name = "sender_name")
    private String senderName;

    /**
     * 寄件人公司名称
     */
    @Column(name = "sender_company_name")
    private String senderCompanyName;

    /**
     * 寄件人电话
     */
    @Column(name = "sender_tel")
    private String senderTel;

    /**
     * 寄件人邮编
     */
    @Column(name = "sender_postcode")
    private String senderPostcode;

    /**
     * 寄件人 州/省
     */
    @Column(name = "sender_province")
    private String senderProvince;

    /**
     * 寄件人城市
     */
    @Column(name = "sender_city")
    private String senderCity;

    /**
     * 寄件人详细地址
     */
    @Column(name = "sender_addr")
    private String senderAddr;

    /**
     * 寄件人地址2
     */
    @Column(name = "sender_addtuo")
    private String senderAddtuo;

    /**
     * 寄件地址3
     */
    @Column(name = "sender_addthree")
    private String senderAddthree;

    /**
     * 寄件人邮箱
     */
    @Column(name = "sender_email")
    private String senderEmail;

    /**
     * 寄件信息税金支付
     */
    @Column(name = "sender_payment")
    private String senderPayment;

    /**
     * 收件人姓名
     */
    @Column(name = "receiver_name")
    private String receiverName;

    /**
     * 收件人公司名称
     */
    @Column(name = "receiver_company_name")
    private String receiverCompanyName;

    /**
     * 收件人电话
     */
    @Column(name = "receiver_tel")
    private String receiverTel;

    /**
     * 收件人邮编
     */
    @Column(name = "receiver_postcode")
    private String receiverPostcode;

    /**
     * 收件人国家
     */
    @Column(name = "receiver_country")
    private String receiverCountry;

    /**
     * 收件人 州/省
     */
    @Column(name = "receiver_province")
    private String receiverProvince;

    /**
     * 收件人城市
     */
    @Column(name = "receiver_city")
    private String receiverCity;

    /**
     * 收件人详细地址
     */
    @Column(name = "receiver_addr")
    private String receiverAddr;

    /**
     * 收件人地址2
     */
    @Column(name = "receiver_addtuo")
    private String receiverAddtuo;

    /**
     * 收件人地址3
     */
    @Column(name = "receiver_addthree")
    private String receiverAddthree;

    /**
     * 收件人邮箱
     */
    @Column(name = "receiver_email")
    private String receiverEmail;

    /**
     * 收件信息税金支付
     */
    @Column(name = "recriver_payment")
    private String recriverPayment;

    /**
     * 订单创建者用户No
     */
    @Column(name = "create_user_no")
    private String createUserNo;

    /**
     * 审核人
     */
    @Column(name = "check_user_no")
    private String checkUserNo;

    /**
     * 订单修改者用户No
     */
    @Column(name = "update_user_no")
    private String updateUserNo;

    /**
     * 1是 0否
     */
    @Column(name = "is_del")
    private Boolean isDel;

    /**
     * 比别类型
     */
    @Column(name = "valuation_cusrrency")
    private String valuationCusrrency;

    /**
     * 收件统编
     */
    @Column(name = "receiver_universal_compile")
    private String receiverUniversalCompile;

    /**
     * 目的地国家
     */
    @Column(name = "dest_no")
    private String destNo;

    /**
     * 发送人国家
     */
    @Column(name = "sender_country")
    private String senderCountry;

    /**
     * 审核时间
     */
    @Column(name = "check_time")
    private Date checkTime;

    /**
     * 客户代号
     */
    @Column(name = "customer_code")
    private String customerCode;

    /**
     * 客户名称
     */
    @Column(name = "customer_name")
    private String customerName;

    /**
     * 客户货主ID
     */
    @Column(name = "customer_shipper_company_id")
    private Integer customerShipperCompanyId;

    /**
     * 客户货主公司名称
     */
    @Column(name = "customer_shipper_company_name")
    private String customerShipperCompanyName;

    /**
     * 下单站点代号
     */
    @Column(name = "order_stano")
    private String orderStano;

    /**
     * 下单站点名称
     */
    @Column(name = "order_station")
    private String orderStation;

    /**
     * 下单站点英文名称
     */
    @Column(name = "order_station_en")
    private String orderStationEn;

    /**
     * 订单类型 (1 普通订单 2 指定件 3 草稿订单）
     */
    private Byte type;

    /**
     * 审核不通过原因
     */
    private String amendment;

    /**
     * 取消类型(1待审核取消，2代交寄取消，3待出货）
     */
    @Column(name = "initiation_type")
    private Byte initiationType;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 渠道信息寄件人
     */
    @Column(name = "trans_sender_name")
    private String transSenderName;

    /**
     * 渠道信息寄件公司
     */
    @Column(name = "trans_sender_company_name")
    private String transSenderCompanyName;

    /**
     * 渠道信息寄件电话
     */
    @Column(name = "trans_sender_tel")
    private String transSenderTel;

    /**
     * 渠道税金支付
     */
    @Column(name = "trans_sender_payment")
    private String transSenderPayment;

    /**
     * 渠道邮编
     */
    @Column(name = "trans_sender_postcode")
    private String transSenderPostcode;

    /**
     * 渠道寄件邮箱
     */
    @Column(name = "trans_sender_email")
    private String transSenderEmail;

    /**
     * 渠道信息寄件地址
     */
    @Column(name = "trans_sender_addr")
    private String transSenderAddr;

    /**
     * 渠道地址2
     */
    @Column(name = "trans_sender_addtuo")
    private String transSenderAddtuo;

    /**
     * 渠道地址3
     */
    @Column(name = "trans_sender_addthree")
    private String transSenderAddthree;

    /**
     * 渠道信息洲/省
     */
    @Column(name = "trans_sender_province")
    private String transSenderProvince;

    /**
     * 渠道信息寄件城市
     */
    @Column(name = "trans_sender_city")
    private String transSenderCity;

    /**
     * 渠道信息寄件国家
     */
    @Column(name = "trans_sender_country")
    private String transSenderCountry;

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
     * 获取订单号码
     *
     * @return order_no - 订单号码
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单号码
     *
     * @param orderNo 订单号码
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取承运商公司ID
     *
     * @return carrier_company_id - 承运商公司ID
     */
    public Integer getCarrierCompanyId() {
        return carrierCompanyId;
    }

    /**
     * 设置承运商公司ID
     *
     * @param carrierCompanyId 承运商公司ID
     */
    public void setCarrierCompanyId(Integer carrierCompanyId) {
        this.carrierCompanyId = carrierCompanyId;
    }

    /**
     * 获取货主公司ID
     *
     * @return shipper_company_id - 货主公司ID
     */
    public Integer getShipperCompanyId() {
        return shipperCompanyId;
    }

    /**
     * 设置货主公司ID
     *
     * @param shipperCompanyId 货主公司ID
     */
    public void setShipperCompanyId(Integer shipperCompanyId) {
        this.shipperCompanyId = shipperCompanyId;
    }

    /**
     * 获取承运商公司名称
     *
     * @return carrier_company_name - 承运商公司名称
     */
    public String getCarrierCompanyName() {
        return carrierCompanyName;
    }

    /**
     * 设置承运商公司名称
     *
     * @param carrierCompanyName 承运商公司名称
     */
    public void setCarrierCompanyName(String carrierCompanyName) {
        this.carrierCompanyName = carrierCompanyName;
    }

    /**
     * 获取货主公司名称
     *
     * @return shipper_company_name - 货主公司名称
     */
    public String getShipperCompanyName() {
        return shipperCompanyName;
    }

    /**
     * 设置货主公司名称
     *
     * @param shipperCompanyName 货主公司名称
     */
    public void setShipperCompanyName(String shipperCompanyName) {
        this.shipperCompanyName = shipperCompanyName;
    }

    /**
     * 获取运单单号
     *
     * @return waybill_no - 运单单号
     */
    public String getWaybillNo() {
        return waybillNo;
    }

    /**
     * 设置运单单号
     *
     * @param waybillNo 运单单号
     */
    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }

    /**
     * 获取转单单号
     *
     * @return trans_no - 转单单号
     */
    public String getTransNo() {
        return transNo;
    }

    /**
     * 设置转单单号
     *
     * @param transNo 转单单号
     */
    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    /**
     * 获取客户单号
     *
     * @return ref_no - 客户单号
     */
    public String getRefNo() {
        return refNo;
    }

    /**
     * 设置客户单号
     *
     * @param refNo 客户单号
     */
    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    /**
     * 获取运输分类
     *
     * @return trans_sort - 运输分类
     */
    public String getTransSort() {
        return transSort;
    }

    /**
     * 设置运输分类
     *
     * @param transSort 运输分类
     */
    public void setTransSort(String transSort) {
        this.transSort = transSort;
    }

    /**
     * 获取运输方式
     *
     * @return trans_type - 运输方式
     */
    public String getTransType() {
        return transType;
    }

    /**
     * 设置运输方式
     *
     * @param transType 运输方式
     */
    public void setTransType(String transType) {
        this.transType = transType;
    }

    /**
     * 获取承运商站点代号
     *
     * @return stano - 承运商站点代号
     */
    public String getStano() {
        return stano;
    }

    /**
     * 设置承运商站点代号
     *
     * @param stano 承运商站点代号
     */
    public void setStano(String stano) {
        this.stano = stano;
    }

    /**
     * 获取承运商站点名称
     *
     * @return station - 承运商站点名称
     */
    public String getStation() {
        return station;
    }

    /**
     * 设置承运商站点名称
     *
     * @param station 承运商站点名称
     */
    public void setStation(String station) {
        this.station = station;
    }

    /**
     * 获取承运商站点英文名
     *
     * @return station_en - 承运商站点英文名
     */
    public String getStationEn() {
        return stationEn;
    }

    /**
     * 设置承运商站点英文名
     *
     * @param stationEn 承运商站点英文名
     */
    public void setStationEn(String stationEn) {
        this.stationEn = stationEn;
    }

    /**
     * 获取件数
     *
     * @return pcs - 件数
     */
    public Integer getPcs() {
        return pcs;
    }

    /**
     * 设置件数
     *
     * @param pcs 件数
     */
    public void setPcs(Integer pcs) {
        this.pcs = pcs;
    }

    /**
     * @return weight
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 获取实际重量
     *
     * @return actual_weight - 实际重量
     */
    public BigDecimal getActualWeight() {
        return actualWeight;
    }

    /**
     * 设置实际重量
     *
     * @param actualWeight 实际重量
     */
    public void setActualWeight(BigDecimal actualWeight) {
        this.actualWeight = actualWeight;
    }

    /**
     * 获取体积重/材积重
     *
     * @return vol_weight - 体积重/材积重
     */
    public BigDecimal getVolWeight() {
        return volWeight;
    }

    /**
     * 设置体积重/材积重
     *
     * @param volWeight 体积重/材积重
     */
    public void setVolWeight(BigDecimal volWeight) {
        this.volWeight = volWeight;
    }

    /**
     * 获取计费重/收费重(max(actual_weight, vol_weight))
     *
     * @return bill_weight - 计费重/收费重(max(actual_weight, vol_weight))
     */
    public BigDecimal getBillWeight() {
        return billWeight;
    }

    /**
     * 设置计费重/收费重(max(actual_weight, vol_weight))
     *
     * @param billWeight 计费重/收费重(max(actual_weight, vol_weight))
     */
    public void setBillWeight(BigDecimal billWeight) {
        this.billWeight = billWeight;
    }

    /**
     * 获取货物类型
     *
     * @return goods_type - 货物类型
     */
    public String getGoodsType() {
        return goodsType;
    }

    /**
     * 设置货物类型
     *
     * @param goodsType 货物类型
     */
    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    /**
     * 获取是否购买保险 1否，2是
     *
     * @return is_insurance - 是否购买保险 1否，2是
     */
    public Byte getIsInsurance() {
        return isInsurance;
    }

    /**
     * 设置是否购买保险 1否，2是
     *
     * @param isInsurance 是否购买保险 1否，2是
     */
    public void setIsInsurance(Byte isInsurance) {
        this.isInsurance = isInsurance;
    }

    /**
     * 获取保价金额
     *
     * @return declare_value - 保价金额
     */
    public String getDeclareValue() {
        return declareValue;
    }

    /**
     * 设置保价金额
     *
     * @param declareValue 保价金额
     */
    public void setDeclareValue(String declareValue) {
        this.declareValue = declareValue;
    }

    /**
     * 获取代垫款
     *
     * @return advance - 代垫款
     */
    public BigDecimal getAdvance() {
        return advance;
    }

    /**
     * 设置代垫款
     *
     * @param advance 代垫款
     */
    public void setAdvance(BigDecimal advance) {
        this.advance = advance;
    }

    /**
     * 获取付款方式
     *
     * @return pay_type - 付款方式
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 设置付款方式
     *
     * @param payType 付款方式
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * 获取货物品名
     *
     * @return cargo_name - 货物品名
     */
    public String getCargoName() {
        return cargoName;
    }

    /**
     * 设置货物品名
     *
     * @param cargoName 货物品名
     */
    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    /**
     * 获取包装类型
     *
     * @return package_type - 包装类型
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * 设置包装类型
     *
     * @param packageType 包装类型
     */
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    /**
     * 获取代垫款币别
     *
     * @return currency_type - 代垫款币别
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * 设置代垫款币别
     *
     * @param currencyType 代垫款币别
     */
    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    /**
     * 获取英文品名
     *
     * @return cargo_name_en - 英文品名
     */
    public String getCargoNameEn() {
        return cargoNameEn;
    }

    /**
     * 设置英文品名
     *
     * @param cargoNameEn 英文品名
     */
    public void setCargoNameEn(String cargoNameEn) {
        this.cargoNameEn = cargoNameEn;
    }

    /**
     * 获取申报价值
     *
     * @return unit_price - 申报价值
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * 设置申报价值
     *
     * @param unitPrice 申报价值
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * 获取税金支付
     *
     * @return payment - 税金支付
     */
    public String getPayment() {
        return payment;
    }

    /**
     * 设置税金支付
     *
     * @param payment 税金支付
     */
    public void setPayment(String payment) {
        this.payment = payment;
    }

    /**
     * 获取1是  2 否
     *
     * @return is_problem - 1是  2 否
     */
    public Byte getIsProblem() {
        return isProblem;
    }

    /**
     * 设置1是  2 否
     *
     * @param isProblem 1是  2 否
     */
    public void setIsProblem(Byte isProblem) {
        this.isProblem = isProblem;
    }

    /**
     * 获取完成时间
     *
     * @return finish_time - 完成时间
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * 设置完成时间
     *
     * @param finishTime 完成时间
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * 获取订单状态  1.待补录2.待审核3.待修正4.待交寄5.待出货6.运输中7.已签收8.已完成9.已取消  
     *
     * @return status - 订单状态  1.待补录2.待审核3.待修正4.待交寄5.待出货6.运输中7.已签收8.已完成9.已取消  
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置订单状态  1.待补录2.待审核3.待修正4.待交寄5.待出货6.运输中7.已签收8.已完成9.已取消  
     *
     * @param status 订单状态  1.待补录2.待审核3.待修正4.待交寄5.待出货6.运输中7.已签收8.已完成9.已取消  
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取订单申报类型1(出口)2(进口)
     *
     * @return declare_type - 订单申报类型1(出口)2(进口)
     */
    public Byte getDeclareType() {
        return declareType;
    }

    /**
     * 设置订单申报类型1(出口)2(进口)
     *
     * @param declareType 订单申报类型1(出口)2(进口)
     */
    public void setDeclareType(Byte declareType) {
        this.declareType = declareType;
    }

    /**
     * 获取寄件人姓名
     *
     * @return sender_name - 寄件人姓名
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * 设置寄件人姓名
     *
     * @param senderName 寄件人姓名
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     * 获取寄件人公司名称
     *
     * @return sender_company_name - 寄件人公司名称
     */
    public String getSenderCompanyName() {
        return senderCompanyName;
    }

    /**
     * 设置寄件人公司名称
     *
     * @param senderCompanyName 寄件人公司名称
     */
    public void setSenderCompanyName(String senderCompanyName) {
        this.senderCompanyName = senderCompanyName;
    }

    /**
     * 获取寄件人电话
     *
     * @return sender_tel - 寄件人电话
     */
    public String getSenderTel() {
        return senderTel;
    }

    /**
     * 设置寄件人电话
     *
     * @param senderTel 寄件人电话
     */
    public void setSenderTel(String senderTel) {
        this.senderTel = senderTel;
    }

    /**
     * 获取寄件人邮编
     *
     * @return sender_postcode - 寄件人邮编
     */
    public String getSenderPostcode() {
        return senderPostcode;
    }

    /**
     * 设置寄件人邮编
     *
     * @param senderPostcode 寄件人邮编
     */
    public void setSenderPostcode(String senderPostcode) {
        this.senderPostcode = senderPostcode;
    }

    /**
     * 获取寄件人 州/省
     *
     * @return sender_province - 寄件人 州/省
     */
    public String getSenderProvince() {
        return senderProvince;
    }

    /**
     * 设置寄件人 州/省
     *
     * @param senderProvince 寄件人 州/省
     */
    public void setSenderProvince(String senderProvince) {
        this.senderProvince = senderProvince;
    }

    /**
     * 获取寄件人城市
     *
     * @return sender_city - 寄件人城市
     */
    public String getSenderCity() {
        return senderCity;
    }

    /**
     * 设置寄件人城市
     *
     * @param senderCity 寄件人城市
     */
    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }

    /**
     * 获取寄件人详细地址
     *
     * @return sender_addr - 寄件人详细地址
     */
    public String getSenderAddr() {
        return senderAddr;
    }

    /**
     * 设置寄件人详细地址
     *
     * @param senderAddr 寄件人详细地址
     */
    public void setSenderAddr(String senderAddr) {
        this.senderAddr = senderAddr;
    }

    /**
     * 获取寄件人地址2
     *
     * @return sender_addtuo - 寄件人地址2
     */
    public String getSenderAddtuo() {
        return senderAddtuo;
    }

    /**
     * 设置寄件人地址2
     *
     * @param senderAddtuo 寄件人地址2
     */
    public void setSenderAddtuo(String senderAddtuo) {
        this.senderAddtuo = senderAddtuo;
    }

    /**
     * 获取寄件地址3
     *
     * @return sender_addthree - 寄件地址3
     */
    public String getSenderAddthree() {
        return senderAddthree;
    }

    /**
     * 设置寄件地址3
     *
     * @param senderAddthree 寄件地址3
     */
    public void setSenderAddthree(String senderAddthree) {
        this.senderAddthree = senderAddthree;
    }

    /**
     * 获取寄件人邮箱
     *
     * @return sender_email - 寄件人邮箱
     */
    public String getSenderEmail() {
        return senderEmail;
    }

    /**
     * 设置寄件人邮箱
     *
     * @param senderEmail 寄件人邮箱
     */
    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    /**
     * 获取寄件信息税金支付
     *
     * @return sender_payment - 寄件信息税金支付
     */
    public String getSenderPayment() {
        return senderPayment;
    }

    /**
     * 设置寄件信息税金支付
     *
     * @param senderPayment 寄件信息税金支付
     */
    public void setSenderPayment(String senderPayment) {
        this.senderPayment = senderPayment;
    }

    /**
     * 获取收件人姓名
     *
     * @return receiver_name - 收件人姓名
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 设置收件人姓名
     *
     * @param receiverName 收件人姓名
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * 获取收件人公司名称
     *
     * @return receiver_company_name - 收件人公司名称
     */
    public String getReceiverCompanyName() {
        return receiverCompanyName;
    }

    /**
     * 设置收件人公司名称
     *
     * @param receiverCompanyName 收件人公司名称
     */
    public void setReceiverCompanyName(String receiverCompanyName) {
        this.receiverCompanyName = receiverCompanyName;
    }

    /**
     * 获取收件人电话
     *
     * @return receiver_tel - 收件人电话
     */
    public String getReceiverTel() {
        return receiverTel;
    }

    /**
     * 设置收件人电话
     *
     * @param receiverTel 收件人电话
     */
    public void setReceiverTel(String receiverTel) {
        this.receiverTel = receiverTel;
    }

    /**
     * 获取收件人邮编
     *
     * @return receiver_postcode - 收件人邮编
     */
    public String getReceiverPostcode() {
        return receiverPostcode;
    }

    /**
     * 设置收件人邮编
     *
     * @param receiverPostcode 收件人邮编
     */
    public void setReceiverPostcode(String receiverPostcode) {
        this.receiverPostcode = receiverPostcode;
    }

    /**
     * 获取收件人国家
     *
     * @return receiver_country - 收件人国家
     */
    public String getReceiverCountry() {
        return receiverCountry;
    }

    /**
     * 设置收件人国家
     *
     * @param receiverCountry 收件人国家
     */
    public void setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }

    /**
     * 获取收件人 州/省
     *
     * @return receiver_province - 收件人 州/省
     */
    public String getReceiverProvince() {
        return receiverProvince;
    }

    /**
     * 设置收件人 州/省
     *
     * @param receiverProvince 收件人 州/省
     */
    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    /**
     * 获取收件人城市
     *
     * @return receiver_city - 收件人城市
     */
    public String getReceiverCity() {
        return receiverCity;
    }

    /**
     * 设置收件人城市
     *
     * @param receiverCity 收件人城市
     */
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    /**
     * 获取收件人详细地址
     *
     * @return receiver_addr - 收件人详细地址
     */
    public String getReceiverAddr() {
        return receiverAddr;
    }

    /**
     * 设置收件人详细地址
     *
     * @param receiverAddr 收件人详细地址
     */
    public void setReceiverAddr(String receiverAddr) {
        this.receiverAddr = receiverAddr;
    }

    /**
     * 获取收件人地址2
     *
     * @return receiver_addtuo - 收件人地址2
     */
    public String getReceiverAddtuo() {
        return receiverAddtuo;
    }

    /**
     * 设置收件人地址2
     *
     * @param receiverAddtuo 收件人地址2
     */
    public void setReceiverAddtuo(String receiverAddtuo) {
        this.receiverAddtuo = receiverAddtuo;
    }

    /**
     * 获取收件人地址3
     *
     * @return receiver_addthree - 收件人地址3
     */
    public String getReceiverAddthree() {
        return receiverAddthree;
    }

    /**
     * 设置收件人地址3
     *
     * @param receiverAddthree 收件人地址3
     */
    public void setReceiverAddthree(String receiverAddthree) {
        this.receiverAddthree = receiverAddthree;
    }

    /**
     * 获取收件人邮箱
     *
     * @return receiver_email - 收件人邮箱
     */
    public String getReceiverEmail() {
        return receiverEmail;
    }

    /**
     * 设置收件人邮箱
     *
     * @param receiverEmail 收件人邮箱
     */
    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    /**
     * 获取收件信息税金支付
     *
     * @return recriver_payment - 收件信息税金支付
     */
    public String getRecriverPayment() {
        return recriverPayment;
    }

    /**
     * 设置收件信息税金支付
     *
     * @param recriverPayment 收件信息税金支付
     */
    public void setRecriverPayment(String recriverPayment) {
        this.recriverPayment = recriverPayment;
    }

    /**
     * 获取订单创建者用户No
     *
     * @return create_user_no - 订单创建者用户No
     */
    public String getCreateUserNo() {
        return createUserNo;
    }

    /**
     * 设置订单创建者用户No
     *
     * @param createUserNo 订单创建者用户No
     */
    public void setCreateUserNo(String createUserNo) {
        this.createUserNo = createUserNo;
    }

    /**
     * 获取审核人
     *
     * @return check_user_no - 审核人
     */
    public String getCheckUserNo() {
        return checkUserNo;
    }

    /**
     * 设置审核人
     *
     * @param checkUserNo 审核人
     */
    public void setCheckUserNo(String checkUserNo) {
        this.checkUserNo = checkUserNo;
    }

    /**
     * 获取订单修改者用户No
     *
     * @return update_user_no - 订单修改者用户No
     */
    public String getUpdateUserNo() {
        return updateUserNo;
    }

    /**
     * 设置订单修改者用户No
     *
     * @param updateUserNo 订单修改者用户No
     */
    public void setUpdateUserNo(String updateUserNo) {
        this.updateUserNo = updateUserNo;
    }

    /**
     * 获取1是 0否
     *
     * @return is_del - 1是 0否
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * 设置1是 0否
     *
     * @param isDel 1是 0否
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取比别类型
     *
     * @return valuation_cusrrency - 比别类型
     */
    public String getValuationCusrrency() {
        return valuationCusrrency;
    }

    /**
     * 设置比别类型
     *
     * @param valuationCusrrency 比别类型
     */
    public void setValuationCusrrency(String valuationCusrrency) {
        this.valuationCusrrency = valuationCusrrency;
    }

    /**
     * 获取收件统编
     *
     * @return receiver_universal_compile - 收件统编
     */
    public String getReceiverUniversalCompile() {
        return receiverUniversalCompile;
    }

    /**
     * 设置收件统编
     *
     * @param receiverUniversalCompile 收件统编
     */
    public void setReceiverUniversalCompile(String receiverUniversalCompile) {
        this.receiverUniversalCompile = receiverUniversalCompile;
    }

    /**
     * 获取目的地国家
     *
     * @return dest_no - 目的地国家
     */
    public String getDestNo() {
        return destNo;
    }

    /**
     * 设置目的地国家
     *
     * @param destNo 目的地国家
     */
    public void setDestNo(String destNo) {
        this.destNo = destNo;
    }

    /**
     * 获取发送人国家
     *
     * @return sender_country - 发送人国家
     */
    public String getSenderCountry() {
        return senderCountry;
    }

    /**
     * 设置发送人国家
     *
     * @param senderCountry 发送人国家
     */
    public void setSenderCountry(String senderCountry) {
        this.senderCountry = senderCountry;
    }

    /**
     * 获取审核时间
     *
     * @return check_time - 审核时间
     */
    public Date getCheckTime() {
        return checkTime;
    }

    /**
     * 设置审核时间
     *
     * @param checkTime 审核时间
     */
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * 获取客户代号
     *
     * @return customer_code - 客户代号
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * 设置客户代号
     *
     * @param customerCode 客户代号
     */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    /**
     * 获取客户名称
     *
     * @return customer_name - 客户名称
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置客户名称
     *
     * @param customerName 客户名称
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * 获取客户货主ID
     *
     * @return customer_shipper_company_id - 客户货主ID
     */
    public Integer getCustomerShipperCompanyId() {
        return customerShipperCompanyId;
    }

    /**
     * 设置客户货主ID
     *
     * @param customerShipperCompanyId 客户货主ID
     */
    public void setCustomerShipperCompanyId(Integer customerShipperCompanyId) {
        this.customerShipperCompanyId = customerShipperCompanyId;
    }

    /**
     * 获取客户货主公司名称
     *
     * @return customer_shipper_company_name - 客户货主公司名称
     */
    public String getCustomerShipperCompanyName() {
        return customerShipperCompanyName;
    }

    /**
     * 设置客户货主公司名称
     *
     * @param customerShipperCompanyName 客户货主公司名称
     */
    public void setCustomerShipperCompanyName(String customerShipperCompanyName) {
        this.customerShipperCompanyName = customerShipperCompanyName;
    }

    /**
     * 获取下单站点代号
     *
     * @return order_stano - 下单站点代号
     */
    public String getOrderStano() {
        return orderStano;
    }

    /**
     * 设置下单站点代号
     *
     * @param orderStano 下单站点代号
     */
    public void setOrderStano(String orderStano) {
        this.orderStano = orderStano;
    }

    /**
     * 获取下单站点名称
     *
     * @return order_station - 下单站点名称
     */
    public String getOrderStation() {
        return orderStation;
    }

    /**
     * 设置下单站点名称
     *
     * @param orderStation 下单站点名称
     */
    public void setOrderStation(String orderStation) {
        this.orderStation = orderStation;
    }

    /**
     * 获取下单站点英文名称
     *
     * @return order_station_en - 下单站点英文名称
     */
    public String getOrderStationEn() {
        return orderStationEn;
    }

    /**
     * 设置下单站点英文名称
     *
     * @param orderStationEn 下单站点英文名称
     */
    public void setOrderStationEn(String orderStationEn) {
        this.orderStationEn = orderStationEn;
    }

    /**
     * 获取订单类型 (1 普通订单 2 指定件 3 草稿订单）
     *
     * @return type - 订单类型 (1 普通订单 2 指定件 3 草稿订单）
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置订单类型 (1 普通订单 2 指定件 3 草稿订单）
     *
     * @param type 订单类型 (1 普通订单 2 指定件 3 草稿订单）
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取审核不通过原因
     *
     * @return amendment - 审核不通过原因
     */
    public String getAmendment() {
        return amendment;
    }

    /**
     * 设置审核不通过原因
     *
     * @param amendment 审核不通过原因
     */
    public void setAmendment(String amendment) {
        this.amendment = amendment;
    }

    /**
     * 获取取消类型(1待审核取消，2代交寄取消，3待出货）
     *
     * @return initiation_type - 取消类型(1待审核取消，2代交寄取消，3待出货）
     */
    public Byte getInitiationType() {
        return initiationType;
    }

    /**
     * 设置取消类型(1待审核取消，2代交寄取消，3待出货）
     *
     * @param initiationType 取消类型(1待审核取消，2代交寄取消，3待出货）
     */
    public void setInitiationType(Byte initiationType) {
        this.initiationType = initiationType;
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
     * 获取渠道信息寄件人
     *
     * @return trans_sender_name - 渠道信息寄件人
     */
    public String getTransSenderName() {
        return transSenderName;
    }

    /**
     * 设置渠道信息寄件人
     *
     * @param transSenderName 渠道信息寄件人
     */
    public void setTransSenderName(String transSenderName) {
        this.transSenderName = transSenderName;
    }

    /**
     * 获取渠道信息寄件公司
     *
     * @return trans_sender_company_name - 渠道信息寄件公司
     */
    public String getTransSenderCompanyName() {
        return transSenderCompanyName;
    }

    /**
     * 设置渠道信息寄件公司
     *
     * @param transSenderCompanyName 渠道信息寄件公司
     */
    public void setTransSenderCompanyName(String transSenderCompanyName) {
        this.transSenderCompanyName = transSenderCompanyName;
    }

    /**
     * 获取渠道信息寄件电话
     *
     * @return trans_sender_tel - 渠道信息寄件电话
     */
    public String getTransSenderTel() {
        return transSenderTel;
    }

    /**
     * 设置渠道信息寄件电话
     *
     * @param transSenderTel 渠道信息寄件电话
     */
    public void setTransSenderTel(String transSenderTel) {
        this.transSenderTel = transSenderTel;
    }

    /**
     * 获取渠道税金支付
     *
     * @return trans_sender_payment - 渠道税金支付
     */
    public String getTransSenderPayment() {
        return transSenderPayment;
    }

    /**
     * 设置渠道税金支付
     *
     * @param transSenderPayment 渠道税金支付
     */
    public void setTransSenderPayment(String transSenderPayment) {
        this.transSenderPayment = transSenderPayment;
    }

    /**
     * 获取渠道邮编
     *
     * @return trans_sender_postcode - 渠道邮编
     */
    public String getTransSenderPostcode() {
        return transSenderPostcode;
    }

    /**
     * 设置渠道邮编
     *
     * @param transSenderPostcode 渠道邮编
     */
    public void setTransSenderPostcode(String transSenderPostcode) {
        this.transSenderPostcode = transSenderPostcode;
    }

    /**
     * 获取渠道寄件邮箱
     *
     * @return trans_sender_email - 渠道寄件邮箱
     */
    public String getTransSenderEmail() {
        return transSenderEmail;
    }

    /**
     * 设置渠道寄件邮箱
     *
     * @param transSenderEmail 渠道寄件邮箱
     */
    public void setTransSenderEmail(String transSenderEmail) {
        this.transSenderEmail = transSenderEmail;
    }

    /**
     * 获取渠道信息寄件地址
     *
     * @return trans_sender_addr - 渠道信息寄件地址
     */
    public String getTransSenderAddr() {
        return transSenderAddr;
    }

    /**
     * 设置渠道信息寄件地址
     *
     * @param transSenderAddr 渠道信息寄件地址
     */
    public void setTransSenderAddr(String transSenderAddr) {
        this.transSenderAddr = transSenderAddr;
    }

    /**
     * 获取渠道地址2
     *
     * @return trans_sender_addtuo - 渠道地址2
     */
    public String getTransSenderAddtuo() {
        return transSenderAddtuo;
    }

    /**
     * 设置渠道地址2
     *
     * @param transSenderAddtuo 渠道地址2
     */
    public void setTransSenderAddtuo(String transSenderAddtuo) {
        this.transSenderAddtuo = transSenderAddtuo;
    }

    /**
     * 获取渠道地址3
     *
     * @return trans_sender_addthree - 渠道地址3
     */
    public String getTransSenderAddthree() {
        return transSenderAddthree;
    }

    /**
     * 设置渠道地址3
     *
     * @param transSenderAddthree 渠道地址3
     */
    public void setTransSenderAddthree(String transSenderAddthree) {
        this.transSenderAddthree = transSenderAddthree;
    }

    /**
     * 获取渠道信息洲/省
     *
     * @return trans_sender_province - 渠道信息洲/省
     */
    public String getTransSenderProvince() {
        return transSenderProvince;
    }

    /**
     * 设置渠道信息洲/省
     *
     * @param transSenderProvince 渠道信息洲/省
     */
    public void setTransSenderProvince(String transSenderProvince) {
        this.transSenderProvince = transSenderProvince;
    }

    /**
     * 获取渠道信息寄件城市
     *
     * @return trans_sender_city - 渠道信息寄件城市
     */
    public String getTransSenderCity() {
        return transSenderCity;
    }

    /**
     * 设置渠道信息寄件城市
     *
     * @param transSenderCity 渠道信息寄件城市
     */
    public void setTransSenderCity(String transSenderCity) {
        this.transSenderCity = transSenderCity;
    }

    /**
     * 获取渠道信息寄件国家
     *
     * @return trans_sender_country - 渠道信息寄件国家
     */
    public String getTransSenderCountry() {
        return transSenderCountry;
    }

    /**
     * 设置渠道信息寄件国家
     *
     * @param transSenderCountry 渠道信息寄件国家
     */
    public void setTransSenderCountry(String transSenderCountry) {
        this.transSenderCountry = transSenderCountry;
    }
}