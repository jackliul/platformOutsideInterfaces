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
     * ��������
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * �����̹�˾ID
     */
    @Column(name = "carrier_company_id")
    private Integer carrierCompanyId;

    /**
     * ������˾ID
     */
    @Column(name = "shipper_company_id")
    private Integer shipperCompanyId;

    /**
     * �����̹�˾����
     */
    @Column(name = "carrier_company_name")
    private String carrierCompanyName;

    /**
     * ������˾����
     */
    @Column(name = "shipper_company_name")
    private String shipperCompanyName;

    /**
     * �˵�����
     */
    @Column(name = "waybill_no")
    private String waybillNo;

    /**
     * ת������
     */
    @Column(name = "trans_no")
    private String transNo;

    /**
     * �ͻ�����
     */
    @Column(name = "ref_no")
    private String refNo;

    /**
     * �������
     */
    @Column(name = "trans_sort")
    private String transSort;

    /**
     * ���䷽ʽ
     */
    @Column(name = "trans_type")
    private String transType;

    /**
     * ������վ�����
     */
    private String stano;

    /**
     * ������վ������
     */
    private String station;

    /**
     * ������վ��Ӣ����
     */
    @Column(name = "station_en")
    private String stationEn;

    /**
     * ����
     */
    private Integer pcs;

    private BigDecimal weight;

    /**
     * ʵ������
     */
    @Column(name = "actual_weight")
    private BigDecimal actualWeight;

    /**
     * �����/�Ļ���
     */
    @Column(name = "vol_weight")
    private BigDecimal volWeight;

    /**
     * �Ʒ���/�շ���(max(actual_weight, vol_weight))
     */
    @Column(name = "bill_weight")
    private BigDecimal billWeight;

    /**
     * ��������
     */
    @Column(name = "goods_type")
    private String goodsType;

    /**
     * �Ƿ����� 1��2��
     */
    @Column(name = "is_insurance")
    private Byte isInsurance;

    /**
     * ���۽��
     */
    @Column(name = "declare_value")
    private String declareValue;

    /**
     * �����
     */
    private BigDecimal advance;

    /**
     * ���ʽ
     */
    @Column(name = "pay_type")
    private String payType;

    /**
     * ����Ʒ��
     */
    @Column(name = "cargo_name")
    private String cargoName;

    /**
     * ��װ����
     */
    @Column(name = "package_type")
    private String packageType;

    /**
     * �����ұ�
     */
    @Column(name = "currency_type")
    private String currencyType;

    /**
     * Ӣ��Ʒ��
     */
    @Column(name = "cargo_name_en")
    private String cargoNameEn;

    /**
     * �걨��ֵ
     */
    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    /**
     * ˰��֧��
     */
    private String payment;

    /**
     * 1��  2 ��
     */
    @Column(name = "is_problem")
    private Byte isProblem;

    /**
     * ���ʱ��
     */
    @Column(name = "finish_time")
    private Date finishTime;

    /**
     * ����״̬  1.����¼2.�����3.������4.������5.������6.������7.��ǩ��8.�����9.��ȡ��  
     */
    private String status;

    /**
     * ��ע
     */
    private String remark;

    /**
     * �����걨����1(����)2(����)
     */
    @Column(name = "declare_type")
    private Byte declareType;

    /**
     * �ļ�������
     */
    @Column(name = "sender_name")
    private String senderName;

    /**
     * �ļ��˹�˾����
     */
    @Column(name = "sender_company_name")
    private String senderCompanyName;

    /**
     * �ļ��˵绰
     */
    @Column(name = "sender_tel")
    private String senderTel;

    /**
     * �ļ����ʱ�
     */
    @Column(name = "sender_postcode")
    private String senderPostcode;

    /**
     * �ļ��� ��/ʡ
     */
    @Column(name = "sender_province")
    private String senderProvince;

    /**
     * �ļ��˳���
     */
    @Column(name = "sender_city")
    private String senderCity;

    /**
     * �ļ�����ϸ��ַ
     */
    @Column(name = "sender_addr")
    private String senderAddr;

    /**
     * �ļ��˵�ַ2
     */
    @Column(name = "sender_addtuo")
    private String senderAddtuo;

    /**
     * �ļ���ַ3
     */
    @Column(name = "sender_addthree")
    private String senderAddthree;

    /**
     * �ļ�������
     */
    @Column(name = "sender_email")
    private String senderEmail;

    /**
     * �ļ���Ϣ˰��֧��
     */
    @Column(name = "sender_payment")
    private String senderPayment;

    /**
     * �ռ�������
     */
    @Column(name = "receiver_name")
    private String receiverName;

    /**
     * �ռ��˹�˾����
     */
    @Column(name = "receiver_company_name")
    private String receiverCompanyName;

    /**
     * �ռ��˵绰
     */
    @Column(name = "receiver_tel")
    private String receiverTel;

    /**
     * �ռ����ʱ�
     */
    @Column(name = "receiver_postcode")
    private String receiverPostcode;

    /**
     * �ռ��˹���
     */
    @Column(name = "receiver_country")
    private String receiverCountry;

    /**
     * �ռ��� ��/ʡ
     */
    @Column(name = "receiver_province")
    private String receiverProvince;

    /**
     * �ռ��˳���
     */
    @Column(name = "receiver_city")
    private String receiverCity;

    /**
     * �ռ�����ϸ��ַ
     */
    @Column(name = "receiver_addr")
    private String receiverAddr;

    /**
     * �ռ��˵�ַ2
     */
    @Column(name = "receiver_addtuo")
    private String receiverAddtuo;

    /**
     * �ռ��˵�ַ3
     */
    @Column(name = "receiver_addthree")
    private String receiverAddthree;

    /**
     * �ռ�������
     */
    @Column(name = "receiver_email")
    private String receiverEmail;

    /**
     * �ռ���Ϣ˰��֧��
     */
    @Column(name = "recriver_payment")
    private String recriverPayment;

    /**
     * �����������û�No
     */
    @Column(name = "create_user_no")
    private String createUserNo;

    /**
     * �����
     */
    @Column(name = "check_user_no")
    private String checkUserNo;

    /**
     * �����޸����û�No
     */
    @Column(name = "update_user_no")
    private String updateUserNo;

    /**
     * 1�� 0��
     */
    @Column(name = "is_del")
    private Boolean isDel;

    /**
     * �ȱ�����
     */
    @Column(name = "valuation_cusrrency")
    private String valuationCusrrency;

    /**
     * �ռ�ͳ��
     */
    @Column(name = "receiver_universal_compile")
    private String receiverUniversalCompile;

    /**
     * Ŀ�ĵع���
     */
    @Column(name = "dest_no")
    private String destNo;

    /**
     * �����˹���
     */
    @Column(name = "sender_country")
    private String senderCountry;

    /**
     * ���ʱ��
     */
    @Column(name = "check_time")
    private Date checkTime;

    /**
     * �ͻ�����
     */
    @Column(name = "customer_code")
    private String customerCode;

    /**
     * �ͻ�����
     */
    @Column(name = "customer_name")
    private String customerName;

    /**
     * �ͻ�����ID
     */
    @Column(name = "customer_shipper_company_id")
    private Integer customerShipperCompanyId;

    /**
     * �ͻ�������˾����
     */
    @Column(name = "customer_shipper_company_name")
    private String customerShipperCompanyName;

    /**
     * �µ�վ�����
     */
    @Column(name = "order_stano")
    private String orderStano;

    /**
     * �µ�վ������
     */
    @Column(name = "order_station")
    private String orderStation;

    /**
     * �µ�վ��Ӣ������
     */
    @Column(name = "order_station_en")
    private String orderStationEn;

    /**
     * �������� (1 ��ͨ���� 2 ָ���� 3 �ݸ嶩����
     */
    private Byte type;

    /**
     * ��˲�ͨ��ԭ��
     */
    private String amendment;

    /**
     * ȡ������(1�����ȡ����2������ȡ����3��������
     */
    @Column(name = "initiation_type")
    private Byte initiationType;

    /**
     * ����ʱ��
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * �޸�ʱ��
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * ������Ϣ�ļ���
     */
    @Column(name = "trans_sender_name")
    private String transSenderName;

    /**
     * ������Ϣ�ļ���˾
     */
    @Column(name = "trans_sender_company_name")
    private String transSenderCompanyName;

    /**
     * ������Ϣ�ļ��绰
     */
    @Column(name = "trans_sender_tel")
    private String transSenderTel;

    /**
     * ����˰��֧��
     */
    @Column(name = "trans_sender_payment")
    private String transSenderPayment;

    /**
     * �����ʱ�
     */
    @Column(name = "trans_sender_postcode")
    private String transSenderPostcode;

    /**
     * �����ļ�����
     */
    @Column(name = "trans_sender_email")
    private String transSenderEmail;

    /**
     * ������Ϣ�ļ���ַ
     */
    @Column(name = "trans_sender_addr")
    private String transSenderAddr;

    /**
     * ������ַ2
     */
    @Column(name = "trans_sender_addtuo")
    private String transSenderAddtuo;

    /**
     * ������ַ3
     */
    @Column(name = "trans_sender_addthree")
    private String transSenderAddthree;

    /**
     * ������Ϣ��/ʡ
     */
    @Column(name = "trans_sender_province")
    private String transSenderProvince;

    /**
     * ������Ϣ�ļ�����
     */
    @Column(name = "trans_sender_city")
    private String transSenderCity;

    /**
     * ������Ϣ�ļ�����
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
     * ��ȡ��������
     *
     * @return order_no - ��������
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * ���ö�������
     *
     * @param orderNo ��������
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * ��ȡ�����̹�˾ID
     *
     * @return carrier_company_id - �����̹�˾ID
     */
    public Integer getCarrierCompanyId() {
        return carrierCompanyId;
    }

    /**
     * ���ó����̹�˾ID
     *
     * @param carrierCompanyId �����̹�˾ID
     */
    public void setCarrierCompanyId(Integer carrierCompanyId) {
        this.carrierCompanyId = carrierCompanyId;
    }

    /**
     * ��ȡ������˾ID
     *
     * @return shipper_company_id - ������˾ID
     */
    public Integer getShipperCompanyId() {
        return shipperCompanyId;
    }

    /**
     * ���û�����˾ID
     *
     * @param shipperCompanyId ������˾ID
     */
    public void setShipperCompanyId(Integer shipperCompanyId) {
        this.shipperCompanyId = shipperCompanyId;
    }

    /**
     * ��ȡ�����̹�˾����
     *
     * @return carrier_company_name - �����̹�˾����
     */
    public String getCarrierCompanyName() {
        return carrierCompanyName;
    }

    /**
     * ���ó����̹�˾����
     *
     * @param carrierCompanyName �����̹�˾����
     */
    public void setCarrierCompanyName(String carrierCompanyName) {
        this.carrierCompanyName = carrierCompanyName;
    }

    /**
     * ��ȡ������˾����
     *
     * @return shipper_company_name - ������˾����
     */
    public String getShipperCompanyName() {
        return shipperCompanyName;
    }

    /**
     * ���û�����˾����
     *
     * @param shipperCompanyName ������˾����
     */
    public void setShipperCompanyName(String shipperCompanyName) {
        this.shipperCompanyName = shipperCompanyName;
    }

    /**
     * ��ȡ�˵�����
     *
     * @return waybill_no - �˵�����
     */
    public String getWaybillNo() {
        return waybillNo;
    }

    /**
     * �����˵�����
     *
     * @param waybillNo �˵�����
     */
    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }

    /**
     * ��ȡת������
     *
     * @return trans_no - ת������
     */
    public String getTransNo() {
        return transNo;
    }

    /**
     * ����ת������
     *
     * @param transNo ת������
     */
    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    /**
     * ��ȡ�ͻ�����
     *
     * @return ref_no - �ͻ�����
     */
    public String getRefNo() {
        return refNo;
    }

    /**
     * ���ÿͻ�����
     *
     * @param refNo �ͻ�����
     */
    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    /**
     * ��ȡ�������
     *
     * @return trans_sort - �������
     */
    public String getTransSort() {
        return transSort;
    }

    /**
     * �����������
     *
     * @param transSort �������
     */
    public void setTransSort(String transSort) {
        this.transSort = transSort;
    }

    /**
     * ��ȡ���䷽ʽ
     *
     * @return trans_type - ���䷽ʽ
     */
    public String getTransType() {
        return transType;
    }

    /**
     * �������䷽ʽ
     *
     * @param transType ���䷽ʽ
     */
    public void setTransType(String transType) {
        this.transType = transType;
    }

    /**
     * ��ȡ������վ�����
     *
     * @return stano - ������վ�����
     */
    public String getStano() {
        return stano;
    }

    /**
     * ���ó�����վ�����
     *
     * @param stano ������վ�����
     */
    public void setStano(String stano) {
        this.stano = stano;
    }

    /**
     * ��ȡ������վ������
     *
     * @return station - ������վ������
     */
    public String getStation() {
        return station;
    }

    /**
     * ���ó�����վ������
     *
     * @param station ������վ������
     */
    public void setStation(String station) {
        this.station = station;
    }

    /**
     * ��ȡ������վ��Ӣ����
     *
     * @return station_en - ������վ��Ӣ����
     */
    public String getStationEn() {
        return stationEn;
    }

    /**
     * ���ó�����վ��Ӣ����
     *
     * @param stationEn ������վ��Ӣ����
     */
    public void setStationEn(String stationEn) {
        this.stationEn = stationEn;
    }

    /**
     * ��ȡ����
     *
     * @return pcs - ����
     */
    public Integer getPcs() {
        return pcs;
    }

    /**
     * ���ü���
     *
     * @param pcs ����
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
     * ��ȡʵ������
     *
     * @return actual_weight - ʵ������
     */
    public BigDecimal getActualWeight() {
        return actualWeight;
    }

    /**
     * ����ʵ������
     *
     * @param actualWeight ʵ������
     */
    public void setActualWeight(BigDecimal actualWeight) {
        this.actualWeight = actualWeight;
    }

    /**
     * ��ȡ�����/�Ļ���
     *
     * @return vol_weight - �����/�Ļ���
     */
    public BigDecimal getVolWeight() {
        return volWeight;
    }

    /**
     * ���������/�Ļ���
     *
     * @param volWeight �����/�Ļ���
     */
    public void setVolWeight(BigDecimal volWeight) {
        this.volWeight = volWeight;
    }

    /**
     * ��ȡ�Ʒ���/�շ���(max(actual_weight, vol_weight))
     *
     * @return bill_weight - �Ʒ���/�շ���(max(actual_weight, vol_weight))
     */
    public BigDecimal getBillWeight() {
        return billWeight;
    }

    /**
     * ���üƷ���/�շ���(max(actual_weight, vol_weight))
     *
     * @param billWeight �Ʒ���/�շ���(max(actual_weight, vol_weight))
     */
    public void setBillWeight(BigDecimal billWeight) {
        this.billWeight = billWeight;
    }

    /**
     * ��ȡ��������
     *
     * @return goods_type - ��������
     */
    public String getGoodsType() {
        return goodsType;
    }

    /**
     * ���û�������
     *
     * @param goodsType ��������
     */
    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    /**
     * ��ȡ�Ƿ����� 1��2��
     *
     * @return is_insurance - �Ƿ����� 1��2��
     */
    public Byte getIsInsurance() {
        return isInsurance;
    }

    /**
     * �����Ƿ����� 1��2��
     *
     * @param isInsurance �Ƿ����� 1��2��
     */
    public void setIsInsurance(Byte isInsurance) {
        this.isInsurance = isInsurance;
    }

    /**
     * ��ȡ���۽��
     *
     * @return declare_value - ���۽��
     */
    public String getDeclareValue() {
        return declareValue;
    }

    /**
     * ���ñ��۽��
     *
     * @param declareValue ���۽��
     */
    public void setDeclareValue(String declareValue) {
        this.declareValue = declareValue;
    }

    /**
     * ��ȡ�����
     *
     * @return advance - �����
     */
    public BigDecimal getAdvance() {
        return advance;
    }

    /**
     * ���ô����
     *
     * @param advance �����
     */
    public void setAdvance(BigDecimal advance) {
        this.advance = advance;
    }

    /**
     * ��ȡ���ʽ
     *
     * @return pay_type - ���ʽ
     */
    public String getPayType() {
        return payType;
    }

    /**
     * ���ø��ʽ
     *
     * @param payType ���ʽ
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * ��ȡ����Ʒ��
     *
     * @return cargo_name - ����Ʒ��
     */
    public String getCargoName() {
        return cargoName;
    }

    /**
     * ���û���Ʒ��
     *
     * @param cargoName ����Ʒ��
     */
    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    /**
     * ��ȡ��װ����
     *
     * @return package_type - ��װ����
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * ���ð�װ����
     *
     * @param packageType ��װ����
     */
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    /**
     * ��ȡ�����ұ�
     *
     * @return currency_type - �����ұ�
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * ���ô����ұ�
     *
     * @param currencyType �����ұ�
     */
    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    /**
     * ��ȡӢ��Ʒ��
     *
     * @return cargo_name_en - Ӣ��Ʒ��
     */
    public String getCargoNameEn() {
        return cargoNameEn;
    }

    /**
     * ����Ӣ��Ʒ��
     *
     * @param cargoNameEn Ӣ��Ʒ��
     */
    public void setCargoNameEn(String cargoNameEn) {
        this.cargoNameEn = cargoNameEn;
    }

    /**
     * ��ȡ�걨��ֵ
     *
     * @return unit_price - �걨��ֵ
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * �����걨��ֵ
     *
     * @param unitPrice �걨��ֵ
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * ��ȡ˰��֧��
     *
     * @return payment - ˰��֧��
     */
    public String getPayment() {
        return payment;
    }

    /**
     * ����˰��֧��
     *
     * @param payment ˰��֧��
     */
    public void setPayment(String payment) {
        this.payment = payment;
    }

    /**
     * ��ȡ1��  2 ��
     *
     * @return is_problem - 1��  2 ��
     */
    public Byte getIsProblem() {
        return isProblem;
    }

    /**
     * ����1��  2 ��
     *
     * @param isProblem 1��  2 ��
     */
    public void setIsProblem(Byte isProblem) {
        this.isProblem = isProblem;
    }

    /**
     * ��ȡ���ʱ��
     *
     * @return finish_time - ���ʱ��
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * �������ʱ��
     *
     * @param finishTime ���ʱ��
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * ��ȡ����״̬  1.����¼2.�����3.������4.������5.������6.������7.��ǩ��8.�����9.��ȡ��  
     *
     * @return status - ����״̬  1.����¼2.�����3.������4.������5.������6.������7.��ǩ��8.�����9.��ȡ��  
     */
    public String getStatus() {
        return status;
    }

    /**
     * ���ö���״̬  1.����¼2.�����3.������4.������5.������6.������7.��ǩ��8.�����9.��ȡ��  
     *
     * @param status ����״̬  1.����¼2.�����3.������4.������5.������6.������7.��ǩ��8.�����9.��ȡ��  
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * ��ȡ��ע
     *
     * @return remark - ��ע
     */
    public String getRemark() {
        return remark;
    }

    /**
     * ���ñ�ע
     *
     * @param remark ��ע
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * ��ȡ�����걨����1(����)2(����)
     *
     * @return declare_type - �����걨����1(����)2(����)
     */
    public Byte getDeclareType() {
        return declareType;
    }

    /**
     * ���ö����걨����1(����)2(����)
     *
     * @param declareType �����걨����1(����)2(����)
     */
    public void setDeclareType(Byte declareType) {
        this.declareType = declareType;
    }

    /**
     * ��ȡ�ļ�������
     *
     * @return sender_name - �ļ�������
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * ���üļ�������
     *
     * @param senderName �ļ�������
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     * ��ȡ�ļ��˹�˾����
     *
     * @return sender_company_name - �ļ��˹�˾����
     */
    public String getSenderCompanyName() {
        return senderCompanyName;
    }

    /**
     * ���üļ��˹�˾����
     *
     * @param senderCompanyName �ļ��˹�˾����
     */
    public void setSenderCompanyName(String senderCompanyName) {
        this.senderCompanyName = senderCompanyName;
    }

    /**
     * ��ȡ�ļ��˵绰
     *
     * @return sender_tel - �ļ��˵绰
     */
    public String getSenderTel() {
        return senderTel;
    }

    /**
     * ���üļ��˵绰
     *
     * @param senderTel �ļ��˵绰
     */
    public void setSenderTel(String senderTel) {
        this.senderTel = senderTel;
    }

    /**
     * ��ȡ�ļ����ʱ�
     *
     * @return sender_postcode - �ļ����ʱ�
     */
    public String getSenderPostcode() {
        return senderPostcode;
    }

    /**
     * ���üļ����ʱ�
     *
     * @param senderPostcode �ļ����ʱ�
     */
    public void setSenderPostcode(String senderPostcode) {
        this.senderPostcode = senderPostcode;
    }

    /**
     * ��ȡ�ļ��� ��/ʡ
     *
     * @return sender_province - �ļ��� ��/ʡ
     */
    public String getSenderProvince() {
        return senderProvince;
    }

    /**
     * ���üļ��� ��/ʡ
     *
     * @param senderProvince �ļ��� ��/ʡ
     */
    public void setSenderProvince(String senderProvince) {
        this.senderProvince = senderProvince;
    }

    /**
     * ��ȡ�ļ��˳���
     *
     * @return sender_city - �ļ��˳���
     */
    public String getSenderCity() {
        return senderCity;
    }

    /**
     * ���üļ��˳���
     *
     * @param senderCity �ļ��˳���
     */
    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }

    /**
     * ��ȡ�ļ�����ϸ��ַ
     *
     * @return sender_addr - �ļ�����ϸ��ַ
     */
    public String getSenderAddr() {
        return senderAddr;
    }

    /**
     * ���üļ�����ϸ��ַ
     *
     * @param senderAddr �ļ�����ϸ��ַ
     */
    public void setSenderAddr(String senderAddr) {
        this.senderAddr = senderAddr;
    }

    /**
     * ��ȡ�ļ��˵�ַ2
     *
     * @return sender_addtuo - �ļ��˵�ַ2
     */
    public String getSenderAddtuo() {
        return senderAddtuo;
    }

    /**
     * ���üļ��˵�ַ2
     *
     * @param senderAddtuo �ļ��˵�ַ2
     */
    public void setSenderAddtuo(String senderAddtuo) {
        this.senderAddtuo = senderAddtuo;
    }

    /**
     * ��ȡ�ļ���ַ3
     *
     * @return sender_addthree - �ļ���ַ3
     */
    public String getSenderAddthree() {
        return senderAddthree;
    }

    /**
     * ���üļ���ַ3
     *
     * @param senderAddthree �ļ���ַ3
     */
    public void setSenderAddthree(String senderAddthree) {
        this.senderAddthree = senderAddthree;
    }

    /**
     * ��ȡ�ļ�������
     *
     * @return sender_email - �ļ�������
     */
    public String getSenderEmail() {
        return senderEmail;
    }

    /**
     * ���üļ�������
     *
     * @param senderEmail �ļ�������
     */
    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    /**
     * ��ȡ�ļ���Ϣ˰��֧��
     *
     * @return sender_payment - �ļ���Ϣ˰��֧��
     */
    public String getSenderPayment() {
        return senderPayment;
    }

    /**
     * ���üļ���Ϣ˰��֧��
     *
     * @param senderPayment �ļ���Ϣ˰��֧��
     */
    public void setSenderPayment(String senderPayment) {
        this.senderPayment = senderPayment;
    }

    /**
     * ��ȡ�ռ�������
     *
     * @return receiver_name - �ռ�������
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * �����ռ�������
     *
     * @param receiverName �ռ�������
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * ��ȡ�ռ��˹�˾����
     *
     * @return receiver_company_name - �ռ��˹�˾����
     */
    public String getReceiverCompanyName() {
        return receiverCompanyName;
    }

    /**
     * �����ռ��˹�˾����
     *
     * @param receiverCompanyName �ռ��˹�˾����
     */
    public void setReceiverCompanyName(String receiverCompanyName) {
        this.receiverCompanyName = receiverCompanyName;
    }

    /**
     * ��ȡ�ռ��˵绰
     *
     * @return receiver_tel - �ռ��˵绰
     */
    public String getReceiverTel() {
        return receiverTel;
    }

    /**
     * �����ռ��˵绰
     *
     * @param receiverTel �ռ��˵绰
     */
    public void setReceiverTel(String receiverTel) {
        this.receiverTel = receiverTel;
    }

    /**
     * ��ȡ�ռ����ʱ�
     *
     * @return receiver_postcode - �ռ����ʱ�
     */
    public String getReceiverPostcode() {
        return receiverPostcode;
    }

    /**
     * �����ռ����ʱ�
     *
     * @param receiverPostcode �ռ����ʱ�
     */
    public void setReceiverPostcode(String receiverPostcode) {
        this.receiverPostcode = receiverPostcode;
    }

    /**
     * ��ȡ�ռ��˹���
     *
     * @return receiver_country - �ռ��˹���
     */
    public String getReceiverCountry() {
        return receiverCountry;
    }

    /**
     * �����ռ��˹���
     *
     * @param receiverCountry �ռ��˹���
     */
    public void setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }

    /**
     * ��ȡ�ռ��� ��/ʡ
     *
     * @return receiver_province - �ռ��� ��/ʡ
     */
    public String getReceiverProvince() {
        return receiverProvince;
    }

    /**
     * �����ռ��� ��/ʡ
     *
     * @param receiverProvince �ռ��� ��/ʡ
     */
    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    /**
     * ��ȡ�ռ��˳���
     *
     * @return receiver_city - �ռ��˳���
     */
    public String getReceiverCity() {
        return receiverCity;
    }

    /**
     * �����ռ��˳���
     *
     * @param receiverCity �ռ��˳���
     */
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    /**
     * ��ȡ�ռ�����ϸ��ַ
     *
     * @return receiver_addr - �ռ�����ϸ��ַ
     */
    public String getReceiverAddr() {
        return receiverAddr;
    }

    /**
     * �����ռ�����ϸ��ַ
     *
     * @param receiverAddr �ռ�����ϸ��ַ
     */
    public void setReceiverAddr(String receiverAddr) {
        this.receiverAddr = receiverAddr;
    }

    /**
     * ��ȡ�ռ��˵�ַ2
     *
     * @return receiver_addtuo - �ռ��˵�ַ2
     */
    public String getReceiverAddtuo() {
        return receiverAddtuo;
    }

    /**
     * �����ռ��˵�ַ2
     *
     * @param receiverAddtuo �ռ��˵�ַ2
     */
    public void setReceiverAddtuo(String receiverAddtuo) {
        this.receiverAddtuo = receiverAddtuo;
    }

    /**
     * ��ȡ�ռ��˵�ַ3
     *
     * @return receiver_addthree - �ռ��˵�ַ3
     */
    public String getReceiverAddthree() {
        return receiverAddthree;
    }

    /**
     * �����ռ��˵�ַ3
     *
     * @param receiverAddthree �ռ��˵�ַ3
     */
    public void setReceiverAddthree(String receiverAddthree) {
        this.receiverAddthree = receiverAddthree;
    }

    /**
     * ��ȡ�ռ�������
     *
     * @return receiver_email - �ռ�������
     */
    public String getReceiverEmail() {
        return receiverEmail;
    }

    /**
     * �����ռ�������
     *
     * @param receiverEmail �ռ�������
     */
    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    /**
     * ��ȡ�ռ���Ϣ˰��֧��
     *
     * @return recriver_payment - �ռ���Ϣ˰��֧��
     */
    public String getRecriverPayment() {
        return recriverPayment;
    }

    /**
     * �����ռ���Ϣ˰��֧��
     *
     * @param recriverPayment �ռ���Ϣ˰��֧��
     */
    public void setRecriverPayment(String recriverPayment) {
        this.recriverPayment = recriverPayment;
    }

    /**
     * ��ȡ�����������û�No
     *
     * @return create_user_no - �����������û�No
     */
    public String getCreateUserNo() {
        return createUserNo;
    }

    /**
     * ���ö����������û�No
     *
     * @param createUserNo �����������û�No
     */
    public void setCreateUserNo(String createUserNo) {
        this.createUserNo = createUserNo;
    }

    /**
     * ��ȡ�����
     *
     * @return check_user_no - �����
     */
    public String getCheckUserNo() {
        return checkUserNo;
    }

    /**
     * ���������
     *
     * @param checkUserNo �����
     */
    public void setCheckUserNo(String checkUserNo) {
        this.checkUserNo = checkUserNo;
    }

    /**
     * ��ȡ�����޸����û�No
     *
     * @return update_user_no - �����޸����û�No
     */
    public String getUpdateUserNo() {
        return updateUserNo;
    }

    /**
     * ���ö����޸����û�No
     *
     * @param updateUserNo �����޸����û�No
     */
    public void setUpdateUserNo(String updateUserNo) {
        this.updateUserNo = updateUserNo;
    }

    /**
     * ��ȡ1�� 0��
     *
     * @return is_del - 1�� 0��
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * ����1�� 0��
     *
     * @param isDel 1�� 0��
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * ��ȡ�ȱ�����
     *
     * @return valuation_cusrrency - �ȱ�����
     */
    public String getValuationCusrrency() {
        return valuationCusrrency;
    }

    /**
     * ���ñȱ�����
     *
     * @param valuationCusrrency �ȱ�����
     */
    public void setValuationCusrrency(String valuationCusrrency) {
        this.valuationCusrrency = valuationCusrrency;
    }

    /**
     * ��ȡ�ռ�ͳ��
     *
     * @return receiver_universal_compile - �ռ�ͳ��
     */
    public String getReceiverUniversalCompile() {
        return receiverUniversalCompile;
    }

    /**
     * �����ռ�ͳ��
     *
     * @param receiverUniversalCompile �ռ�ͳ��
     */
    public void setReceiverUniversalCompile(String receiverUniversalCompile) {
        this.receiverUniversalCompile = receiverUniversalCompile;
    }

    /**
     * ��ȡĿ�ĵع���
     *
     * @return dest_no - Ŀ�ĵع���
     */
    public String getDestNo() {
        return destNo;
    }

    /**
     * ����Ŀ�ĵع���
     *
     * @param destNo Ŀ�ĵع���
     */
    public void setDestNo(String destNo) {
        this.destNo = destNo;
    }

    /**
     * ��ȡ�����˹���
     *
     * @return sender_country - �����˹���
     */
    public String getSenderCountry() {
        return senderCountry;
    }

    /**
     * ���÷����˹���
     *
     * @param senderCountry �����˹���
     */
    public void setSenderCountry(String senderCountry) {
        this.senderCountry = senderCountry;
    }

    /**
     * ��ȡ���ʱ��
     *
     * @return check_time - ���ʱ��
     */
    public Date getCheckTime() {
        return checkTime;
    }

    /**
     * �������ʱ��
     *
     * @param checkTime ���ʱ��
     */
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * ��ȡ�ͻ�����
     *
     * @return customer_code - �ͻ�����
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * ���ÿͻ�����
     *
     * @param customerCode �ͻ�����
     */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    /**
     * ��ȡ�ͻ�����
     *
     * @return customer_name - �ͻ�����
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * ���ÿͻ�����
     *
     * @param customerName �ͻ�����
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * ��ȡ�ͻ�����ID
     *
     * @return customer_shipper_company_id - �ͻ�����ID
     */
    public Integer getCustomerShipperCompanyId() {
        return customerShipperCompanyId;
    }

    /**
     * ���ÿͻ�����ID
     *
     * @param customerShipperCompanyId �ͻ�����ID
     */
    public void setCustomerShipperCompanyId(Integer customerShipperCompanyId) {
        this.customerShipperCompanyId = customerShipperCompanyId;
    }

    /**
     * ��ȡ�ͻ�������˾����
     *
     * @return customer_shipper_company_name - �ͻ�������˾����
     */
    public String getCustomerShipperCompanyName() {
        return customerShipperCompanyName;
    }

    /**
     * ���ÿͻ�������˾����
     *
     * @param customerShipperCompanyName �ͻ�������˾����
     */
    public void setCustomerShipperCompanyName(String customerShipperCompanyName) {
        this.customerShipperCompanyName = customerShipperCompanyName;
    }

    /**
     * ��ȡ�µ�վ�����
     *
     * @return order_stano - �µ�վ�����
     */
    public String getOrderStano() {
        return orderStano;
    }

    /**
     * �����µ�վ�����
     *
     * @param orderStano �µ�վ�����
     */
    public void setOrderStano(String orderStano) {
        this.orderStano = orderStano;
    }

    /**
     * ��ȡ�µ�վ������
     *
     * @return order_station - �µ�վ������
     */
    public String getOrderStation() {
        return orderStation;
    }

    /**
     * �����µ�վ������
     *
     * @param orderStation �µ�վ������
     */
    public void setOrderStation(String orderStation) {
        this.orderStation = orderStation;
    }

    /**
     * ��ȡ�µ�վ��Ӣ������
     *
     * @return order_station_en - �µ�վ��Ӣ������
     */
    public String getOrderStationEn() {
        return orderStationEn;
    }

    /**
     * �����µ�վ��Ӣ������
     *
     * @param orderStationEn �µ�վ��Ӣ������
     */
    public void setOrderStationEn(String orderStationEn) {
        this.orderStationEn = orderStationEn;
    }

    /**
     * ��ȡ�������� (1 ��ͨ���� 2 ָ���� 3 �ݸ嶩����
     *
     * @return type - �������� (1 ��ͨ���� 2 ָ���� 3 �ݸ嶩����
     */
    public Byte getType() {
        return type;
    }

    /**
     * ���ö������� (1 ��ͨ���� 2 ָ���� 3 �ݸ嶩����
     *
     * @param type �������� (1 ��ͨ���� 2 ָ���� 3 �ݸ嶩����
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * ��ȡ��˲�ͨ��ԭ��
     *
     * @return amendment - ��˲�ͨ��ԭ��
     */
    public String getAmendment() {
        return amendment;
    }

    /**
     * ������˲�ͨ��ԭ��
     *
     * @param amendment ��˲�ͨ��ԭ��
     */
    public void setAmendment(String amendment) {
        this.amendment = amendment;
    }

    /**
     * ��ȡȡ������(1�����ȡ����2������ȡ����3��������
     *
     * @return initiation_type - ȡ������(1�����ȡ����2������ȡ����3��������
     */
    public Byte getInitiationType() {
        return initiationType;
    }

    /**
     * ����ȡ������(1�����ȡ����2������ȡ����3��������
     *
     * @param initiationType ȡ������(1�����ȡ����2������ȡ����3��������
     */
    public void setInitiationType(Byte initiationType) {
        this.initiationType = initiationType;
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
     * ��ȡ������Ϣ�ļ���
     *
     * @return trans_sender_name - ������Ϣ�ļ���
     */
    public String getTransSenderName() {
        return transSenderName;
    }

    /**
     * ����������Ϣ�ļ���
     *
     * @param transSenderName ������Ϣ�ļ���
     */
    public void setTransSenderName(String transSenderName) {
        this.transSenderName = transSenderName;
    }

    /**
     * ��ȡ������Ϣ�ļ���˾
     *
     * @return trans_sender_company_name - ������Ϣ�ļ���˾
     */
    public String getTransSenderCompanyName() {
        return transSenderCompanyName;
    }

    /**
     * ����������Ϣ�ļ���˾
     *
     * @param transSenderCompanyName ������Ϣ�ļ���˾
     */
    public void setTransSenderCompanyName(String transSenderCompanyName) {
        this.transSenderCompanyName = transSenderCompanyName;
    }

    /**
     * ��ȡ������Ϣ�ļ��绰
     *
     * @return trans_sender_tel - ������Ϣ�ļ��绰
     */
    public String getTransSenderTel() {
        return transSenderTel;
    }

    /**
     * ����������Ϣ�ļ��绰
     *
     * @param transSenderTel ������Ϣ�ļ��绰
     */
    public void setTransSenderTel(String transSenderTel) {
        this.transSenderTel = transSenderTel;
    }

    /**
     * ��ȡ����˰��֧��
     *
     * @return trans_sender_payment - ����˰��֧��
     */
    public String getTransSenderPayment() {
        return transSenderPayment;
    }

    /**
     * ��������˰��֧��
     *
     * @param transSenderPayment ����˰��֧��
     */
    public void setTransSenderPayment(String transSenderPayment) {
        this.transSenderPayment = transSenderPayment;
    }

    /**
     * ��ȡ�����ʱ�
     *
     * @return trans_sender_postcode - �����ʱ�
     */
    public String getTransSenderPostcode() {
        return transSenderPostcode;
    }

    /**
     * ���������ʱ�
     *
     * @param transSenderPostcode �����ʱ�
     */
    public void setTransSenderPostcode(String transSenderPostcode) {
        this.transSenderPostcode = transSenderPostcode;
    }

    /**
     * ��ȡ�����ļ�����
     *
     * @return trans_sender_email - �����ļ�����
     */
    public String getTransSenderEmail() {
        return transSenderEmail;
    }

    /**
     * ���������ļ�����
     *
     * @param transSenderEmail �����ļ�����
     */
    public void setTransSenderEmail(String transSenderEmail) {
        this.transSenderEmail = transSenderEmail;
    }

    /**
     * ��ȡ������Ϣ�ļ���ַ
     *
     * @return trans_sender_addr - ������Ϣ�ļ���ַ
     */
    public String getTransSenderAddr() {
        return transSenderAddr;
    }

    /**
     * ����������Ϣ�ļ���ַ
     *
     * @param transSenderAddr ������Ϣ�ļ���ַ
     */
    public void setTransSenderAddr(String transSenderAddr) {
        this.transSenderAddr = transSenderAddr;
    }

    /**
     * ��ȡ������ַ2
     *
     * @return trans_sender_addtuo - ������ַ2
     */
    public String getTransSenderAddtuo() {
        return transSenderAddtuo;
    }

    /**
     * ����������ַ2
     *
     * @param transSenderAddtuo ������ַ2
     */
    public void setTransSenderAddtuo(String transSenderAddtuo) {
        this.transSenderAddtuo = transSenderAddtuo;
    }

    /**
     * ��ȡ������ַ3
     *
     * @return trans_sender_addthree - ������ַ3
     */
    public String getTransSenderAddthree() {
        return transSenderAddthree;
    }

    /**
     * ����������ַ3
     *
     * @param transSenderAddthree ������ַ3
     */
    public void setTransSenderAddthree(String transSenderAddthree) {
        this.transSenderAddthree = transSenderAddthree;
    }

    /**
     * ��ȡ������Ϣ��/ʡ
     *
     * @return trans_sender_province - ������Ϣ��/ʡ
     */
    public String getTransSenderProvince() {
        return transSenderProvince;
    }

    /**
     * ����������Ϣ��/ʡ
     *
     * @param transSenderProvince ������Ϣ��/ʡ
     */
    public void setTransSenderProvince(String transSenderProvince) {
        this.transSenderProvince = transSenderProvince;
    }

    /**
     * ��ȡ������Ϣ�ļ�����
     *
     * @return trans_sender_city - ������Ϣ�ļ�����
     */
    public String getTransSenderCity() {
        return transSenderCity;
    }

    /**
     * ����������Ϣ�ļ�����
     *
     * @param transSenderCity ������Ϣ�ļ�����
     */
    public void setTransSenderCity(String transSenderCity) {
        this.transSenderCity = transSenderCity;
    }

    /**
     * ��ȡ������Ϣ�ļ�����
     *
     * @return trans_sender_country - ������Ϣ�ļ�����
     */
    public String getTransSenderCountry() {
        return transSenderCountry;
    }

    /**
     * ����������Ϣ�ļ�����
     *
     * @param transSenderCountry ������Ϣ�ļ�����
     */
    public void setTransSenderCountry(String transSenderCountry) {
        this.transSenderCountry = transSenderCountry;
    }
}