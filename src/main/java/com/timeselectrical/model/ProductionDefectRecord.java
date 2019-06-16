package com.timeselectrical.model;

import java.util.Date;

/**
 * 生产缺陷记录
 */
public class ProductionDefectRecord {
    /**
     * 注解
     */
    private Integer id;

    /**
     * 缺陷物料-物料序列号
     */
    private String seq;

    /**
     * 缺陷物料-物料编号
     */
    private String bomMatId;

    /**
     * 缺陷现象-产品序列号
     */
    private String sublotId;

    /**
     * lot号(订单号)
     */
    private String lotId;

    /**
     * 缺陷现象-缺陷类型
     */
    private String defectType;

    /**
     * 缺陷现象-缺陷code
     */
    private String defectCode;

    /**
     * 缺陷现象-现象描述
     */
    private String defectComment;

    /**
     * 缺陷物料-物料分类组
     */
    private String matCmf1;

    /**
     * 缺陷物料-位置号
     */
    private String locationNum;

    /**
     * 缺陷物料-物料数量
     */
    private String defCmf2;

    /**
     * 供应商序列号
     */
    private String zgys;

    /**
     * 供应商代码
     */
    private String lifnr;

    /**
     * 物料凭证编号
     */
    private String mblnr;

    /**
     * 是否筛选
     */
    private String zsfsx;

    /**
     * 筛选单位
     */
    private String zsxdw;

    /**
     * 筛选日期
     */
    private Date zsxrq;

    /**
     * 筛选时间
     */
    private Date zsxsj;

    /**
     * 采用筛选方案版本
     */
    private String zsxbb;

    /**
     * 筛选结果
     */
    private String zsxjg;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 筛选日期
     */
    private long zsxrq_long;

    /**
     * 筛选时间
     */
    private long zsxsj_long;

    public long getZsxrq_long() {
        return zsxrq_long;
    }

    public void setZsxrq_long(long zsxrq_long) {
        this.zsxrq_long = zsxrq_long;
    }

    public long getZsxsj_long() {
        return zsxsj_long;
    }

    public void setZsxsj_long(long zsxsj_long) {
        this.zsxsj_long = zsxsj_long;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq == null ? null : seq.trim();
    }

    public String getBomMatId() {
        return bomMatId;
    }

    public void setBomMatId(String bomMatId) {
        this.bomMatId = bomMatId == null ? null : bomMatId.trim();
    }

    public String getSublotId() {
        return sublotId;
    }

    public void setSublotId(String sublotId) {
        this.sublotId = sublotId == null ? null : sublotId.trim();
    }

    public String getLotId() {
        return lotId;
    }

    public void setLotId(String lotId) {
        this.lotId = lotId == null ? null : lotId.trim();
    }

    public String getDefectType() {
        return defectType;
    }

    public void setDefectType(String defectType) {
        this.defectType = defectType == null ? null : defectType.trim();
    }

    public String getDefectCode() {
        return defectCode;
    }

    public void setDefectCode(String defectCode) {
        this.defectCode = defectCode == null ? null : defectCode.trim();
    }

    public String getDefectComment() {
        return defectComment;
    }

    public void setDefectComment(String defectComment) {
        this.defectComment = defectComment == null ? null : defectComment.trim();
    }

    public String getMatCmf1() {
        return matCmf1;
    }

    public void setMatCmf1(String matCmf1) {
        this.matCmf1 = matCmf1 == null ? null : matCmf1.trim();
    }

    public String getLocationNum() {
        return locationNum;
    }

    public void setLocationNum(String locationNum) {
        this.locationNum = locationNum == null ? null : locationNum.trim();
    }

    public String getDefCmf2() {
        return defCmf2;
    }

    public void setDefCmf2(String defCmf2) {
        this.defCmf2 = defCmf2 == null ? null : defCmf2.trim();
    }

    public String getZgys() {
        return zgys;
    }

    public void setZgys(String zgys) {
        this.zgys = zgys == null ? null : zgys.trim();
    }

    public String getLifnr() {
        return lifnr;
    }

    public void setLifnr(String lifnr) {
        this.lifnr = lifnr == null ? null : lifnr.trim();
    }

    public String getMblnr() {
        return mblnr;
    }

    public void setMblnr(String mblnr) {
        this.mblnr = mblnr == null ? null : mblnr.trim();
    }

    public String getZsfsx() {
        return zsfsx;
    }

    public void setZsfsx(String zsfsx) {
        this.zsfsx = zsfsx == null ? null : zsfsx.trim();
    }

    public String getZsxdw() {
        return zsxdw;
    }

    public void setZsxdw(String zsxdw) {
        this.zsxdw = zsxdw == null ? null : zsxdw.trim();
    }

    public Date getZsxrq() {
        return zsxrq;
    }

    public void setZsxrq(Date zsxrq) {
        this.zsxrq = zsxrq;
    }

    public Date getZsxsj() {
        return zsxsj;
    }

    public void setZsxsj(Date zsxsj) {
        this.zsxsj = zsxsj;
    }

    public String getZsxbb() {
        return zsxbb;
    }

    public void setZsxbb(String zsxbb) {
        this.zsxbb = zsxbb == null ? null : zsxbb.trim();
    }

    public String getZsxjg() {
        return zsxjg;
    }

    public void setZsxjg(String zsxjg) {
        this.zsxjg = zsxjg == null ? null : zsxjg.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}